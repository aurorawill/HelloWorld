package Windows.win1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class textDemo9 {
    public static void main(String[] args) {
        Frame f=new Frame("GridLayout");
        f.setLayout(new GridLayout(4,4));
        f.setSize(400,400);
        f.setLocation(300,200);
        for(int i=1;i<=9;i++){
            Button but=new Button("but"+i);
            f.add(but);
        }
        f.setVisible(true);

    }
}
