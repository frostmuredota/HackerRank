package hackerrank30days.abstractClass;

/**
 * Created by ramon on 12-01-16.
 */
public class MyBook extends Book {

    int price;
    public MyBook(String t, String a, int p){
        super(t,a);
        this.price=p;
    }
    @Override
    void display() {
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Price: "+price);
    }
}
