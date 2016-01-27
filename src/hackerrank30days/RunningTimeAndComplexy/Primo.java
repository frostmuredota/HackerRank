package hackerrank30days.RunningTimeAndComplexy;

import java.util.Scanner;

/**
 * Created by ramon on 25-01-16.
 */
public class Primo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        for (int i = 0; i <number ; i++) {
           isPrime(sc.nextInt());
        }
    }

    public static void isPrime(int n){
        int a = 0;
        String answer = "Prime";
        for (int i = 1; i <=n+1 ; i++) {
            if(a>2){
                answer="Not prime";
                break;
            }else{
                if(n%i==0){
                    a++;
                }
            }
        }
        System.out.println(answer);

    }



}
