package study1;
import java.io.File;
import java.io.FilenameFilter;
public class textDemo7 {
    public static void main(String args[]) throws Exception {
        File file=new File("lib");
        FilenameFilter filter=new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                File currFile=new File(dir,name);
                if(currFile.isFile()&&name.endsWith(",java")){
                    return true;
                }
                else{
                    return false;
                }
            }
        };
        if(file.exists()){
            String[] lists=file.list(filter);
            for(String name:lists){
                System.out.println(name);
            }
        }
    }
}
