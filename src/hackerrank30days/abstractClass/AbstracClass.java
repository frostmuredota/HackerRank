package hackerrank30days.abstractClass;

import javadomain.javaEasyLevel.Abstract.*;

import java.util.Scanner;

/**
 * Created by ramon on 12-01-16.
 */
public class AbstracClass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String title=sc.nextLine();
        String author = sc.nextLine();
        int price = sc.nextInt();
        MyBook new_novel=new MyBook(title,author,price);
        new_novel.display();
    }
}
