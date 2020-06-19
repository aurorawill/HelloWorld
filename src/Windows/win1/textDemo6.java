package Windows.win1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class textDemo6 {
    public static void main(String args[]){
        JFrame f1=new JFrame("窗口");
        //定义一个容器，用于对组件进行管理
        JPanel jPanel=new JPanel();
        JCheckBox jcb1=new JCheckBox("选项1");
        JCheckBox jcb2=new JCheckBox("选项2");
        //设置面板边框显示条内容
        jPanel.setBorder(BorderFactory.createTitledBorder("测试复选框"));
        //定义1行2列的排版
        jPanel.setLayout(new GridLayout(1,2));
        //设置事件监听，即根据复选框状态来执行相应事件，可使用e.getItem()来获取相应的复选框
        jcb1.addItemListener((ItemEvent e)->{
              if(jcb1.isSelected()){
                  jcb1.setText("选中选项1");
              }else{
                  jcb1.setText("选项1");
              }
        });
        jcb2.addItemListener((ItemEvent e)->{
            if(jcb2.isSelected()){
                jcb2.setText("选中选项2");
            }else{
                jcb2.setText("选项2");
            }
        });
        jPanel.add(jcb1);
        jPanel.add(jcb2);
        f1.add(jPanel);
        f1.setSize(300,100);
        f1.setLocation(300,200);
        f1.setVisible(true);
    }
}
