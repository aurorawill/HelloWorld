package study1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class text3 {
    public static void main(String args[]) throws IOException {
        //需求：通过普通字节流，一次读写一个字节的方式，将a.jpg复制到b.jpg中
        //1、创建字节输入流，关联数据源文件
        FileInputStream fis=new FileInputStream("lib/a.jpg");
        //2、创建字节输出流，关联目的地文件
        FileOutputStream fos=new FileOutputStream("lib/b.jpg");
        //3、定义变量，用来记录读取到的内容
        int len;
        //4、循环读取，只要条件满足就一直读取，并将读取到的内容复制给变量
        while((len=fis.read())!=-1){
            //5、将读取到的内容写入到目的地文件中
            fos.write(len);
        }
        //6、释放资源
        fis.close();
        fos.close();
    }
}
