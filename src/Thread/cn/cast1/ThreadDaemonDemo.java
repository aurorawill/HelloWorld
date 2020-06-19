package Thread.cn.cast1;

public class ThreadDaemonDemo {
    public static void main(String args[]){
        ThreadDaemon td1=new ThreadDaemon();
        ThreadDaemon td2=new ThreadDaemon();
        ThreadDaemon td3=new ThreadDaemon();
        td1.setName("孙权");
        td2.setName("诸葛亮");

        //设置主线程为刘备
        Thread.currentThread().setName("刘备");

        //设置为守护线程
        td1.setDaemon(true);
        td2.setDaemon(true);

        td1.start();
        td2.start();

        for(int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }
}
