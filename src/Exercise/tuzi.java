package Exercise;
import java.util.Scanner;
public class tuzi {
    public static void main(String args[]){
        System.out.println("请输入你想知道的兔子数量的月份：");
        Scanner scr=new Scanner(System.in);
        int n=scr.nextInt();
        System.out.println(fun(n));
    }
    public static int fun(int n){
        if(n==1||n==2){
            return 1;
        }else{
            return fun(n-1)+fun(n-2);
        }
    }
}
