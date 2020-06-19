package study1;
import java.io.*;
public class textDemo3 {
    public static void main(String args[]) throws Exception {
        FileInputStream fis=new FileInputStream("lib/name1");
        InputStreamReader isr=new InputStreamReader(fis);
        BufferedReader br=new BufferedReader(isr);
        FileOutputStream fos=new FileOutputStream("lib/name2");
        OutputStreamWriter osw=new OutputStreamWriter(fos);
        BufferedWriter bw=new BufferedWriter(osw);
        String line;
        while((line=br.readLine())!=null){
            bw.write(line);
        }
        br.close();
        bw.close();
    }
}
