package IOStream;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author 张 书航
 */
public class FileInputStream_ {
    public static void main(String[] args) throws IOException {

    }

    /// 字节流
    @Test
    void byteStream() throws IOException {
        String path = "d:\\hello.txt";
        new File(path).createNewFile();
        FileInputStream dIS = new FileInputStream(path);
        int readData;
        while ((readData = dIS.read()) != -1) {
            System.out.print((char) readData);
        }
        dIS.close();
    }

    ///字节流的默认输入方式只能一个字节一个字节输入，
    /// 如果要正确地 显示中文内容（三个字节存储一个汉字）
    /// 就要一次输入多个字节，则需要使用字节数组
    @Test
    void MixedStream() throws IOException {
        String path = "d:\\hello.txt";
        new File(path).createNewFile();
        byte[] buf = new byte[3];
        FileInputStream dIS = new FileInputStream(path);
        int readLen;
        while ((readLen = dIS.read(buf)) != -1) {
            System.out.print(new String(buf, 0, readLen));
        }
        dIS.close();
    }
}
