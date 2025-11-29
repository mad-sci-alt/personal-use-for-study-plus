package socket_.TCPprogramming.CharacterStream_;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author 张 书航
 * 客户端 字符流TCP
 */
public class CharTCP01Client {
    public static void main(String[] args) throws IOException {
        send();
    }

    static void send() throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(),8888);
        OutputStream os = socket.getOutputStream();
        OutputStreamWriter osw = new OutputStreamWriter(os);
        BufferedWriter bw = new BufferedWriter(osw);
        bw.write("hello,server!");
        bw.newLine();
        bw.flush();///字符流在输出后需要手动刷新才能写入
        socket.shutdownOutput();

        receive(socket);
        bw.close();
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
