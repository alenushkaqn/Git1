package DZ2;
import java.util.Scanner;

public class Task2_3 {
    public static void main(String[] args) {

        int count = 3;
        String rightAnswer = "Miami";
        String stop = "stop";

        Scanner scanner = new Scanner(System.in);
        System.out.println(
                "Where are you from? You have 3 attempts to answer. Or you can give up by typing stop!");

        for (int i = 1; i <= count; i++) {
            String userAnswer = scanner.next();
            if (rightAnswer.equals(userAnswer)) {
                System.out.println("That is correct!");
                break;
            } else if (userAnswer.equals(stop)) {
                System.out.println("Sorry to hear that, see you next time!");
                break;
            } else {
                System.out.println("Unfortunately, you are wrong!! It was your " + i + " of " + count + " attempt!");
            }
        }
    }
}
