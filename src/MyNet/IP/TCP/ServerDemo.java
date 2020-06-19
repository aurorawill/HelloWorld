package MyNet.IP.TCP;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
    TCP接收数据的步骤
        1、创建服务器端的Socket对象（ServerSocket)
        2、获取输入流，读数据，并把数据显示在控制台
        3、释放资源
 */
public class ServerDemo {
    public static void main(String[] args) throws IOException {
        //1、创建服务器端的Socket对象（ServerSocket)
        ServerSocket ss=new ServerSocket(10087);

        Socket s = ss.accept();
        //2、获取输入流，读数据，并把数据显示在控制台
        InputStream is = s.getInputStream();
        byte[] bys=new byte[1024];
        int len=is.read(bys);
        String data=new String(bys,0,len);
        System.out.println("数据数："+data);
        //3、释放资源
        s.close();
        ss.close();
    }
}
