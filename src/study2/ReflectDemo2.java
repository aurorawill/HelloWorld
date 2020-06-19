package study2;

import java.lang.reflect.Constructor;

public class ReflectDemo2 {
    public static void main(String args[]) throws Exception {
        //需求：通过反射的方式创建：Student类型的对象
        //1、获取Student类的字节码文件对象
        Class clazz=Class.forName("study2.Student");
        //2、根据第一步获取到的字节码文件对象，获取指定的构造器对象
        //2、1获取公共的无参构造
      /*  Constructor con1=clazz.getConstructor();
        System.out.println(con1);
        //2、2获取公共的有参构造
        Constructor con2=clazz.getConstructor(String.class);
        System.out.println(con2);
        //2、3获取私有的有参构造
        Constructor con3=clazz.getDeclaredConstructor(int.class);
        System.out.println(con3);
        //2、3获取所有的公共的有参构造
        Constructor[] cons=clazz.getConstructors();
        //遍历数组
        for (Constructor con : cons) {
            System.out.println(cons);
        }*/
        //2、2获取公共的有参构造
        Constructor con2=clazz.getConstructor(String.class);
        System.out.println(con2);
        //获取构造器的名字，看看他是哪个类的构造
        String name=con2.getName();
        System.out.println(name);
        //3、根据构造器对象和参数，创建对应的Student对象
        Student stu=(Student) con2.newInstance("张三");
        //4、打印结果
        System.out.println(stu);
    }
}
