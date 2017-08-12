
/**  
* @Title: ThreadTest.java
* @Package com.huawei.interview
* @Description: TODO(用一句话描述该文件做什么)
* @author 追鑫少年
* @date 2017年8月12日
* @version V1.0  
*/

package com.huawei.interview;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
    * @ClassName: ThreadTest
    * @Description: TODO(synchronized和ava.util.concurrent.locks.Lock的异同)
    * @author 追鑫少年
    * @date 2017年8月12日
    *
    */

public class ThreadTest {
    private int  j;
    private Lock lock = new ReentrantLock();

    /**
        * @Title: main
        * @Description: TODO(这里用一句话描述这个方法的作用)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ThreadTest tt = new ThreadTest();
        for (int i = 0; i < 2; i++) {
            new Thread(tt.new Adder()).start();
            new Thread(tt.new Subtractor()).start();
            ;
        }
    }

    private class Subtractor implements Runnable {

        /* (非 Javadoc)
        * 
        * 
        * @see java.lang.Runnable#run()
        */

        @Override
        public void run() {
            // TODO Auto-generated method stub
            while (true) {
                /*synchronized (ThreadTest.this) {
                    System.out.println("j--="+j--);
                    //这里抛异常了，锁能释放吗？
                }*/
                lock.lock();
                try {
                    System.out.println("j--=" + j--);
                } finally {
                    lock.unlock();
                }
            }
        }

    }

    private class Adder implements Runnable {

        /* (非 Javadoc)
         * 
         * 
         * @see java.lang.Runnable#run()
         */

        @Override
        public void run() {
            // TODO Auto-generated method stub
            while (true) {
                /*synchronized (ThreadTest.this) {
                    System.out.println("j++=" + j++);
                }*/
                lock.lock();
                try {
                    System.out.println("j++=" + j++);
                } finally {
                    // TODO: handle finally clause
                    lock.unlock();
                }
            }
        }

    }
}
