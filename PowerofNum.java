package Assignment1;
import java.util.Scanner;

public class PowerofNum {
    public static void main(String[] args) {
        int X;
        int N;
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the base number X: ");
        X=in.nextInt();
        System.out.print("Enter the power N: ");
        N=in.nextInt();

        powerOfNum(X,N);
        int power=powerOfNum(X,N);
        System.out.println("X power N is:"+power);

    }
    public static int powerOfNum(int X,int N){
        int power=1;
        for(int i=1;i<=N;i++){
            power=power*X;

        }
        return power;

    }
}
