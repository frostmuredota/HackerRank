package hackerrank30days.inheritance;

/**
 * Created by ramon on 12-01-16.
 */
public class Student {
    protected String firstName;
    protected String lastName;
    int phone;

    public Student(String firstName,String lastName,int phone) {
        this.firstName = firstName;
        this.lastName=lastName;
        this.phone=phone;
    }

    public void display(){// display the details of the student
        System.out.println("First Name: "+firstName+"\nLast Name: "+lastName+"\nPhone: "+phone);
    }


}
