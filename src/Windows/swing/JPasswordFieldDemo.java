package Windows.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JPasswordFieldDemo extends JFrame {
    public JPasswordFieldDemo(){
        setBounds(100,100,400,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container c=getContentPane();
        c.setLayout(new FlowLayout());
        JPasswordField jp=new JPasswordField();
        jp.setColumns(20);  //设置密码框长度，20个字符
        jp.setFont(new Font("Arial",Font.BOLD,18));    //设置字体
        jp.setEchoChar('*');  //设置回显字符
        jp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                char ch[]=jp.getPassword();   //获取密码字符的数组
                String str=new String(ch);
                System.out.println(str);
            }
        });
        c.add(jp);
        setVisible(true);
    }
    public static void main(String args[]){
        new JPasswordFieldDemo();
    }
}
