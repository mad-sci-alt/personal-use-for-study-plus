package IOStream;

import org.junit.jupiter.api.Test;

import java.io.File;

/**
 * @author 张 书航
 */
public class Directory_ {
    public static void main(String[] args) {

    }

    @Test
    public void m1() {
        String filePath = "D:\\demo";
        File file = new File(filePath);
        if (file.exists()) {
            if (file.delete()) {
                System.out.println(filePath + " 删除成功");
            }
        } else {
            System.out.println("目标文件不存在");
        }
    }
    @Test
    public void m2() {
        String filePath = "D:\\demo";
        File file = new File(filePath);
        if (file.exists()) {
            System.out.println("目标文件存在");
        } else {
            //如果是连续创建多级新目录就用mkdirs方法
            if (file.mkdir()) {
                System.out.println("创建成功");
            }
        }
        file.delete();
    }
}
