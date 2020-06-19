package study1;
import java.io.*;
public class text9 {
    public static void main(String args[]) throws Exception{
        FileInputStream fis=new FileInputStream("lib/c.jpg");
        FileOutputStream fos=new FileOutputStream("lib/a.jpg");
        int len;
        long begintime=System.currentTimeMillis();
        while((len=fis.read())!=-1){
            fos.write(len);
        }
        long endtime=System.currentTimeMillis();
        System.out.println("拷贝图片花费的时间为："+(endtime-begintime)+"毫秒");
        fis.close();
        fos.close();
    }
}
