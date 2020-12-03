package com.lr.interview;

import java.util.Random;

/**
 * @author liurui
 * @date 2020/11/12 21:53
 */
public class ProductConsumer{
    public static void main(String[] args) {
        Clerk clerk=new Clerk();
        Consumer t2 = new Consumer(clerk);


        Producer t1=new Producer(clerk);

        t2.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t1.start();
    }
}


//店员
class Clerk{
    private int number=0;
    Random rand=new Random();

    public synchronized  void ProduceProduct() throws InterruptedException {
        if(number<20){
            Thread.sleep(rand.nextInt(500)+1);             //这里写
            number++;
            System.out.println("生产者正在生产第"+number+"个产品");
            notify();
            Thread.yield();
        }else{
            wait();
        }
    }

    public synchronized void ConsumeProduct(){
        if(number>0){
            try {
                Thread.sleep(rand.nextInt(500)+1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("消费者正在消费第"+number+"个产品");
            number--;

            notify();
            Thread.yield();

        }else{
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

//生产者
class  Producer extends Thread{
    private  Clerk clerk;
    public Producer(Clerk clerk){
        this.clerk=clerk;
    }
    public void run(){
        System.out.println("生产者开始生产产品...................................");
        while(true){
            try {
                clerk.ProduceProduct();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

//消费者
class  Consumer extends Thread{
    private  Clerk clerk;
    public Consumer(Clerk clerk){
        this.clerk=clerk;
    }
    public void run(){
        System.out.println("消费者开始消费产品...................................");
        while(true){
            clerk.ConsumeProduct();
        }
    }
}
