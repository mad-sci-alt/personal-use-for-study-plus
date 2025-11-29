package Properties_;

import java.io.*;

/**
 * @author 张 书航
 */
public class Homework02 {
    public static void main(String[] args) throws IOException {
        String filePath = "d:\\code.txt";
//        BufferedReader br = new BufferedReader(new FileReader(filePath));///按照常规的读取方式中文会乱码
        InputStreamReader isr = new InputStreamReader(new FileInputStream(filePath),"gbk");//指定为文件实际的编码（此处为gbk）
        BufferedReader br = new BufferedReader(isr);
        String line = "";
        int i = 1;
        while ((line = br.readLine()) != null) {
            System.out.println("当前为第" + (i) + "行  " + line);
            i += 1;
        }
        br.close();
    }
}
