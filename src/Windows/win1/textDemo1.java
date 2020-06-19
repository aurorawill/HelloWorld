package Windows.win1;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class textDemo1 {
        public static void main(String[] args) {
            final Frame f = new Frame("我的窗体");
            f.setLayout(new FlowLayout(FlowLayout.LEFT,20,30));
            f.setSize(200,300);
            f.setLocation(400,200);
            Button bt1 = new Button("第一个按钮");
            f.add(bt1);
            bt1.addActionListener(new ActionListener() {
                private int num = 1;
                public void actionPerformed(ActionEvent e) {
                    f.add(new Button("第"+ ++num+"个按钮"));
                    f.setVisible(true);
                }
            });
            f.setVisible(true);
            f.addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent e) {
                    System.exit(0);
                }
            });
        }
    }

