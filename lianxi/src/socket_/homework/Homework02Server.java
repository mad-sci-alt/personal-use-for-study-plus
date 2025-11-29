package socket_.homework;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @author 张 书航
 */
public class Homework02Server {
    public static void main(String[] args) throws IOException {
//        byte[] reData = new byte[1024];
//        DatagramSocket socket = new DatagramSocket(8888);
//        DatagramPacket packet =
//                new DatagramPacket(reData, reData.length,
//                        InetAddress.getByName("192.168.156.86"), 9999);
//        socket.receive(packet);
//

        DatagramSocket socket = new DatagramSocket(9999);
        byte[] buf = new byte[1024];
        DatagramPacket packet = new DatagramPacket(buf, buf.length);
        System.out.println("接收端B，等待接收数据...");
        socket.receive(packet);

        int length = packet.getLength();
        byte[] data = packet.getData();
        String s = new String(data, 0, length);
        System.out.println(s);

        if (s.equals("四大名著是哪些")){
            data = "四大名著是《红楼梦》".getBytes();
        }else data = "what?".getBytes();

        packet = new DatagramPacket(data, data.length,
                InetAddress.getByName("192.168.156.86"), 9998);
        socket.send(packet);
/*
        DatagramSocket socket =
                new DatagramSocket(9998);///此处因为发送端和接收端都为本机所以端口号不能相同
        byte[] data = "hello，明天吃火锅".getBytes();
        DatagramPacket packet =
                new DatagramPacket(data, data.length,
                        InetAddress.getByName("192.168.42.86"), 9999);
        socket.send(packet);
 */

        socket.close();
        System.out.println("B端退出");
    }
}
