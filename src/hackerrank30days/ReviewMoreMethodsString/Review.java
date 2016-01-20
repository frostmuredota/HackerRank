package hackerrank30days.ReviewMoreMethodsString;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Created by ramon on 19-01-16.
 */
public class Review {
    public static void main(String[] args) {
        String pattern = "[ !,?\\._'@]+";
        Scanner sc = new Scanner(System.in);
        String phrase = sc.nextLine();
        StringTokenizer stk = new StringTokenizer(phrase,pattern);
        System.out.println(stk.countTokens());
        while (stk.hasMoreTokens()){
            System.out.println(stk.nextToken());
        }

    }
}
