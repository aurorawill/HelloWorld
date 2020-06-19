package Exercise;
/*
    分析：只能被自己和 1 整除的数称为素数
 */
public class sushu {
    public static void main(String args[]) {
        getPrimeNumber(101,200);
    }
    public static void getPrimeNumber(int a,int b) {
        int sum=0;
        if(a>=b){
            System.out.println("a不能大于等于b!");
        }
        System.out.print("素数：");
        for(int i=a;i<=b;i++){
            if(isPrimeNumber(i)){
                sum+=1;
                System.out.print(i+" ");
            }
        }
        System.out.println();
        System.out.println("存在素数数量："+sum);
    }
    private static boolean isPrimeNumber(int i){
        boolean flag;
        flag = true;
        for(int j=2;j<=i-1;j++){
            if(i%j==0){
                flag=false;
                break;
            }
        }
        return flag;
    }
}
