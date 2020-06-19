package Windows.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class XialaDemo extends JFrame {
    public XialaDemo(){
        setBounds(100,100,300,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container c=getContentPane();
        c.setLayout(null);
//        JComboBox comboBox=new JComboBox();
//        comboBox.addItem("身份证");
//        comboBox.addItem("学生证");
//        comboBox.addItem("工作证");
//        String items[]={"身份证","学生证","工作证"};     //使用String添加下拉列表元素
//        JComboBox comboBox=new JComboBox(items);
        JComboBox comboBox=new JComboBox();
        String items[]={"身份证","学生证","工作证"};
        ComboBoxModel cm=new DefaultComboBoxModel(items);  //创建下拉列表模型
        comboBox.setModel(cm);      //向列表中添加数据模型

        JButton btn=new JButton("打印");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("选中的索引："+comboBox.getSelectedIndex());    //获取选中的索引
                System.out.println("选中的值:"+comboBox.getSelectedItem());      //获取选中的值
            }
        });
        btn.setBounds(100,10,60,20);
        c.add(btn);
        comboBox.setEditable(true);    //是否可以编辑

        c.add(comboBox);
        comboBox.setBounds(10,10,80,20);
        setVisible(true);

    }
    public static void main(String args[]){
        new XialaDemo();
    }
}
