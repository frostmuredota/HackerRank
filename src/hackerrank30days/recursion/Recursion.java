package hackerrank30days.recursion;

import java.util.Scanner;

/**
 * Created by Arthas on 10-01-2016.
 */
public class Recursion {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        //Take Input
        int gcd=find_gcd(a,b);
        System.out.println(gcd);
    }
    static  int find_gcd(int a,int b){
        if (b==0) return a;
        return find_gcd(b,a%b);
    }
}
