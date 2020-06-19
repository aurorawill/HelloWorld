package MyNet.IP.TCP5;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
/*
    服务器：接收到的数据写入文本文件
 */
public class ServerDemo {
    public static void main(String[] args) throws IOException {
        //创建服务器Socket对象
        ServerSocket ss=new ServerSocket(10086);
        //监听客户端连接，返回一个对应的Socket
        Socket s=ss.accept();
        //接收数据
        BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
        //把数据写入文本文件
        BufferedWriter bw=new BufferedWriter(new FileWriter("lib/cn.cast"));
        String line;
        while((line=br.readLine())!=null){   //一直在等待读取数据
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
//        System.out.println("--------------------");
        //给出反馈
        BufferedWriter bwServer=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        bwServer.write("文件上传成功");
        bwServer.newLine();
        bwServer.flush();
        //释放资源
        bw.close();
        ss.close();
    }
}
