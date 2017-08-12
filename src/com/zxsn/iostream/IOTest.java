
/**  
* @Title: IOTest.java
* @Package com.zxsn.iostream
* @Description: TODO(用一句话描述该文件做什么)
* @author 追鑫少年
* @date 2017年8月14日
* @version V1.0  
*/

package com.zxsn.iostream;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
    * @ClassName: IOTest
    * @Description: TODO(字节流与字符流关系)
    * @author 追鑫少年
    * @date 2017年8月14日
    *
    */

public class IOTest {

    /**
     * @throws Exception 
        * @Title: main
        * @Description: TODO(这里用一句话描述这个方法的作用)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    @SuppressWarnings("resource")
    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub
        String str = "中国人";

        //输入/写入（3种方法）
        FileOutputStream fos = new FileOutputStream("1.txt");
        fos.write(str.getBytes("UTF-8"));
        fos.close();

        FileWriter fw = new FileWriter("2.txt");
        fw.write(str);
        fw.close();

        PrintWriter pw = new PrintWriter("3.txt", "UTF-8");
        pw.write(str);
        pw.close();

        //输出/读取（效率越来越高）
        FileInputStream fis = new FileInputStream("1.txt");
        byte[] buf = new byte[1024];
        int len = fis.read(buf);
        String myStr = new String(buf, 0, len, "UTF-8");
        System.out.println(myStr);

        FileReader fr = new FileReader("2.txt");
        char[] cbuf = new char[1024];
        int len1 = fr.read(cbuf);
        String myStr1 = new String(cbuf, 0, len1);
        System.out.println(myStr1);

        BufferedReader br = new BufferedReader(
            new InputStreamReader(new FileInputStream("3.txt"), "UTF-8"));
        String myStr2 = br.readLine();
        br.close();
        System.out.println(myStr2);
    }

}
