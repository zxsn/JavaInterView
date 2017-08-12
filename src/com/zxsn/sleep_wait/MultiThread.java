
/**  
* @Title: MultiThread.java
* @Package com.zxsn.sleep_wait
* @Description: TODO(用一句话描述该文件做什么)
* @author 追鑫少年
* @date 2017年8月12日
* @version V1.0  
*/

package com.zxsn.sleep_wait;

/**
* @ClassName: MultiThread
* @Description: TODO(这里用一句话描述这个类的作用)
* @author 追鑫少年
* @date 2017年8月12日
*
*/

public class MultiThread {

    /**
        * @Title: main
        * @Description: TODO(这里用一句话描述这个方法的作用)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        new Thread(new Thread1()).start();

        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        new Thread(new Thread2()).start();
    }

    private static class Thread1 implements Runnable {

        /* (非 Javadoc)
        * 
        * 
        * @see java.lang.Runnable#run()
        */

        @Override
        public void run() {
            // //由于这里的 Thread1 和下面的 Thread2 内部 run 方法要用同一对象作为监视器，
            //我们这里 不能用 this，因为在 Thread2 里面的 this 和这个 Thread1 的 this 不是同一个对象。
            //我们 用 MultiThread.class 这个字节码对象，当前虚拟机里引用这个变量时，指向的都是同一个对象。
            synchronized (MultiThread.class) {
                System.out.println("enter thread1...");
                System.out.println("thread1 is waiting");

                try {
                    //释放锁有两种方式，第一种方式是程序自然离开监视器的范围，
                    //也就是离开了 synchronized 关键字管辖的代码范围，另一种方式就是在 synchronized 关键字管辖的代
                    //码内部调用监视器对象的 wait 方法。这里，使用 wait 方法释放锁。
                    MultiThread.class.wait();
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                System.out.println("thread1 is going on...");
                System.out.println("thread1 is being over!");
            }
        }
    }

    private static class Thread2 implements Runnable {

        /* (非 Javadoc)
         * 
         * 
         * @see java.lang.Runnable#run()
         */

        @Override
        public void run() {
            // TODO Auto-generated method stub
            synchronized (MultiThread.class) {
                System.out.println("enter thread2...");
                System.out.println("thread2 notify other thread can release wait status..");
                //由于 notify 方法并不释放锁， 即使 thread2 调用下面的 sleep 方法休息了 10 毫秒，
                //但 thread1 仍然不会执行，因为 thread2 没有释放锁，所以 Thread1 无法得不到锁。
                MultiThread.class.notify();

                System.out.println("thread2 is sleeping ten millisecond...");

                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                System.out.println("thread2 is going on...");
                System.out.println("thread2 is being over!");
            }
        }
    }

}
