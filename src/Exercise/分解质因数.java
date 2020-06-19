package Exercise;

import java.util.Scanner;

public class 分解质因数 {
    public static void main(String args[]) {
        System.out.println("请输入需要分解因数的整数：");
        Scanner scr=new Scanner(System.in);
        int a=scr.nextInt();
        decompose(a);
    }
    public static void decompose(int num){
        int tmp=num/2;
        for(int i=2;i<=tmp;i++){
            if(num%i==0){
                num=num/i;
                System.out.println("质因数为："+i);

            }
        }
    }
}
