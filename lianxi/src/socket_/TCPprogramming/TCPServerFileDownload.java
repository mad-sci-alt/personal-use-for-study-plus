package socket_.TCPprogramming;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author 张 书航
 */
@SuppressWarnings("all")
public class TCPServerFileDownload {
    public static void main(String[] args) throws Exception {
        receive();
    }

    static void receive() throws Exception {
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("图片存入服务在9999端口等待连接中...");
        Socket socket = serverSocket.accept();
        String savePath = "src\\字符串的用法（再次存入）.jpg";
        BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
//        InputStreamReader isr = new InputStreamReader(is);
//        BufferedReader br = new BufferedReader(isr);
        byte[] bytes = StreamUtils.streamToByteArray(bis);
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(savePath));
        bos.write(bytes);
        System.out.println("图片保存成功!");
        bos.close();

        send(serverSocket, socket);
        bis.close();
        socket.close();
        serverSocket.close();
    }

    static void send(ServerSocket ss, Socket s) throws IOException {
        OutputStream os = s.getOutputStream();
        OutputStreamWriter osr = new OutputStreamWriter(os);
        BufferedWriter bw = new BufferedWriter(osr);
        bw.write("已收到您上传的图片！");
        bw.flush();///字符流在输出后需要手动刷新才能写入
        s.shutdownOutput();

        bw.close();
    }
}
