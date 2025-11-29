package IOStream;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

/**
 * @author 张 书航
 */
/// 在d盘下，创建文件news1.txt、news2.txt、news3.txt
/// 用三种不同的方式创建
public class FileHandle {
    public static void main(String[] args) throws IOException {
        FileHandle fC = new FileHandle();
        fC.createFile1();
        fC.createFile2();
        fC.createFile3();

/// newFile2.createNewFile()执行这一句才是在磁盘创建了文件
    }

    @Test
    void createFile1() throws IOException {
        /// 方法一
        File newFile1 = new File("d:\\", "news1.txt");//(String,String)
        if (newFile1.createNewFile()) {
            System.out.println("创建成功");
        } else System.out.println("创建失败");
    }

    @Test
    void createFile2() throws IOException {
        /// 方法二
        File newFile2 = new File("d:\\news2.txt");//(String)
        if (newFile2.createNewFile()) {
            System.out.println("创建成功");
        } else System.out.println("创建失败");
    }

    @Test
    void createFile3() throws IOException {
        /// 方法三
        File file = new File("d:\\");
        File newFile3 = new File(file, "news3.txt");//(File,String)
        if (newFile3.createNewFile()) {
            System.out.println("创建成功");
        } else System.out.println("创建失败");
    }

    @Test
    void getInfo() {
        File file = new File("d:\\news1.txt");
        System.out.println(file.getName());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.length());//返回文件的大小（字节）
        System.out.println(file.getParent());
        System.out.println("是不是一个文件？" + file.isFile());
        System.out.println("是不是一个目录？" + file.isDirectory());
    }
}
