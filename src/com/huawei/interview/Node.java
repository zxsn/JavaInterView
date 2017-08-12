
/**  
* @Title: Node.java
* @Package com.huawei.interview
* @Description: TODO(用一句话描述该文件做什么)
* @author 追鑫少年
* @date 2017年8月15日
* @version V1.0  
*/

package com.huawei.interview;

import java.util.Arrays;

/**
* @ClassName: Node
* @Description: TODO(Java实现二叉树)
* @author 追鑫少年
* @date 2017年8月15日
*
*/

public class Node {
    private Node left;
    private Node right;
    private int  value;

    /**
     * 创建一个新的实例 Node.
     *
     * @param value
     */

    public Node(int value) {
        super();
        this.value = value;
    }

    public void add(int value) {
        if (value > this.value) {
            if (right != null) {
                right.add(value);
            } else {
                Node node = new Node(value);
                right = node;
            }
        } else {
            if (left != null) {
                left.add(value);
            } else {
                Node node = new Node(value);
                left = node;
            }
        }
    }

    public boolean find(int value) {
        if (value == this.value)
            return true;
        else if (value > this.value) {
            if (right == null)
                return false;
            else
                return right.find(value);
        } else {
            if (left == null)
                return false;
            else
                return left.find(value);
        }
    }

    public void display() {
        System.out.println(value);
        if (left != null)
            left.display();
        if (right != null)
            right.display();
    }

    /**
        * @Title: main
        * @Description: TODO(这里用一句话描述这个方法的作用)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] values = new int[8];
        for (int i = 0; i < 8; i++) {
            int num = (int) (Math.random() * 15);
            if (!contains(values, num)) {
                values[i] = num;
            } else {
                i--;
            }

        }
        System.out.println(Arrays.toString(values));

        Node root = new Node(values[0]);
        for (int i = 1; i < values.length; i++) {
            root.add(values[i]);
        }

        System.out.println(root.find(13));
        root.display();
    }

    /**
    * @Title: contains
    * @Description: TODO(这里用一句话描述这个方法的作用)
    * @param @param values
    * @param @param num
    * @param @return    参数
    * @return boolean    返回类型
    * @throws
    */

    private static boolean contains(int[] values, int num) {
        // TODO Auto-generated method stub
        int i = 0;
        for (; i < values.length; i++) {
            if (values[i] == num) {
                return true;
            }
        }
        return false;
    }

}
