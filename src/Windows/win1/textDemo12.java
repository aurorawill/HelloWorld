package Windows.win1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Cardlayout extends Frame implements ActionListener{
    Panel cardPanel=new Panel();
    Panel controlpaPanel=new Panel();
    Button nextbutton,preButton;
    CardLayout cardLayout=new CardLayout();
    public Cardlayout(){
        setSize(300,200);
        setVisible(true);
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                Cardlayout.this.dispose();
            }
        });
        cardPanel.setLayout(cardLayout);
        cardPanel.add(new Label("第一个界面",Label.CENTER));
        cardPanel.add(new Label("第二个界面",Label.CENTER));
        cardPanel.add(new Label("第三个界面",Label.CENTER));
        nextbutton=new Button("下一张卡片");
        preButton=new Button("下一张卡片");
        nextbutton.addActionListener(this);
        preButton.addActionListener(this);
        controlpaPanel.add(preButton);
        controlpaPanel.add(nextbutton);
        this.add(cardPanel,BorderLayout.CENTER);
        this.add(controlpaPanel,BorderLayout.SOUTH);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==nextbutton){
            cardLayout.next(cardPanel);
        }
        if(e.getSource()==preButton){
            cardLayout.previous(cardPanel);
        }
    }
}
public class textDemo12 {
    public  static void main(String args[]){
        new Cardlayout();
    }
}
