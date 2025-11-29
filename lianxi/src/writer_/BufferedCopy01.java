package writer_;

import java.io.*;

/**
 * @author 张 书航
 * 注意BufferedReader和BufferedWriter是按照字符的方式操作文件
 * 本程序在用字符流进行操作二进制文件时（如音频文件、视频文件、doc、pdf等），会造成文件损坏
 * 操作二进制文件用字节流
 */
public class BufferedCopy01 {
    public static void main(String[] args) {
        String srcPath = "d:\\code.txt";
        String destPath = "d:\\code_copy.txt";
        BufferedReader br = null;
        BufferedWriter bw = null;
        String line = null;
        try {
            br = new BufferedReader(new FileReader(srcPath));
            bw = new BufferedWriter(new FileWriter(destPath));
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (br != null) br.close();
                if (bw != null) bw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
