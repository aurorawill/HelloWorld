package study1;

import java.io.FileReader;
import java.io.IOException;

public class text11 {
    public static void main(String[] args) throws IOException {
        FileReader reader=new FileReader("lib/cn.cast4");
        int ch;
        while((ch=reader.read())!=-1){
            System.out.print((char) ch);
        }
        reader.close();
    }
}
