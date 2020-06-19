package Windows.swing;

import javax.swing.*;
import java.awt.*;

public class GridLayoutDemo extends JFrame {
    public GridLayoutDemo(){
        setTitle("QQ");
        setBounds(100,100,300,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container c=getContentPane();
        c.setLayout(new GridLayout(3,3,5,5));   //三行三列 水平像素为5，垂直像素为5
        for(int i=1;i<=10;i++){
            c.add(new JButton("按钮"+i));
        }
        setVisible(true);
    }
    public static void main(String args[]){
        new GridLayoutDemo();
    }
}
