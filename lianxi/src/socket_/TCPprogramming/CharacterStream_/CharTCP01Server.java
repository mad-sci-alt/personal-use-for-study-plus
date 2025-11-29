package socket_.TCPprogramming.CharacterStream_;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author 张 书航
 * 服务端
 */
public class CharTCP01Server {
    public static void main(String[] args) throws IOException {
        receive();
    }

    static void receive() throws IOException {
        ServerSocket serverSocket = new ServerSocket(8888);
        Socket socket = serverSocket.accept();
        InputStream is = socket.getInputStream();
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        System.out.println(br.readLine());

        send(serverSocket,socket);
        br.close();
        socket.close();
    }

    static void send(ServerSocket ss,Socket s) throws IOException {
        OutputStream os = s.getOutputStream();
        OutputStreamWriter osr = new OutputStreamWriter(os);
        BufferedWriter bw = new BufferedWriter(osr);
        bw.write("hello，client！");
        bw.flush();///字符流在输出后需要手动刷新才能写入
        s.shutdownOutput();

        bw.close();
    }
}
