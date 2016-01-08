package hackerrank.arrays;

import java.util.Scanner;

/**
 * Created by ramon on 08-01-16.
 */
public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numer_data = sc.nextInt();
        int array[] = new int[numer_data];
        for (int i = 0; i <numer_data ; i++) {
            array[i]=sc.nextInt();
        }
        for (int i = array.length-1; i >=0 ; i--) {
            System.out.print(array[i]+" ");
        }
    }
}
