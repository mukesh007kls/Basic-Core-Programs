import java.util.Scanner;

public class QuotientReminder {
    public static void main(String[] args) {
        System.out.println("Enter num value:-");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println("Enter the divisor");
        int div= sc.nextInt();
        int quo=num/div;
        int reminder=num%div;
        System.out.println("Quotient:- "+quo+"\n Reminder:- "+reminder);
    }
}
