package Exercise;

import java.util.Scanner;

public class Exercise_Lab2_3 {

    //global variable
    public static final double PI = 3.141;

    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter radius of circie :");
        double r = scanner.nextDouble();

        double v =(4/3) * PI *r * r * r;

        System.out.println("The capacity of circle is :"+v);

    }

}
