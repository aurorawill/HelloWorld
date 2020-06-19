package study1;
import java.io.File;
public class textDemo6 {
    public static void main(String args[]) throws Exception {
        File file=new File("lib");
        if(file.isDirectory()){
            String [] names=file.list();
            for(String name:names){
                System.out.println(name);
            }
        }
    }
}
