package javadomain.javaEasyLevel.Strings;

import java.util.Scanner;

/**
 * Created by Arthas on 09-01-2016.
 */
public class Introduction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        int size = a.length()+b.length();
        int compare = a.compareTo(b);
        System.out.println(size);
        if(compare>0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        char c = a.charAt(0);
        char d = b.charAt(0);
        StringBuilder string1 = new StringBuilder(a);
        StringBuilder string2 = new StringBuilder(b);
        string1.setCharAt(0,Character.toUpperCase(c));
        string2.setCharAt(0,Character.toUpperCase(d));
        System.out.println(string1+" "+string2);
    }
}
