
/**  
* @Title: AssertTest.java
* @Package com.huawei.interview
* @Description: TODO(用一句话描述该文件做什么)
* @author 追鑫少年
* @date 2017年8月14日
* @version V1.0  
*/

package com.huawei.interview;

/**
* @ClassName: AssertTest
* @Description: TODO(Assert测试类)
* @author 追鑫少年
* @date 2017年8月14日
*
*/

public class AssertTest {

    /**
        * @Title: main
        * @Description: TODO(这里用一句话描述这个方法的作用)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int i = 0;
        for (i = 0; i < 5; i++) {
            System.out.println(i);
        }

        //假设程序不小心多了一句--i
        --i;
        assert i == 5;
    }

}
