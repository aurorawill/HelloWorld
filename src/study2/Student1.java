package study2;

public class Student1 {
    //公共的空参方法
    public void show1(){
        System.out.println("我是公共的空参方法");
    }
    //公共的有参方法
    public void show2(int a){
        System.out.println("我是公共的带参方法，你传入的值是："+a);
    }
    private int show3(int a,int b){
        System.out.println("我是私有的带参方法");
        return a+b;
    }
}
