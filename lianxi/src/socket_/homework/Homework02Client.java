package socket_.homework;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @author 张 书航
 */
public class Homework02Client {
    public static void main(String[] args) throws IOException {
//        DatagramSocket socket = new DatagramSocket(8888);
//        byte[] data = "四大名著是哪些".getBytes();
//        DatagramPacket packet =
//                new DatagramPacket(data, data.length,
//                        InetAddress.getByName("192.168.156.86"),9999);
//        socket.send(packet);

        DatagramSocket socket =
                new DatagramSocket(9998);///此处因为发送端和接收端都为本机所以端口号不能相同
        byte[] data = "四大名著是哪些".getBytes();
        DatagramPacket packet =
                new DatagramPacket(data, data.length,
                        InetAddress.getByName("192.168.156.86"), 9999);
        ///⚠️此处InetAddress.getByName内参数是写死的，但是个人主机的IP地址随时随地都在变换，所以再发送之前需要确认双方的IP地址，才能正确运行
        socket.send(packet);

        byte[] buf = new byte[1024];
        packet = new DatagramPacket(buf, buf.length);
        socket.receive(packet);
        int length = packet.getLength();
        data = packet.getData();
        String s = new String(data, 0, length);
        System.out.println(s);

        socket.close();
        System.out.println("A端退出");
    }
}
