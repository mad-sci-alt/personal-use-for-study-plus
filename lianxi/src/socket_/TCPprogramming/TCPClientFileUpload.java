package socket_.TCPprogramming;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author 张 书航
 */
public class TCPClientFileUpload {
    public static void main(String[] args) throws Exception {
        send();
    }

    static void send() throws Exception {
        String filePath = "D:\\字符串相关类的用法.png";
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(filePath));

//        int readLen;
//        byte[] buf = new byte[1024];
        byte[] bytes = StreamUtils.streamToByteArray(bis);///用同包导入的StreamUtils获取图片字节数组数据
        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
//        bw.write("hello,server!");
        bos.write(bytes);
//        bos.flush();///字符流在输出后需要手动刷新才能写入
        bis.close();
        socket.shutdownOutput();


        receive(socket);
        bos.close();
        socket.close();
    }

    static void receive(Socket socket) throws IOException {
        InputStream is = socket.getInputStream();
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        System.out.println(br.readLine());

        br.close();
    }
}
