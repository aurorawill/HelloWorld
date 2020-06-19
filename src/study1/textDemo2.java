package study1;
import java.io.*;
public class textDemo2 {
    public static void main(String args[]) throws Exception {
        FileReader fr = new FileReader("lib/demo.java");
        FileWriter fw = new FileWriter("lib/copy.java");
        LineNumberReader inr = new LineNumberReader(fr);
        inr.setLineNumber(0);
        String line=null;
        while((line=inr.readLine())!=null){
            fw.write(inr.getLineNumber()+":"+line);
            fw.write("\r\n");
        }
        inr.close();
        fw.close();
    }
}
