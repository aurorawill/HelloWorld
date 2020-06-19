package Windows.win1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;

public class textDemo8 {
    public static void main(String args[]){
        JFrame f1=new JFrame("窗口");
        JLabel j1=new JLabel("String");
        JLabel j2=new JLabel("Integer");
        String s[]={"A1","B1","C1"};
        Integer i[]={1,2,3,4,5};
        JComboBox<?> com1=new JComboBox<>(s);
        JComboBox<?> com2=new JComboBox<>(i);
        com1.setBorder(BorderFactory.createTitledBorder("String"));
        com2.setBorder(BorderFactory.createTitledBorder("Integer"));
        com1.addItemListener((ItemEvent e)->{
            j1.setText(e.getItem().toString());
        });
        com2.addItemListener((ItemEvent e)->{
            j2.setText(e.getItem().toString());
        });
        f1.setLayout(new GridLayout(2,2));
        f1.add(com1);
        f1.add(com2);
        f1.add(j1);
        f1.add(j2);
        f1.setSize(300,200);
        f1.setVisible(true);
    }
}
