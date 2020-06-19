package Thread.cn.cast1;

public class ThreadJoinDemo {
    public static void main(String args[]){
        ThreadJoin tj1=new ThreadJoin();
        ThreadJoin tj2=new ThreadJoin();
        ThreadJoin tj3=new ThreadJoin();

        tj1.setName("小红");
        tj2.setName("小黑");
        tj3.setName("小安");
        tj1.start();
        try {
            tj1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        tj2.start();
        tj3.start();

    }
}
