package socket_.UDPprogramming;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @author 张 书航
 */
public class UDPReceiverB {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(9999);
        byte[] buf = new byte[1024];
        DatagramPacket packet = new DatagramPacket(buf, buf.length);
        System.out.println("接收端B，等待接收数据...");
        socket.receive(packet);

        int length = packet.getLength();
        byte[] data = packet.getData();
        String s = new String(data, 0, length);
        System.out.println(s);

        data = "抱歉，我明天有事，改天吧！".getBytes();
        packet = new DatagramPacket(data, data.length,
                InetAddress.getByName("192.168.220.86"), 9998);
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
