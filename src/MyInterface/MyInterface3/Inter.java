package MyInterface.MyInterface3;

import java.sql.SQLOutput;

public interface Inter {
    default void show1(){
        System.out.println("show1开始执行");
//        System.out.println("初级工程师");
//        System.out.println("中级工程师");
//        System.out.println("高级工程师");
        show3();
        System.out.println("show1执行结束");
    }
    default void show2(){
        System.out.println("show2开始执行");
//        System.out.println("初级工程师");
//        System.out.println("中级工程师");
//        System.out.println("高级工程师");
        show();
        System.out.println("show2执行结束");
    }
    private void show(){
        System.out.println("初级工程师");
        System.out.println("中级工程师");
        System.out.println("高级工程师");
    }
    static void method1(){
        System.out.println("method1开始执行");
//        System.out.println("初级工程师");
//        System.out.println("中级工程师");
//        System.out.println("高级工程师");
        show3();
        System.out.println("method1执行结束");
    }
    static void method2(){
        System.out.println("method2开始执行");
        System.out.println("初级工程师");
        System.out.println("中级工程师");
        System.out.println("高级工程师");
        System.out.println("method2执行结束");
    }
    private static void show3(){
        System.out.println("初级工程师");
        System.out.println("中级工程师");
        System.out.println("高级工程师");
    }
}
