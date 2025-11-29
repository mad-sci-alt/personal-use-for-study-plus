package IOStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author 张 书航
 */
public class FileCopy {

    public static void main(String[] args) {
        String srcFilePath = "D:\\字符串相关类的用法.png";
        String destFilePath = "D:\\xuexi\\字符串用法.jpg";
        FileInputStream fIS = null;
        FileOutputStream fOS = null;
        byte[] buf = new byte[1024];
        int readLen;
        try {
            fIS = new FileInputStream(srcFilePath);
            fOS = new FileOutputStream(destFilePath);
            while ((readLen = (fIS.read(buf))) != -1) {//边读边写
                fOS.write(buf, 0, readLen);
                //形参为(byte[],int,int)的write方法可以保证我们的输入流文件能被完整的输出，
                // 不会因为输入流文件没有被读完就结束输出（这种情况会出现在byte数组大小不够的情况，
                // 我追了源码后发现在native方法止步了，JVM虚拟机估计在这里有一个扩容机制）
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fIS != null){
                try {
                    fIS.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if (fOS != null){
                try {
                    fOS.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }
/*
public static void main(String[] args) throws IOException {
        FileInputStream fIS = null;
        FileOutputStream fOS = null;
        byte[] buf = new byte[1024];
        String srcFilePath = "D:\\字符串相关类的用法.png";
        String destFilePath = "D:\\xuexi\\字符串相关类的用法.png";
        inputFile(srcFilePath, fIS, buf);
        outputFile(destFilePath, fOS, fIS, buf);
    }

    static void inputFile(String path, FileInputStream fIS, byte[] buf) throws IOException {

        if (fIS == null) {
            fIS = new FileInputStream(path);
        }

        int readLen;
        String append = "";
        while ((readLen = fIS.read(buf)) != -1) {
//            System.out.print(new String(buf, 0, readLen));
            append += new String(buf, 0, readLen);
        }
        System.out.println(append);
        fIS.close();
    }

    static void outputFile(String path, FileOutputStream fOS, FileInputStream fIS, byte[] buf) throws IOException {
        if (fOS == null) fOS = new FileOutputStream(path);
        fOS.write(buf, 0, buf.length);
    }
 */


}
