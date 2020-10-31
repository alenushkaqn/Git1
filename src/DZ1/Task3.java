package DZ1;

import java.util.Scanner;

public class Task3 {
        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            System.out.println(" Enter first number: ");
            int first = scan.nextInt();
            System.out.println(" Enter second number: ");
            int second = scan.nextInt();
            System.out.println(" Enter third number: ");
            int third = scan.nextInt();

            int max = first > (second > third ? second : third) ? first : ((second > third) ? second : third);
            int min = first < (second < third ? second : third) ? first : ((second < third) ? second : third);

            System.out.println(" Max number: " + max);
            System.out.println(" Min number: " + min);
            System.out.println(" Srednee arifmeticheskoe: " + (double)(first + second + third) / 3);


        }
}
