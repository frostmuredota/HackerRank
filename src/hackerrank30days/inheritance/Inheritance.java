package hackerrank30days.inheritance;

import java.util.Scanner;

/**
 * Created by ramon on 12-01-16.
 */
public class Inheritance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String firstName=sc.nextLine();
        String lastName=sc.nextLine();
        int phone=sc.nextInt();
        int score=sc.nextInt();
        Student stu=new Grade(firstName,lastName,phone,score);
        stu.display();
        Grade g=(Grade)stu;
        System.out.println("Grade: "+g.Calculate());


    }
}
