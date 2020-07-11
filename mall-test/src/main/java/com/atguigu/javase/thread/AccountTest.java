package com.atguigu.javase.thread;

/**
 * 多线程的安全问题 :
 * 两个同 :
 *      同时修改
 *      同一数据
 *
 * wait() : 消费者在消费时发现共享资源不够消费, 需要等待, 同时放锁, 把执行机会交给生产者, 生产者修改共享数据
 * notify() : 生产者在生产完毕后调用这个方法, 提醒正在等待的消费者结束等待, 消费者虽然结束了等待, 但是仍然需要等锁
 * notifyAll() : 唤醒所有等待的消费者线程
 *
 */
/*
取钱要取随机的1000以内的金额
存钱也是存的是随机的1000以内的金额

各存取100次, 保证余额不要出现负数.
*/
public class AccountTest {

    public static void main(String[] args) {
        Account acc = new Account("张三", 0);
        Deposit runner1 = new Deposit(acc);
        Runnable runner2 = new Withdraw(acc, runner1);

//        Runnable runner2 = new Withdraw(acc);
        Thread thread3 = new Thread(runner2);
        thread3.setName("取钱柜台1");
        thread3.start();


        Thread thread1 = new Thread(runner1);
        thread1.setName("存钱柜台1");
        thread1.start();





        /*
        Thread thread2 = new Thread(runner1);
        thread2.setName("存钱柜台2");
        thread2.start();
        */


    }
}
