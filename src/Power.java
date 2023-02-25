import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        System.out.println("Enter N value:-");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n < 0 || n >= 31) {
            if (n < 0) {
                System.out.println("Enter n value greater than or equal to 0:-");
                n = sc.nextInt();
            } else {
                System.out.println("Enter n value less than 31:-");
                n = sc.nextInt();
            }
        }
        int result = 1;
        if (n == 0) {
            System.out.println(result);
        } else {
            System.out.println(result);
            for (int i = 1; i <= n; i++) {
                result *= 2;
                System.out.println(result);
            }
        }
    }
}
