package socket_.TCPprogramming.ByteStream_;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author 张 书航
 * 服务端
 */
public class SocketTCP01Server {
    public static void main(String[] args) throws IOException {
        //        1.服务器端监听9999服务端口
        ServerSocket serverSocket = new ServerSocket(9999);
        receive(serverSocket);

    }

    static void receive(ServerSocket serverSocket) throws IOException {

//        2.当没有客户端连接9999端口时，程序会阻塞，等待连接
        System.out.println("服务器，在9999端口监听，等待连接...");
        Socket socket = serverSocket.accept();
        System.out.println(socket.getClass());
//        3.通过socket.getInputStream()获取输入流，
//        通过输入流读取客户端的请求（输出流）写入到数据并显示
        InputStream is = socket.getInputStream();
        InputStreamReader isr = new InputStreamReader(is);
//        while ((readLen = isr.read()) != -1) {
//            System.out.print((char) readLen);
//        }
        int readLen = 0;
        byte[] buf = new byte[1024];
        System.out.println("收到来自客户端的消息：");
        while ((readLen = is.read(buf)) != -1) {
            System.out.print(new String(buf, 0, readLen));
        }
        send(serverSocket,socket);
        isr.close();
        socket.close();
        serverSocket.close();
    }

    static void send(ServerSocket serverSocket,Socket socket) throws IOException {
//        Socket sendBackSocket = new Socket(InetAddress.getLocalHost(), 9998);
        OutputStream os = socket.getOutputStream();
//        OutputStreamWriter osw = new OutputStreamWriter(os);
        os.write("hello，客户端！".getBytes());
        socket.shutdownOutput();

        os.close();

    }
}
