package Windows.swing;

import javax.swing.*;
import java.awt.*;

public class JTextAreaDemo extends JFrame {
    public JTextAreaDemo(){
        setBounds(100,100,400,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container c=getContentPane();
        c.setLayout(new FlowLayout());
        JTextArea are=new JTextArea("这是一个文本域");
        are.setRows(5);   //设定行
        are.setColumns(20);  //设定列数
        are.append("添加内容");     //添加内容
        are.insert("插入",2) ;   //在第二个字符后面插入内容
        are.setFont(new Font("宋体",Font.BOLD,14));
        JScrollPane js=new JScrollPane(are);    //给文本域添加滚动条
        c.add(js);   //添加滚动面板
        setVisible(true);
    }
    public static void main(String args[]) {
        new JTextAreaDemo();
    }
}
