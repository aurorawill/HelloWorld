package Thread;
/*
方法 1、继承Thread类
    1、定义一个类MyThread继承Thread类
    2、在MyThread类中重写run()方法
    3、创建MyThread类中的对象
    4、启动线程
 */
public class MyThreadDemo {
    public static void main(String args[]){
/*        MyThread my1=new MyThread();
        MyThread my2=new MyThread();
        my1.setName("高铁");
        my2.setName("飞机");    */
//       my1.run();
//       my2.run();
        //void start()  导致此线程开始执行；java虚拟机调用此线程的run方法
//        MyThread my1=new MyThread("高铁");
  //      MyThread my2=new MyThread("飞机");
    //    my1.start();
      //  my2.start(1);
        //static Thread currentThread() 返回对当前正在执行的线程对象方法的引用
        System.out.println(Thread.currentThread().getName());
    }
}
