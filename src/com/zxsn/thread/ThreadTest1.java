
/**  
* @Title: ThreadTest1.java
* @Package com.zxsn.thread
* @Description: TODO(用一句话描述该文件做什么)
* @author 追鑫少年
* @date 2017年8月12日
* @version V1.0  
*/

package com.zxsn.thread;

/**
* @ClassName: ThreadTest1
* @Description: TODO(设计4个线程，其中两个线程每次对j增加1，另外两个线程对j每次减少1。)
* @author 追鑫少年
* @date 2017年8月12日
*
*/

public class ThreadTest1 {
    private int j;

    /**
        * @Title: main
        * @Description: TODO(这里用一句话描述这个方法的作用)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ThreadTest1 tt = new ThreadTest1();
        Inc inc = tt.new Inc();
        Dec dec = tt.new Dec();

        for (int i = 0; i < 2; i++) {
            Thread t = new Thread(inc);
            t.start();
            t = new Thread(dec);
            t.start();
        }
    }

    private synchronized void inc() {
        j++;
        System.out.println(Thread.currentThread().getName() + "+inc:" + j);
    }

    private synchronized void dec() {
        j--;
        System.out.println(Thread.currentThread().getName() + "-dec:" + j);
    }

    class Inc implements Runnable {

        /* (非 Javadoc)
        * 
        * 
        * @see java.lang.Runnable#run()
        */

        @Override
        public void run() {
            // TODO Auto-generated method stub
            for (int i = 0; i < 100; i++) {
                inc();
            }
        }

    }

    class Dec implements Runnable {

        /* (非 Javadoc)
        * 
        * 
        * @see java.lang.Runnable#run()
        */

        @Override
        public void run() {
            // TODO Auto-generated method stub
            for (int i = 0; i < 100; i++) {
                dec();
            }
        }

    }
}
