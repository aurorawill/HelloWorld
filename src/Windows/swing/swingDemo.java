package Windows.swing;

import javax.swing.*;
import java.awt.*;

public class swingDemo extends JFrame {
        public swingDemo(){
        setTitle("我的窗口");
        setVisible(true);        //设置窗体可见
        //窗体关闭规则
        //EXIT_ON_CLOSE:隐藏窗体，并停止程序
        //DO_NOTHING_ON_CLOSE:无任何操作
        //HIDE_ON_CLOSE:隐藏窗体，并不停止程序
        //DISPOSE_ON_CLOSE:释放程序资源
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        f.setSize(300,200);   //设置窗体的大小，单位：像素
//        f.setLocation(200,200);       //设置坐标，单位：像素
        setBounds(200,200,300,200);   //设置窗体坐标和大小  单位：像素
        Container c=getContentPane();   //获取窗体容器
        c.setBackground(Color.WHITE);   //设置背景颜色
        JLabel l=new JLabel("这是一个窗口");
        c.add(l);     //调价组件
//        c.remove(l);  //删除组件
        c.validate();   //验证容器中的组件
//        f.setContentPane(c);   //重新载入容量
        setResizable(false);   //设置窗口是否可以改变大小
        System.out.println("x="+getX()+" y="+getY());
    }

    public static void main(String[] args) {
        new swingDemo();
    }
}
