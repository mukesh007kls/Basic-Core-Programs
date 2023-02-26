import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        System.out.println("Enter num value:-");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num==0){
            System.out.println(num+" is neither odd nor even");
        }else if(num%2==0){
            System.out.println(num+" is a even number");
        }else {
            System.out.println(num+" is an odd number");
        }
    }
}
