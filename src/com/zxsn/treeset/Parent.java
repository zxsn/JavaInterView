
/**  
* @Title: Parent.java
* @Package com.zxsn.treeset
* @Description: TODO(用一句话描述该文件做什么)
* @author 追鑫少年
* @date 2017年8月14日
* @version V1.0  
*/

package com.zxsn.treeset;

/**
* @ClassName: Parent
* @Description: TODO(这里用一句话描述这个类的作用)
* @author 追鑫少年
* @date 2017年8月14日
*
*/

@SuppressWarnings("rawtypes")
public class Parent implements Comparable {
    private int age = 0;

    /* (非 Javadoc)
    * 
    * 
    * @param o
    * @return
    * @see java.lang.Comparable#compareTo(java.lang.Object)
    */

    /**
     * 创建一个新的实例 Parent.
     *
     * @param age
     */

    public Parent(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Object o) {
        // TODO Auto-generated method stub
        System.out.println("method of parent");
        Parent ol = (Parent) o;
        return age > ol.age ? 1 : age < ol.age ? -1 : 0;
    }

}
