package Thread;

public class threadText2 implements Runnable {
    @Override
    public void run() {
        for(int i=0;i<20;i++){
            System.out.println("一边听歌");
        }
    }

    public static void main(String args[]){
        //创建实现类对象
        //threadText2 tt=new threadText2();
        //创建代理类对象
        //Thread t=new Thread(tt);
        //启动
        new Thread(new threadText2()).start();
        //t.start();
        for(int i=0;i<20;i++){
            System.out.println("一边coding");
        }
    }
}
