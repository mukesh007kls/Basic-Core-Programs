import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println("Enter the year:-");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        while(year>9999){
            System.out.println("Enter a year below 10000:-");
            year= sc.nextInt();
        }
        if(year%400==0||(year%100!=0&&year%4==0)){
            System.out.println(year+" is a leap year");
        }else{
            System.out.println(year+" is not a leap year");
        }
    }
}
