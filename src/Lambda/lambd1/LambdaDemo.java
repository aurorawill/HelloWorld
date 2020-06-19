package Lambda.lambd1;
/*
    需求：启动一个线程，在控制台输出一句话，对线程程序开始启动了
 */
public class LambdaDemo {
    public static void main(String[] args) {
        //采用类的方式实现需求
//        Myrunnable my=new Myrunnable();
//        Thread t=new Thread(my);
//        t.start();
        //匿名内部类的方式改进
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("多线程程序启动了");
//            }
//        }).start();
        //Lambda表达式的方式改进
        new Thread( ()->{
            System.out.println("多线程程序启动了");
        }).start();

    }
}
