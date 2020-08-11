package Exercise;

import java.util.Scanner;

public class Exercise_Lab2_1 {

    public static void main (int[] args) {

        Scanner scanner = new Scanner(System.in);
        String number;
        System.out.print("Enter a n1?");
        int a = scanner.nextInt();
        System.out.print("Enter b n2?");
        int b = scanner.nextInt();
        System.out.print("Enter c n3?");
        int c = scanner.nextInt();
        System.out.print("Enter d n4?");
        int d = scanner.nextInt();
        System.out.print("Enter e n5?");
        int f = scanner.nextInt();
        System.out.print("Enter f n5?");

        //finding
        int total = a + b + c + d + f;
        int avg = total / 5;

        //display
        System.out.println("Total = " +total);
        System.out.println("Aveeage = " +avg);





    }


}
