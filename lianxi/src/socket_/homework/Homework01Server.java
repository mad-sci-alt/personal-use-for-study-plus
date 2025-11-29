package socket_.homework;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author 张 书航
 */
public class Homework01Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        Socket socket = serverSocket.accept();
        InputStream is = socket.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
//        byte[] buf = new byte[1024];
//        int readLen;
        String s = "";
        if ((s = br.readLine()) != null) {
            System.out.println(s);
//            s = new String(buf, 0, readLen);
        }

        OutputStream os = socket.getOutputStream();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
        switch (s) {
            case "what's your name?":
                bw.write("我是张书航");
                break;
            case "what's your hobby":
                bw.write("编写Java程序");
                break;
            default:
                bw.write("你说啥呢叽叽歪歪");
                break;
        }
        bw.newLine();
        bw.flush();

        bw.close();
        br.close();
        socket.close();
    }
}

//public class Homework01Server {
//    public static void main(String[] args) throws IOException {
//        ServerSocket serverSocket = new ServerSocket(9999);
//        Socket socket = serverSocket.accept();
//        InputStream is = socket.getInputStream();
//        BufferedReader br = new BufferedReader(new InputStreamReader(is));
/// /        byte[] buf = new byte[1024];
/// /        int readLen;
//        String s = "";
//        while ((s = br.readLine()) != null) {
//            System.out.println(s);
////            s = new String(buf, 0, readLen);
//        }
//
//        OutputStream os = socket.getOutputStream();
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
//        switch (s) {
//            case "what's your name?":
//                bw.write("我是张书航");
//                break;
//            case "what's your hobby":
//                bw.write("编写Java程序");
//                break;
//            default:
//                bw.write("你说啥呢叽叽歪歪");
//                break;
//        }
//        bw.newLine();
//        bw.flush();
//
//        bw.close();
//        socket.close();
//    }
//}
