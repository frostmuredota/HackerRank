package hackerrank30days.interfaces;

import java.util.Scanner;

/**
 * Created by ramon on 19-01-16.
 */
public class Interfaces {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        AdvancedArithmetic myCalculator=new Calculator();
        int sum=myCalculator.divisorSum(n);
        System.out.println("I implemented: AdvancedArithmetic\n"+sum);
    }
}
