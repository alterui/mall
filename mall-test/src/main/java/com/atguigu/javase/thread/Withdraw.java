package com.atguigu.javase.thread;

public class Withdraw implements Runnable {

    private Account account;
    private Deposit deposit;

    public Withdraw(Account account) {
        this.account = account;
    }

    public Withdraw(Deposit deposit) {
        this.deposit = deposit;
    }

    public Withdraw(Account account, Deposit deposit) {
        this.account = account;
        this.deposit = deposit;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            synchronized ("aa") {
                int rmb = (int)(Math.random()*1000);
//                if ( account.getBalance() < rmb) {
//                    try {
//                        System.out.println("钱不够, 进入等待....");
//                        "aa".wait(); // 必须由锁对象调用, 放锁并进入等待状态
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
                boolean flag = true;
                while(flag){
                    if ( account.getBalance() < rmb) {
                        try {
                            if (deposit.over) {
                                return;
                            }
                            System.out.println("钱不够, 进入等待....");
                            "aa".wait(); // 必须由锁对象调用, 放锁并进入等待状态
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }else{
                        break;
                    }
                }
                account.setBalance(account.getBalance() - rmb);
                System.out.println(Thread.currentThread().getName() + " 取完钱后 : " + account);
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
