package Windows.win1;

import java.awt.*;

public class textDemo11 {
    public static void main(String args[]){
        Frame f=new Frame("我的窗口");
        f.setSize(400,400);
        f.setLocation(400,200);
        f.setBackground(Color.blue);
        new Layout("GridBagLayout");
    }
}
class Layout extends Frame{
    public Layout(String title){
        GridBagLayout layout=new GridBagLayout();
        GridBagConstraints q=new GridBagConstraints();
        this.setLayout(layout);
        q.fill=GridBagConstraints.BOTH;
        q.weightx=1;q.weighty=1;
        this.addComponent("按钮1",layout,q);
        this.addComponent("按钮2",layout,q);
        this.addComponent("按钮3",layout,q);
        q.gridwidth=GridBagConstraints.REMAINDER;
        this.addComponent("按钮4",layout,q);
        q.weightx=0;q.weighty=0;
        addComponent("按钮5",layout,q);
        q.gridwidth=1;
        this.addComponent("按钮6",layout,q);
        q.gridwidth=GridBagConstraints.REMAINDER;
        this.addComponent("按钮7",layout,q);
        q.gridheight=2;
        q.gridwidth=1;
        q.weighty=2;
        q.weighty=2;
        this.addComponent("按钮8",layout,q);
        q.gridwidth=GridBagConstraints.REMAINDER;
        q.gridheight=1;
        this.addComponent("按钮9",layout,q);
        this.addComponent("按钮10",layout,q);
        this.pack();
        this.setVisible(true);
    }
    private void addComponent(String name,GridBagLayout layout,GridBagConstraints q) {
        Button but = new Button(name);
        layout.setConstraints(but, q);
        this.add(but);
    }}
