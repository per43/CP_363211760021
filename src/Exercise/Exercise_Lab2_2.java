package Exercise;

import java.util.Scanner;

public class Exercise_Lab2_2 {
    public static void main (String [] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input width:");
        double Width = in.nextDouble();
        System.out.println("Input height:");
        Double height = in.nextDouble();
        System.out.println("0.5*width*height");
        System.out.println("The triangular area:"+0.5*Width*height);


    }
}
