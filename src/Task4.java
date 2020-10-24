import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" Enter number: ");

        int a = 300;
        int b = scan.nextInt();

        if (b < 0.9 * a || b > 1.1 * a) {
            System.out.println( "Number: " + b + " 10% more from " + a) ;

        }else {
            System.out.println(" Number: " + b + " 10% less from" + a);
        }
    }

}



