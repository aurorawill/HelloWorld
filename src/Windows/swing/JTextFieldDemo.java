package Windows.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JTextFieldDemo extends JFrame {
    public JTextFieldDemo(){
        setBounds(100,100,250,150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container c=getContentPane();
        c.setLayout(new FlowLayout());
        JTextField jt=new JTextField();
        jt.setColumns(20);  //设置文本框长度，20个字符
        jt.setText("周安");
        jt.setFont(new Font("黑体",Font.PLAIN,20)); //设置字体格式
        c.add(jt);

        JButton btn=new JButton("确认");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("文本框中的内容为："+jt.getText());    //获取文本框中的文本值
                jt.setText("");    //清空文本框的内容
                jt.requestFocus();  //获取焦点，获取光标
            }
        });
        c.add(btn);

        setVisible(true);
    }
    public static void main(String args[]){
        new JTextFieldDemo();
    }
}
