package Thread;
/*
    创建线程方式一：
    1、创建：继承Thread+重写run
    2、启动：创建子类对象+start()
 */
public class threadText1 extends Thread {
    /*
    线程入口点
     */
    @Override
    public void run() {
      for(int i=0;i<20;i++){
          System.out.println("一边听歌");
      }
    }

    public static void main(String args[]){
        //创建子类对象
        threadText1 tt=new threadText1();
        //启动
        //tt.start();   不保证立即运行  cpu调用
        tt.run();  //普通方法的调用
        for(int i=0;i<20;i++){
            System.out.println("一边coding");
        }
    }
}
