package study2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ReflectDemo3 {
    public static void main(String args[]) throws Exception {
        //需求：通过反射获取Student类中的成员方法并调用
        //1、获取Student1类的字节码文件对象
        Class clazz=Class.forName("study2.Student1");
        //2、获取该类的构造器对象，然后创建Student类的对象
        Constructor con=clazz.getConstructor();
        Student1 stu=(Student1)con.newInstance();
        //System.out.println(stu);
        //3、获取该类的成员方法对象，然后调用此方法
        //3.1、调用公共的空参方法
        Method method=clazz.getMethod("show1");
        //打印方法对象
        System.out.println(method);
        //打印方法名
        System.out.println(method.getName());
        //调用此方法
        method.invoke(stu);
        System.out.println("------------------------");
        //3.2、公共的带参方法
        Method method2=clazz.getMethod("show2", int.class);
        //调用方法
        method2.invoke(stu,100);
        System.out.println("------------------------");
        //3.3、调用私有的带参方法
        Method method3=clazz.getDeclaredMethod("show3", int.class, int.class);
        //开启暴力反射
        method3.setAccessible(true);
        //调用此方法
        int sum=(int)method3.invoke(stu,10,20);
        System.out.println(sum);
        System.out.println("------------------------");
        //获取Student1类中的所有成员方法
        Method[] methods=clazz.getMethods();
        for (Method method1 : methods) {
            System.out.println(method1);
        }
    }
}
