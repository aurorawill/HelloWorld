package Windows.swing;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutDemo extends JFrame {
    public FlowLayoutDemo(){
        setBounds(100,100,300,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        Container c=getContentPane();
        c.setLayout(new FlowLayout(FlowLayout.RIGHT,20,30));  //给容器设置流动布局
        for(int i=1;i<=9;i++){
            c.add(new JButton("按钮"+i));    //循环添加按钮
        }
    }
    public static void main(String args[]){
        new FlowLayoutDemo();
    }
}
