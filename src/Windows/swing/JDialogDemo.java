package Windows.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JDialogDemo extends JDialog {
    public JDialogDemo(JFrame frame){
        /*
        第一个参数：父窗口对象
        第二个参数：对话框标题
        第三个参数：是否阻塞父窗体
         */
        super(frame,"对话框标题",true);
        Container c=getContentPane(); //获取容器方法
        c.add(new JLabel("这是一个对话框"));
        setBounds(300,200,300,300);

    }
    public static void main(String[] args) {
        JFrame f=new JFrame("父窗口");
        f.setBounds(300,300,300,400);
        Container c=f.getContentPane();
        JButton btn=new JButton("弹出对话框");
        c.setLayout(new FlowLayout());  //设置布局，使用流布局
        c.add(btn);
        f.setVisible(true);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JDialogDemo J=new JDialogDemo(f);
                J.setVisible(true);
            }
        });  //添加动作监听
    }
}
