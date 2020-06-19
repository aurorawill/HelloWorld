package study1;
import java.awt.*;
import java.awt.event.*;
public class textDemo14 {
    public static void main(String[] args) {
        final Frame f=new Frame("WindowEvent");
        f.setLayout(new FlowLayout());
        f.setSize(300,200);
        f.setLocation(300,200);
        f.setVisible(true);
        Button but=new Button("Button");
        f.add(but);
        but.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("mouseClicked---鼠标点击完成事件");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println("mousePressed---鼠标按下事件");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                System.out.println("mouseRelease---鼠标释放事件");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                System.out.println("mouseEntered---鼠标进入按钮区域事件");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                System.out.println("mouseExited---鼠标移出按钮区域事件");
            }
        });
    }
}
