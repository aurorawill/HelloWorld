package study1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class text8 {
    public static void main(String args[]) throws Exception {
        FileOutputStream fos=new FileOutputStream("lib/cn.cast3",true);
        String str="B190107欢迎您！";
        byte[] b=str.getBytes();
        for(int i=0;i<b.length;i++){
            fos.write(b[i]);
        }
        fos.close();
    }
}
