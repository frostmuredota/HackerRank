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
          if(isPrime(sc.nextInt())){
              System.out.println("Prime");
          }else{
              System.out.println("Not prime");
          }
        }
    }
public static boolean isPrime(int n){
    boolean result = true;
    if(n == 1 || n == 0)
        result = false;
    if(n == 2)
        return true;
    if(n == 3)
        return true;
    int sqrt = (int) Math.sqrt(n) + 1;
    for(int j = 2; j < sqrt;j++){
        if(n % j == 0)
            result = false;
    }


    return result;

}


}
