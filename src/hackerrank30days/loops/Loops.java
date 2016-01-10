package hackerrank30days.loops;

import java.util.Scanner;

/**
 * Created by ramon on 07-01-16.
 */
public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int past_value=0;
        int numberOfTest = sc.nextInt();
        for (int i = 0; i < numberOfTest; i++) {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int N=sc.nextInt();

            for (int j = 0; j < N; j++) {
                int term = a + calculate(j,b);
                System.out.print(term+" ");
            }
            System.out.println();
        }
    }

    public static int calculate(int n,int m){
        if(n==0){
            return (int)(Math.pow(2,0))*m;
        }else{
            return calculate(n-1,m)+(int)(Math.pow(2,n))*m;
        }
    }
}
