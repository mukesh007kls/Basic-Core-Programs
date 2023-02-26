import java.util.Scanner;

public class CheckVowels {
    public static void main(String[] args) {
        System.out.println("Enter the Alphabet:-");
        Scanner sc=new Scanner(System.in);
        String alph=sc.next();
        String a=alph.toLowerCase();
        switch (a){
            case "a","e","i","o","u"-> System.out.println("The alphabet "+a+" is an vowel");
            default -> System.out.println(a+" is not an vowel");
        }
    }
}
