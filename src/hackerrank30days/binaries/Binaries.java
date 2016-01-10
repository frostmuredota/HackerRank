package hackerrank30days.binaries;

import java.util.Scanner;

/**
 * Created by Arthas on 10-01-2016.
 */
public class Binaries {
    static int result=0;
    static String a="";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        for (int i = 0; i <cases; i++) {
            int n1= sc.nextInt();
            DecimalToBinaries(n1);
        }

    }

    public static void DecimalToBinaries(int number){
        if(number>0){
            while(number>0){
                result=number%2;
                number=number/2;
                a=a+result;
            }
            StringBuilder s = new StringBuilder(a);
            System.out.println(s.reverse().toString());
            a="";
        }else{
            System.out.println("0");
        }
    }



}
