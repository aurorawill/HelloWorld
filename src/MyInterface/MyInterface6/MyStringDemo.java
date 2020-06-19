package MyInterface.MyInterface6;
/*
    练习:
        1、定义一个接口（MyString),里面定义一个抽象方法
            String mySubString(String s,int x,int y);
        2、一定一个测试类（MyStringDemo),在测试类中提供两个方法
            一个方法是：useMyString(MyString my)
            一个方法是主方法，在主方法中调用useMyString方法
 */
public class MyStringDemo {
    public static void main(String[] args) {
        useMyString((s,x,y)-> {
           return s.substring(x,y);
        });
        useMyString((s,x,y)->s.substring(x,y));
        //应用类中的实例方法
        useMyString(String::substring);
        //Lanbda表达式被类的实例方法替代的时候
        //第一个参数作为调用者
        //后面的参数全部传递给该方法作为参数
    }
    public static void useMyString(MyString my){
        String s=my.mySubString("helloworld",2,5);
        System.out.println(s);
    }
}
