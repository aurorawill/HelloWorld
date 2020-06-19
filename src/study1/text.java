package study1;

import java.io.*;
//          注意：只能拷贝纯文本文件
//              不能拷贝图片
public class text {
    public static void main(String args[]) throws IOException {
        //需求：通过字符缓冲流“一次读写一行”的方式，将cn.cast文件中的内容拷贝到cn.cast1文件中
        //1、创建字符缓冲输入流对象，关联数据源文件
        BufferedReader br=new BufferedReader(new FileReader("lib/cn.cast"));
        //2、创建字符缓冲输出流对象，关联目的地文件
        BufferedWriter bw=new BufferedWriter(new FileWriter("lib/cn.cast1"));
        //3、定义变量，记录读取到的内容
        String str;
        //4、循环读取，只要条件满足就一直读，并将读取到的内容赋值给变量
        while((str=br.readLine())!=null){
        //5、将读取到的内容写入到目的地文件中
            bw.write(str);
            //千万注意一个小细节，你特别容易忽略
            bw.newLine();
        }
        //6、释放资源
        br.close();
        bw.close();
    }
}
