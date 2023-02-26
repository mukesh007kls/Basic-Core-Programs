import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        System.out.println("Enter the 3 numbers:-");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a>b&&b>c){
            System.out.println(a+" is greater of three");
        } else if (c>b&&c>a) {
            System.out.println(c+" is greater of three");
        }else if(a==b&&b==c){
            System.out.println(a+" "+b+" "+c+" are equal");
        }else {
            System.out.println(b+" is greater of three");
        }
    }
}
