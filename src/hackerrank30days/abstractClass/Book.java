package hackerrank30days.abstractClass;

/**
 * Created by ramon on 12-01-16.
 */
public abstract class Book {
    String title;
    String author;

    public Book(String t,String a){
        title=t;
        author=a;
    }
    abstract void display();
}
