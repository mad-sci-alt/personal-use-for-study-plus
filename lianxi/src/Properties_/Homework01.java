package Properties_;

import java.io.*;

/**
 * @author 张 书航
 */
public class Homework01 {
    public static void main(String[] args) throws IOException {
        String fileDir = "d:\\mytemp";
        File file = new File(fileDir);
        if (!file.exists()) {
            if (file.mkdirs()) {
                System.out.println("成功创建多级目录");
            } else System.out.println("创建失败");
        }
        String filePath = fileDir + "\\hello.txt";
        file = new File(filePath);
        if (!file.exists()) {
            if (file.createNewFile()) {
                System.out.println(filePath + " 创建成功！");
            } else {
                System.out.println(filePath + " 创建失败！");
            }
        } else System.out.println(filePath + " 文件已存在，不再重复创建");
        BufferedWriter bw = new BufferedWriter(new FileWriter(filePath));
        bw.write("hello world!");
        System.out.println("写入成功");
        bw.close();

    }
}
