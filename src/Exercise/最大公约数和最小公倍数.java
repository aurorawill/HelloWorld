package Exercise;
import java.util.Scanner;
public class 最大公约数和最小公倍数 {
    public static void main(String args[]){
        System.out.println("请输入第一个正整数：");
        Scanner scr=new Scanner(System.in);
        int a=scr.nextInt();
        System.out.println("请输入第二个正整数：");
        int b=scr.nextInt();
        int maxCommonDivisor=maxCommonDivisor(a,b);
        System.out.println("最大公约数："+maxCommonDivisor);
        int minCommonDivisor=(a*b)/maxCommonDivisor;
        System.out.println("最小公倍数："+minCommonDivisor);
    }
    public static int maxCommonDivisor(int num1,int num2){
        int result=1;
        int temp= num1>num2? num2:num1;
        for(int i=2;i<=temp;i++){
            if(num1%i==0&&num2%i==0){
                result=i*result;
                num1=num1/i;
                num2=num2/i;
                i=1;
            }
        }
        return result;
    }
}
