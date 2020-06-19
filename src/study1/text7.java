package study1;

import java.io.FileInputStream;
import java.io.IOException;

public class text7 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("lib/cn.cast2");
        int len;
        while((len=fis.read())!=-1){
            System.out.println(len);
        }

        fis.close();
    }
}
