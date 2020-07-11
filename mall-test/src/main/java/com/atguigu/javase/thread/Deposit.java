package com.atguigu.javase.thread;

public class Deposit implements Runnable {

    private Account account;
    public boolean over = false;

    public boolean isOver() {
        return over;
    }

    public void setOver(boolean over) {
        this.over = over;
    }

    public Deposit(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            synchronized ("aa") { // 锁对象 选取全局唯一常量对象最稳妥.
                account.setBalance(account.getBalance() + (int)(Math.random()*1000));
                System.out.println(Thread.currentThread().getName() + " 存完钱后 : " + account);
                "aa".notify(); // 锁对象调用, 作用仅仅是提醒等待的线程结束等待
            } // 放锁
            try {
                // 睡一会儿的目的是别抢锁
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            over = true;
        }
    }
}
