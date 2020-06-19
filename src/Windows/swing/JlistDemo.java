package Windows.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JlistDemo extends JFrame {
    public JlistDemo(){
        setBounds(100,100,200,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container c=getContentPane();
        c.setLayout(null);
        String items[]={"元素2","元素3","元素1","元素4","元素5","元素6","元素7"};
//        JList jl=new JList(items);
        DefaultListModel<String> model=new DefaultListModel<>();    //列表框的数据模型
        for(String tmp:items){
            model.addElement(tmp);
        }
        JList jl=new JList();
        model.addElement("添加元素");   //数据模型添加元素
        jl.setModel(model);          //列表框载入数据模型

        /*
            SINGLE_SELECTION   单选选择
            SINGLE_INTERVAL_SELECTION  只能连续选择相邻的元素
            MULTIPLE_INTERVAL_SELECTION  随便选
         */
        jl.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);       //设置选择模式

        JScrollPane js=new JScrollPane(jl);   //为列表添加滚动条
        js.setBounds(10,10,100,100);
        c.add(js);

        JButton btn=new JButton("确认");
        btn.setBounds(120,90,70,25);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //获取列表框中选中的所有元素
                java.util.List<String> values= jl.getSelectedValuesList();
                for(String tmp:values){
                    System.out.println(tmp);
                }
                System.out.println("---------------end--------------------");
            }
        });
        c.add(btn);
        setVisible(true);
    }
    public static void main(String args[]){
        new JlistDemo();
    }
}
