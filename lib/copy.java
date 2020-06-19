1:
2:import java.io.*;
3:public class demo {
4:    public static void main(String[] args) throws Exception {
5:        FileInputStream fis=new FileInputStream("lib/a.jpg");
6:        FileOutputStream fos=new FileOutputStream("lib/b.jpg");
7:        int len;
8:        while((len=fis.read())!=-1){
9:            fos.write(len);
10:        }
11:        fis.close();
12:        fos.close();
13:    }
