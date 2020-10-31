package DZ2;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Task2_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ThreadLocalRandom localRandom = ThreadLocalRandom.current();
        int min = 0, max = 100;
        int number = 0;

        for (int i = 0; i < 100000; i++) {
            System.out.println("Enter the number from 0 till 100:");

            number = scanner.nextInt();
            if (number < min || number > max) {
                System.out.println("Please enter the correct number:");
            } else {
                break;
            }
        }

        for (int j = 0; j < 100000; j++) {
            int rand = localRandom.nextInt(min, max + 1);
            if (number == rand) {
                System.out.println("The number of attempts is " + j);
                break;
            }
        }
    }

}


