package Windows.swing;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class PhotoDemo extends JFrame {
    public PhotoDemo(){
        setBounds(300,200,400,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container c=getContentPane();
        JLabel l=new JLabel();
//        URL url=PhotoDemo.class.getResource("a.jpg");  //获取图片url路径
//        Icon icon=new ImageIcon(url);        //获取相应路径下的图片文件
        Icon icon=new ImageIcon("src/Windows/swing/a.jpg");  //第二种方法获取相应路径下的图片文件
        l.setIcon(icon);  //添加图片
//        l.setSize(20,20);    //设置标签大小,即使设置标签大小，也不会改变图片大小
        c.add(l);
        setVisible(true);
    }
    public static void main(String args[]){
        new PhotoDemo();
    }
}
