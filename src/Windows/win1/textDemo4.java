package Windows.win1;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class textDemo4 {
    static Integer i=0;
    public static void main(String args[]) {
        JFrame f1 = new JFrame("窗口");
        JButton but1 = new JButton("点击" + i + "次");
        //设置点击按钮事件
        but1.addActionListener((ActionEvent e) -> {
            i++;
            but1.setText("点击" + i + "次");
        });
        //设置组件位置和大小，参数顺序为对应窗口的x,y坐标，对应组件的宽和高
        but1.setBounds(70, 90, 90, 70);
        f1.add(but1);
        //取消布局管理，设置窗体大小，显示窗体
        f1.setLayout(null);
        f1.setSize(300,300);
        f1.setLocation(300,200);
        f1.setVisible(true);
    }
}
