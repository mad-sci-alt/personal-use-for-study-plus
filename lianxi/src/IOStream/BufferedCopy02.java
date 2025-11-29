package IOStream;

import java.io.*;

/**
 * @author 张 书航
 */
public class BufferedCopy02 {
    public static void main(String[] args) {
        String srcPath = "D:\\截图\\Java\\流的继承体系.png";
        String destPath = "D:\\截图\\Java\\流的继承体系-copy.png";
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        byte[] buffer = new byte[1024];
        int readLen;

        try {
            bis = new BufferedInputStream(new FileInputStream(srcPath));
            bos = new BufferedOutputStream(new FileOutputStream(destPath));
            int i = 0;
            while ((readLen = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, readLen);
//                System.out.println(buffer+""+(i++));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bis != null) bis.close();
                if (bos != null) bos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
