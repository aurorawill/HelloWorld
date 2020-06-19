package study1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;

public class textDemo1 {
    public static void main(String args[]) throws Exception {
        FileInputStream fis=new FileInputStream("lib/a.jpg");
        FileOutputStream fos=new FileOutputStream("lib/b.jpg");
        int len;
        while((len=fis.read())!=-1){
            fos.write(len);
        }
        fis.close();
        fos.close();
    }
}
