package MyInterface.MyInterface1;

public interface MyInterface {
    void show1();
    void show2();
//    void show3();
    default void show3(){
        System.out.println("show3");
    }
}
