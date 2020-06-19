package study1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
//          总结：
//               拷贝纯文本文件使用字符流，拷贝其他（图片，音频，视频）使用字节流
public class text5 {
    public static void main(String args[]) throws IOException {
        //需求：通过字节缓冲流，将a.jpg复制到b.jpg中
        //1、创建字节输入流对象，关联数据源文件
        BufferedInputStream bis=new BufferedInputStream(new FileInputStream("lib/a.jpg"));
        //2、创建字节输出流对象，关联目的地文件
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("lib/b.jpg"));
        //3、定义变量，用来记录读取到的内容
        int len;
        //4、循环读数，只要条件满足就一直读，然后将读取到到的内容赋值给变量
        while((len=bis.read())!=-1){
            //5、将读取到的内容写入到目的地文件中
            bos.write(len);
        }
        //6、释放资源
        bis.close();
        bos.close();
    }
}
