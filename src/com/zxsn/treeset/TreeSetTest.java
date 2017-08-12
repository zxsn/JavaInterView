
/**  
* @Title: TreeSetTest.java
* @Package com.zxsn.treeset
* @Description: TODO(用一句话描述该文件做什么)
* @author 追鑫少年
* @date 2017年8月14日
* @version V1.0  
*/

package com.zxsn.treeset;

import java.util.TreeSet;

/**
    * @ClassName: TreeSetTest
    * @Description: TODO(这里用一句话描述这个类的作用)
    * @author 追鑫少年
    * @date 2017年8月14日
    *
    */

public class TreeSetTest {

    /**
        * @Title: main
        * @Description: TODO(这里用一句话描述这个方法的作用)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        TreeSet set = new TreeSet();
        set.add(new Parent(3));
        set.add(new Child());
        set.add(new Parent(4));
        System.out.println(set.size());
    }

}
