import java.util.Scanner;

public class PrimeFactorization {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("Enter the number:-");
        num=sc.nextInt();
        int factors;
        for (int i = 2; i<=num; i++) {
            factors=0;
            while (num%i==0){
                num/=i;
                factors++;
            }
            if (factors!=0){
                System.out.println(i+"--"+factors);
            }
        }
    }
}
