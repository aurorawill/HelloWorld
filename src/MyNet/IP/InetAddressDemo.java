package MyNet.IP;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo {
    public static void main(String args[]) throws UnknownHostException {
        //public static InetAddress getByName(String host),确定主机名称的IP地址。主机名称可以是机器名称，也可以是IP地址
        InetAddress address=InetAddress.getByName("192.168.1.108");

        //public String getHostName();   获取此IP地址的主机名
        String name=address.getHostName();

        //public String getHostAddress();  返回文本显示中的IP地址字符串
        String ip = address.getHostAddress();
        System.out.println("主机名："+name);
        System.out.println("ip地址："+ip);

    }
}
