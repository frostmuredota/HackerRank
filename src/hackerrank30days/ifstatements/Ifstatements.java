package hackerrank30days.ifstatements;

import java.util.Scanner;

/**
 * Created by ramon on 07-01-16.
 */
public class Ifstatements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String ans="";
        /*
        if(n%2==1)
            ans = "Weird";
        else
        {
            if((n>=2) && (n<=5))
                ans=" Not Weird";
            else{
                if((n>=6) && (n<=20))
                    ans="Weird";
                    else{
                    ans="Not Weird";
                }
            }

        }
        System.out.println(ans);
*/

        if(n%2==1){
            System.out.println("aqui");
            ans = "Weird";
        }else{
            if((n>=2) && (n<5)){
                System.out.println("aqui1");
                ans=" Not Weird";
            }else{
                if((n>=6) && (n<=20)){
                    System.out.println("aqui2");
                    ans="Weird";
                }else{
                    System.out.println("aqui3");
                    ans="Not Weird";
                }
            }
        }
        System.out.println(ans);
    }
}
