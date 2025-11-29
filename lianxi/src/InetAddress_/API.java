package InetAddress_;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

/**
 * @author 张 书航
 */
public class API {
    public static void main(String[] args) throws UnknownHostException {
        //获取本机当前ip
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost);
        //根据指定的主机名获取InetAddress对象
        InetAddress host1 = InetAddress.getByName("mad-sci");
        System.out.println(host1);
        //根据域名获取对象，比如www.bilibili.com对应的对象
        InetAddress host2 =
                InetAddress.getByName("www.bilibili.com");
        System.out.println(host2);
        //通过InetAddress对象获取对应的ip
        String address = host2.getHostAddress();
        System.out.println(address);
        //通过InetAddress对象获取对应的主机名+ip/域名
        String allByName = Arrays.toString(host2.getAllByName("mad-sci"));
        System.out.println(allByName);
    }
}
