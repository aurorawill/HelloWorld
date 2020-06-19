package study1;
import java.io.*;
public class textDemo9 {
    public static void main(String args[]) throws Exception {
        File file=new File("lib/name1");
        if(file.exists()){
            System.out.println(file.delete());
        }
    }
}
