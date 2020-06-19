package Exercise;

import java.util.Scanner;

public class 学生成绩 {
    public static void main(String args[]){
        System.out.println("请输入学生成绩：");
        Scanner scr=new Scanner(System.in);
        int a=scr.nextInt();
        String result= a>=90? "A":(60<=a&&a<=90?"B":"C");
        System.out.println("该学生的最终评级为："+result);
    }
}
