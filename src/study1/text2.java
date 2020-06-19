package study1;

import java.io.*;

public class text2 {
    public static void main(String[] args) throws IOException {
//        需求：通过字符缓冲流，将cn.cast文件中的内容拷贝到cn.cast2文件中
//        1、创建字符缓冲输入流对象，关联数据源文件
//         1.1、创建普通的字符输入流对象
        FileReader fr=new FileReader("lib/cn.cast");
//         1.2、创建字符缓冲流输入对象
        BufferedReader br=new BufferedReader(fr);
        // 简化上述代码：
        //BufferedReader br2=new BufferedReader(new FileReader("lib/cn.cast"));
//        2、创建字符缓冲输出流对象，关联目的地文件
        FileWriter fw=new FileWriter("lib/cn.cast1");
        BufferedWriter bw=new BufferedWriter(fw);
//        3、定义变量，记录读取到的数据
        int len;
//        4、循环读数，只要条件满足就一直读，并将读取到内容赋值给变量
        while((len=br.read())!=-1){
            //        5、将读取到的数据写入到目的地文件中
            bw.write(len);
        }

//        6、释放资源
        br.close();
        bw.close();
    }
}
