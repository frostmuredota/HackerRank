package hackerrank30days.generics;

/**
 * Created by ramon on 21-01-16.
 */
public class Printer<E> {
    //Write your code here
    void printArray(E[]array){
        for(int i=0;i<array.length ; i++){
            System.out.println(array[i]);
        }
    }

}
