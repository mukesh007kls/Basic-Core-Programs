import java.util.Scanner;

public class SwapNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1 value:- ");
        int num1 = sc.nextInt();
        System.out.println("Enter num2 value:-");
        int num2 = sc.nextInt();
        System.out.println("Original numbers are:- " + num1 + "-----" + num2);
        int temp = 0;
        //logic to swap numbers
        temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("After swapping numbers are:- " + num1 + "-----" + num2);
    }
}
