package Windows.swing;

import javax.swing.*;
import java.awt.*;


public class BorderLayoutDemo extends JFrame {
    public BorderLayoutDemo(){
        setTitle("我的窗口");
        setBounds(100,100,300,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container c=getContentPane();
        c.setLayout(new BorderLayout());  //设置为边界布局
        c.setBackground(Color.blue);
        JButton b1=new JButton("中"),
                b2=new JButton("东"),
                b3=new JButton("西"),
                b4=new JButton("南"),
                b5=new JButton("北");
        c.add(b1, BorderLayout.CENTER);
        c.add(b2, BorderLayout.EAST);
        c.add(b3, BorderLayout.WEST);
        c.add(b4, BorderLayout.SOUTH);
        c.add(b5, BorderLayout.NORTH);
        c.add(new JButton("覆盖"),BorderLayout.CENTER);
        setVisible(true);
    }
    public static void main(String args[]){
        BorderLayoutDemo b=new BorderLayoutDemo();
        b.setVisible(true);
    }
}
