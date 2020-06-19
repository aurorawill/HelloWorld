package Windows.win2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewFrame extends JFrame {
    NewFrame(){
        this.setBounds(100,100,500,400);
        this.setTitle("欢迎来到新窗口");
        Container s= getContentPane();
        JLabel t=new JLabel("NewFrame");
        s.add(t);
        this.setAlwaysOnTop(true);
        this.setVisible(true);
    }

}
