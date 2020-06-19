package Windows.swing;

import javax.swing.*;
import java.awt.*;

public class LabelDemo extends JFrame {
    public LabelDemo(){
        setBounds(100,100,100,100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container c=getContentPane();
        setVisible(true);
        JLabel l=new JLabel("这是一个标签");
//        l.setText("更改标签内容");
//        System.out.println(l.getText());
        l.setFont(new Font("宋体",Font.BOLD,14));
        l.setForeground(Color.blue);    //更改前景色，更改字体颜色
        c.add(l);


    }
    public static void main(String args[]){
        new LabelDemo();
    }
}
