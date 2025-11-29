package socket_.homework;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author 张 书航
 */
public class Homework01Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        OutputStream os = socket.getOutputStream();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
        bw.write("what's your name?");
        bw.newLine();
        bw.flush();
//        socket.shutdownOutput();

        InputStream is = socket.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        byte[] buf = new byte[1024];
        String s = "";
        if ((s = br.readLine()) != null) {/// 此处while循环被我改成了if，测试结果表明，此处的while循环不能被终止，只能用if，但是这样改就只能读取一行，待优化
            System.out.println(s);
        }

        bw.close();
        br.close();
        socket.close();
    }
}
