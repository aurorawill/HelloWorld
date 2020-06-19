package Exercise;

public class shuixianhua {
    public static void main(String args[]){
        for(int i=100;i<=999;i++){
            if(isNarcissus(i)){
                System.out.println("水仙花数："+i);
            }
        }
    }
    public static boolean isNarcissus(int a){
        int num1=0;    //个位
        int num2=0;    //十位
        int num3=0;    //百位
        num1=a/1%10;
        num2=a/10%10;
        num3=a/100%10;
        if(Math.pow(num1,3)+Math.pow(num2,3)+Math.pow(num3,3)==a){
            return true;
        }
        return false;
    }
}
