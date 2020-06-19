package study2;

public class ReflectDemo1 {
    public static void main(String args[]) throws ClassNotFoundException {
        //需求：获取Class对象
        //方式一：
        Student stu=new Student();
        Class clazz1=stu.getClass();

        //方式二：
        Class clazz2=Student.class;

        //方式三:
        Class clazz3=Class.forName("study2.Student");

        //如何验证这三个Class对象是同一个对象？
        System.out.println(clazz1 == clazz2);
        System.out.println(clazz2 == clazz3);
    }
}
