package study1;

import java.io.FileWriter;
import java.io.IOException;

public class text10 {
    public static void main(String args[]) throws IOException {
        FileWriter writer=new FileWriter("lib/cn.cast4");
        String str="江西软件职业技术大学，你好！";
        writer.write(str);
        writer.write("\r\n");
        writer.close();
    }
}
