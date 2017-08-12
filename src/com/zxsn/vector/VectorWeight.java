
/**  
* @Title: VectorWeight.java
* @Package com.zxsn.vector
* @Description: TODO(用一句话描述该文件做什么)
* @author 追鑫少年
* @date 2017年8月13日
* @version V1.0  
*/

package com.zxsn.vector;

import java.util.HashSet;
import java.util.Vector;

/**
    * @ClassName: VectorWeight
    * @Description: TODO(去掉一个Vector集合中重复的元素)
    * @author 追鑫少年
    * @date 2017年8月13日
    *
    */

public class VectorWeight {

    /**
        * @Title: main
        * @Description: TODO(这里用一句话描述这个方法的作用)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    @SuppressWarnings({ "unchecked", "rawtypes" })
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Vector vector = new Vector();
        vector.add("aa");
        vector.add("bb");
        vector.add("aa");
        vector.add("dd");
        vector.add("ee");

        //方法一：遍历查找
        Vector newVector = new Vector();
        for (int i = 0; i < vector.size(); i++) {
            Object result = vector.get(i);
            if (!newVector.contains(result)) {
                newVector.add(result);
            }
        }

        //方法二：Set集合不允许存储重复的元素
        HashSet set = new HashSet(vector);

        //打印输出
        for (int j = 0; j < newVector.size(); j++) {
            System.out.println("第【" + (j + 1) + "】个元素：" + newVector.get(j));
        }

        System.out.println("\n---------------------------------\n");
        System.out.println(set);

    }

}
