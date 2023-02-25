import java.util.Scanner;

public class TossCoin {
    public static void main(String[] args) {
        System.out.println("Enter number of times to flip coin");
        Scanner sc = new Scanner(System.in);
        int numberOfTimesToFlip = sc.nextInt();
        while(numberOfTimesToFlip<0){
            System.out.println("Enter a positive number:-");
            numberOfTimesToFlip=sc.nextInt();
        }
        double numberOfTimeTails = 0;
        double numberOfTimeHeads = 0;

        for (int i = 0; i < numberOfTimesToFlip; i++) {
            double headOrTails = (Math.random() * 10) % 1;
            if (headOrTails < 0.5) {
                numberOfTimeTails++;
                System.out.println("Tails:-" + numberOfTimeTails);
            } else {
                numberOfTimeHeads++;
                System.out.println("Heads:-" + numberOfTimeHeads);
            }
        }

        double percentageOfTails = (numberOfTimeTails / numberOfTimesToFlip) * 100;
        double percentageOfHeads = (numberOfTimeHeads / numberOfTimesToFlip) * 100;

        System.out.println("Percentage of heads is:-" + percentageOfHeads);
        System.out.println("Percentage of tails is:-" + percentageOfTails);

    }
    }
