package DZ2;

import java.util.Scanner;

public class Task2_2 {
    public static void main(String[] args) {

        int [] date ={31,29,31,30,31,30,31,31,30,31,30,31};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter month:");

        int month = scanner.nextInt();

        System.out.println("Enter date:");

        int day = scanner.nextInt();

        if (day <= date [month-1]) {
            System.out.println("This month has this date");
        } else {
            System.out.println("This month doesn't have this date");
        }
    }
}
