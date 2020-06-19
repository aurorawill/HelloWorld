
import java.io.*;
public class demo {
    public static void main(String[] args) throws Exception {
        FileInputStream fis=new FileInputStream("lib/a.jpg");
        FileOutputStream fos=new FileOutputStream("lib/b.jpg");
        int len;
        while((len=fis.read())!=-1){
            fos.write(len);
        }
        fis.close();
        fos.close();
    }