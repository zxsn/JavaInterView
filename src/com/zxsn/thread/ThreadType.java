
/**  
* @Title: Test.java
* @Package com.zxsn
* @Description: TODO(用一句话描述该文件做什么)
* @author 追鑫少年
* @date 2017年8月11日
* @version V1.0  
*/

package com.zxsn.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
    * @ClassName: Test
    * @Description: TODO(这里用一句话描述这个类的作用)
    * @author 追鑫少年
    * @date 2017年8月11日
    *
    */

public class ThreadType {

    /**
        * @Title: main
        * @Description: TODO(这里用一句话描述这个方法的作用)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    public static void main(String[] args) {
        //方法一：
        new Thread() {
            public void run() {

            }
        }.start();

        //方法二：
        new Thread(new Runnable() {

            @Override
            public void run() {
                // TODO Auto-generated method stub

            }
        }).start();

        //方法三（多线程）：
        ExecutorService pool = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 10; i++) {
            pool.execute(new Runnable() {

                @Override
                public void run() {
                    // TODO Auto-generated method stub

                }
            });
        }

        //方法四：
        Executors.newCachedThreadPool().execute(new Runnable() {

            @Override
            public void run() {
                // TODO Auto-generated method stub

            }
        });

        //方法五：
        Executors.newSingleThreadExecutor().execute(new Runnable() {

            @Override
            public void run() {
                // TODO Auto-generated method stub

            }
        });
    }

}
