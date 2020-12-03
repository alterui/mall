package com.lr.interview;

/**
 * @author liurui
 * @date 2020/11/8 22:30
 */
public class WindowTicket {
    public static void main(String[] args) {
        Window window1=new Window();
        Thread t1=new Thread(window1);
        Thread t2=new Thread(window1);
        Thread t3=new Thread(window1);
        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");
        t1.start();
        t2.start();
        t3.start();



    }

}

class Window implements  Runnable {
    private int ticket = 100;
    private  Object  obj1 = new Object();

    @Override
    public void run() {
        while (true) {

            /*try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/

            synchronized (obj1) {


                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + "售出一张票，票号为：" + ticket);
                    ticket--;
                } else {
                    break;
                }
                try{
                    Thread.sleep(5000);
                }catch (InterruptedException e)
                {
                    System.out.println("出现异常");
                }
            }
        }
    }
}