package hackerrank30days.scope;

import java.util.Scanner;

/**
 * Created by ramon on 14-01-16.
 */
public class Scope {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        Difference D = new Difference(arr);
        D.computeDifference();
        System.out.println(D.maximumDifference);

    }
}
