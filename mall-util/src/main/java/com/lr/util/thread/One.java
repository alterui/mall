package com.lr.util.thread;

/**
 * @author liurui
 * @date 2020/12/7 20:56
 */
import lombok.Synchronized;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * <p>描述: TODO
 * <p>版权: 税友软件集团股份有限公司
 * <p>日期: 2020/12/10 20:53
 * <p>作者: ffb
 */
public class One{
    public static void main(String[] args) {
        ReentrantLock lock =new ReentrantLock();
        Condition charLock =lock.newCondition();
        Condition sLock = lock.newCondition();
        AtomicBoolean flag = new AtomicBoolean(false);//标志位
        String content = "12A34B56C78D910E1112F1314G1516H1718I1920J2122K2324L2526M2728N2930O3132P3334Q353";
        char[] chars = content.toCharArray();
        new Thread( new Thread1(chars,lock,flag,charLock,sLock)).start();
        new Thread( new Thread2(chars,lock,flag,charLock,sLock)).start();
    }
    static class Thread2 implements Runnable{
        private final char[] chars;
        final Condition charLock ;
        Condition sLock ;
        public Thread2(char[] chars, Lock lock, AtomicBoolean flag, Condition charLock, Condition sLock) {
            this.chars = chars;
            this.charLock = charLock;
            this.sLock = sLock;
            System.out.println(charLock.hashCode());
        }
        @Override
        public void run() {
            for (char aChar : chars) {
                if ((aChar <= 'z' && aChar >= 'a') || (aChar <= 'Z' && aChar >= 'A')) {
                    System.out.println(aChar);
                    try {
                        synchronized (Thread2.class) {
                            this.charLock.await();
                            sLock.signal();
                        }

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    static class Thread1 implements Runnable{

        public Thread1(char[] chars, Lock lock, AtomicBoolean flag, Condition charLock, Condition sLock) {
            this.chars = chars;
            this.charLock = charLock;
            this.sLock = sLock;
            System.out.println(charLock.hashCode());
        }
        private final char[] chars;
        Condition charLock  ;
        final Condition sLock  ;
        @Override
        public void run() {
            int count=0;
            for (char aChar : chars) {
                boolean matches = String.valueOf(aChar).matches("[0-9]+");
                if (matches) {
                    System.out.println(aChar);
                    count++;
                    if (count >= 2) {
                        synchronized (Thread1.class) {

                            try {
                                sLock.await();
                                charLock.signal();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }

                        }
                    }
                }
            }
        }
    }

}