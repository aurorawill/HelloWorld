package Windows.win1;

import javax.swing.*;

public class textDemo5 {
    public static void main(String args[]){
        JFrame f1=new JFrame("窗体");
        JTextField t1=new JTextField();
        JTextArea t2=new JTextArea();
        //设置组件位置和大小，参数顺序为对应窗口的x,y坐标，对应组件的宽和高
        t1.setBounds(50,50,200,30);
        t2.setBounds(50,100,200,100);
        f1.add(t1);
        f1.add(t2);
        //取消布局管理，设置窗体大小，显示窗体
        f1.setLayout(null);
        f1.setSize(300,300);
        f1.setVisible(true);
    }
}
