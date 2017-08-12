
/**  
* @Title: Child.java
* @Package com.zxsn.treeset
* @Description: TODO(用一句话描述该文件做什么)
* @author 追鑫少年
* @date 2017年8月14日
* @version V1.0  
*/

package com.zxsn.treeset;

/**
* @ClassName: Child
* @Description: TODO(这里用一句话描述这个类的作用)
* @author 追鑫少年
* @date 2017年8月14日
*
*/

public class Child extends Parent {

    /**
     * 创建一个新的实例 Child.
     *
     * @param age
     */

    public Child() {
        super(3);
        // TODO Auto-generated constructor stub
    }

    public int compareTo(Object o) {
        System.out.println("method of child");
        // Child ol = (Child) o;
        return 1;

    }
}
