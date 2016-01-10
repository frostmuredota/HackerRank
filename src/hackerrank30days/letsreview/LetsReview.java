package hackerrank30days.letsreview;

import java.util.Scanner;

/**
 * Created by ramon on 07-01-16.
 */
public class LetsReview {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int cont = 0;
        while(number>0){
            for (int i = 0; i <number-1 ; i++) {
                System.out.print(" "+"");
            }
            number--;
            cont++;
            for (int i = cont; i >0 ; i--) {
                System.out.print("#");
            }
            System.out.println();
        }


        /*
        while(cont<=number){
            for (int i = 0; i <cont ; i++) {
                System.out.print("#"+"");
            }
            cont++;
            System.out.println();
        }
*/
    }


}
