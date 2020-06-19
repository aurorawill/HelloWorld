package study2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class ReflectDemo5 {
    public static void main(String args[]) throws Exception {
        //需求：通过反射获取成员变量并使用
        //1、获取Student类的字节码文件对象
        Class clazz=Class.forName("study2.Student3");
        //2、通过字节码文件对象获取构造器对象，然后创建学生类对象
        Constructor con=clazz.getConstructor();
        Student3 stu=(Student3)con.newInstance();
        //链式编程
        //Student2 stu=(Student2)clazz.getConstructor().newInstance()
        //3、设置学生对象的各个属性值
        //3.1、设置姓名
        Field field1=clazz.getField("name");
        field1.set(stu,"周安");
        //3.2、设置年龄
        Field field2=clazz.getDeclaredField("age");
        //开启暴力反射
        field2.setAccessible(true);
        field2.set(stu,20);
        //4、打印学生对象
        System.out.println(stu);
    }
}
