import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        System.out.println("Enter n value:-");
        Scanner sc=new Scanner(System.in);
        double n=sc.nextInt();
        while(n<=0){
            System.out.println("Enter positive integer:-");
            n=sc.nextInt();
        }
        double result=0;
        for (double i = 1; i <=n; i++) {
            result+=1/i;
        }
        System.out.println(result);
    }
}
