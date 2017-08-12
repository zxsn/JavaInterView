
/**  
* @Title: TrimTest.java
* @Package com.zxsn.trim
* @Description: TODO(用一句话描述该文件做什么)
* @author 追鑫少年
* @date 2017年8月14日
* @version V1.0  
*/

package com.zxsn.trim;

/**
    * @ClassName: TrimTest
    * @Description: TODO(编写一个截取字符串的函数，输入为一个字符串 和字节数，输出为按字节截取的字符串，但要保证汉 字不被截取半个，如“我ABC”，4，应该截取“我 AB”，输入“我ABC汉 DEF”，6，应该输出“我ABC"
    * @author 追鑫少年
    * @date 2017年8月14日
    *
    */

public class TrimTest {

    /**
     * @throws Exception 
        * @Title: main
        * @Description: TODO(这里用一句话描述这个方法的作用)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub
        String str = "我ai/喜欢jia利鑫";
        int num = trimGBK(str.getBytes("GBK"), 8);//GBK中汉字占2个字节

        System.out.println(str.substring(0, num));
    }

    /**
    * @Title: trimGBK
    * @Description: TODO(这里用一句话描述这个方法的作用)
    * @param @param bytes
    * @param @param i
    * @param @return    参数
    * @return int    返回类型
    * @throws
    */

    private static int trimGBK(byte[] buf, int n) {
        // TODO Auto-generated method stub
        int num = 0;
        boolean bChineseFirstHalf = false;//标记
       // 汉字截半的话对应字节的 ASC 码为小于 0 的数值
        for (int i = 0; i < n; i++) {
            if (buf[i] < 0 && !bChineseFirstHalf) {
                bChineseFirstHalf = true;
            } else {
                num++;
                bChineseFirstHalf = false;
            }
        }
        return num;
    }

}
