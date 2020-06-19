package Windows.win1;

import javax.swing.*;
import java.awt.*;

public class textDemo3 {
    public static void main(String args[]){
        JFrame f1=new JFrame("我的窗口");
        JLabel L1=new JLabel("Test");
        //取消字体布局
        L1.setLayout(null);
        //设置组件位置和大小，参数顺序为对应窗口的x,y坐标，对应组件的宽和高
        L1.setBounds(300,300,200,200);
        //设置字体样式，参数分别为名称，样式和磅值大小
        L1.setFont(new Font("BOLD",1,20));
        f1.add(L1);
        //取消布局管理，设置窗体大小，显示窗体
        f1.setLayout(null);
        f1.setSize(300,300);
        f1.setVisible(true);
    }
}
