package socket_.TCPprogramming.ByteStream_;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author 张 书航
 * 客户端
 *
 */
/// TCP字节流编程
@SuppressWarnings("all")
public class SocketTCP01Client {
    public static void main(String[] args) throws IOException {
        send();

    }

    static void send() throws IOException {
        //      1.连接服务端 IP+端口
//        连接本机的 9999端口，如果连接成功，返回Socket对象
        Socket socket = new Socket
                (InetAddress.getLocalHost(), 9999);
        System.out.println("客户端 socket返回=" + socket.getClass());
        OutputStream os = socket.getOutputStream();
//        OutputStreamWriter osw = new OutputStreamWriter(os);
        os.write("hello,服务器".getBytes());
        socket.shutdownOutput();

        receive(socket);
        os.close();
        socket.close();
    }

    static void receive(Socket socket) throws IOException {
//        ServerSocket serverSocket = new ServerSocket(9998);
//        Socket socket = serverSocket.accept();
        InputStream is = socket.getInputStream();
//        InputStreamReader isr = new InputStreamReader(is);
        byte[] buf = new byte[1024];
        int readLen = 0;
        System.out.println("收到来自服务端的消息：");
        while ((readLen = is.read(buf)) != -1) {
            System.out.print(new String(buf, 0, readLen));
        }
        is.close();

        socket.close();
    }
}
