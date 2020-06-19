package study1;
import java.awt.*;
import java.awt.event.*;
public class textDemo11 {
    public static void main(String args[]){
        Frame f=new Frame("我的窗口");
        Color color=Color.CYAN;
        f.setSize(500,500);
        f.setLocation(400,400);
        f.setVisible(true);
        f.setBackground(color);
        Button btn=new Button("退出");
        f.add(btn);
        btn.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                System.exit(0);
            }
        });
    }
}
