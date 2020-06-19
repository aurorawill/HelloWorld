package study1;
import java.io.File;
public class textDemo8 {
    public static void main(String args[]) throws Exception {
        File file=new File("lib");
        fileDir(file);
    }
    public static void fileDir(File dir){
        File[] files=dir.listFiles();
        for(File file:files){
            if(file.isDirectory()){
                fileDir(file);
            }
            System.out.println(file.getAbsolutePath());
        }
    }
}
