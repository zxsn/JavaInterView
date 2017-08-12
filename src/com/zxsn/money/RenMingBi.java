
/**  
* @Title: RenMingBi.java
* @Package com.zxsn.money
* @Description: TODO(用一句话描述该文件做什么)
* @author 追鑫少年
* @date 2017年8月15日
* @version V1.0  
*/

package com.zxsn.money;

/**
* @ClassName: RenMingBi
* @Description: TODO(金额转换：阿拉伯数字的金额转换成中国传统的形式：（￥1011）－>（一千零一拾一元整）输出。)
* @author 追鑫少年
* @date 2017年8月15日
*
*/

public class RenMingBi {
    private static final char[] data  = new char[] { '零', '壹', '贰', '叁', '肆', '伍', '陆', '柒', '捌',
                                                     '玖' };
    private static final char[] units = new char[] { '元', '拾', '佰', '仟', '万', '拾', '佰', '仟', '亿' };

    /**
        * @Title: main
        * @Description: TODO(这里用一句话描述这个方法的作用)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int i = 135689123;
        System.out.println("金额：" + i);
        System.out.println("转换后：" + convert(i));

    }

    /**
     * 
    * @Title: convert
    * @Description: TODO(这里用一句话描述这个方法的作用)
    * @param @param money
    * @param @return    参数
    * @return String    返回类型
    * @throws
     */
    public static String convert(int money) {
        StringBuffer sbf = new StringBuffer();
        int unit = 0;
        while (money != 0) {
            sbf.insert(0, units[unit++]);
            int number = money % 10;
            sbf.insert(0, data[number]);
            money /= 10;
        }
        return sbf.toString();
    }

}
