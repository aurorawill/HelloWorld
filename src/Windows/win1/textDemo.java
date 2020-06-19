package Windows.win1;
import javax.swing.JFrame;
public class textDemo {
    public static void main(String args[]){
        JFrame f1=new JFrame("窗体");
        //设置布局管理器
        f1.setLayout(null);
        //设置窗体的大小
        f1.setSize(300,300);
        //设置窗口的初始位置
        f1.setLocation(300,200);
        //固定窗口大小
        f1.setResizable(true);
        //显示窗口
        f1.setVisible(true);
    }
}
