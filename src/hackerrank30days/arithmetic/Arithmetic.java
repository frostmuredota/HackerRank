package hackerrank30days.arithmetic;

import java.util.Scanner;

/**
 * Created by ramon on 07-01-16.
 */
public class Arithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double M = sc.nextDouble();
        int T = sc.nextInt();
        int X = sc.nextInt();

        double tip = (T*M)/100;
        double tax = (X*M)/100;

        int final_price = (int) Math.round(M+tax+tip);

        System.out.println("The final price of the meal is $"+final_price+".");
    }
}
