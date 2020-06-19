package Windows.win1;

import javax.swing.*;
import java.awt.*;

public class textDemo7 {
    public static void main(String args[]){
        JFrame f1=new JFrame("窗口");
        String s[]={"A1","B2","C3"};
        Integer i[]={1,2,3,4,5};
        JList<?> list1=new JList<>(s);
        JList<?> list2=new JList<>(i);
        list1.setBorder(BorderFactory.createTitledBorder("String"));
        list2.setBorder(BorderFactory.createTitledBorder("Integer"));
        f1.setLayout(new GridLayout(1,2));
        f1.add(list1);
        f1.add(list2);
        f1.setSize(300,300);
        f1.setVisible(true);
    }
}
