
/**  
* @Title: Statistics.java
* @Package com.zxsn.stringquestion
* @Description: TODO(用一句话描述该文件做什么)
* @author 追鑫少年
* @date 2017年8月15日
* @version V1.0  
*/

package com.zxsn.stringquestion;

/**
* @ClassName: Statistics
* @Description: TODO(如果一串字符如"aaaabbc中国1512"要分别统计英文字符的数量，中文字符的数量，和数字字符的数量，假设字符中没有中文字符、英文字符、数字字符之外的
其他特殊字符。)
* @author 追鑫少年
* @date 2017年8月15日
*
*/

public class Statistics {

    /**
        * @Title: main
        * @Description: TODO(这里用一句话描述这个方法的作用)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        String str = "woailixin1314追鑫少年H";

        int engishCount = 0;
        int chineseCount = 0;
        int digitCount = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= '0' && ch <= '9') {
                digitCount++;
            } else if (ch <= 'a' && ch <= 'z' || (ch > 'A' && ch <= 'Z')) {
                engishCount++;
            } else {
                chineseCount++;
            }
        }
        System.out.println(str + "中，数字有【" + digitCount + "】个，英文字母有【" + engishCount + "】个，中文有【"
                           + chineseCount / 3 + "】个。");//TUTF-8一个汉字等于3个字节 
    }

}
