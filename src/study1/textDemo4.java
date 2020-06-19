package study1;
import java.io.*;
public class textDemo4 {
    public static void main(String args[]) throws Exception {
        File file=new File("lib/cn.cast3");
        String[] list=new String[1024];
        File[] file1=new File[1024];
        System.out.println("文件名称:"+file.getName());
        System.out.println("文件相对路径:"+file.getPath());
        System.out.println("文件的绝对路径:"+file.getAbsolutePath());
        System.out.println("文件的父路径:"+file.getParent());
        System.out.println(file.canRead()?"文件可读":"文件不可读");
        System.out.println(file.canWrite()?"文件可写":"文件可写");
        System.out.println(file.isFile()?"是一个文件":"不是一个文件");
        System.out.println(file.isDirectory()?"是一个目录":"不是一个目录");
        System.out.println(file.isAbsolute()?"是绝对路径":"不是绝对路径");
        System.out.println("最后修改时间为:"+file.lastModified());
        System.out.println("文件大小为:"+file.length()+"bytes");
        System.out.println("是否成功删除文件:"+file.delete());
        System.out.println(file.list());
        System.out.println(file.listFiles());
    }
}
