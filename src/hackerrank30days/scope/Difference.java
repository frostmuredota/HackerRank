package hackerrank30days.scope;

import java.util.Arrays;

/**
 * Created by ramon on 14-01-16.
 */
public class Difference {
    private int[]elements;
    public int maximumDifference;

    public Difference(int []arr){
        elements=arr;
        maximumDifference=0;
    }

    public void computeDifference(){
        int i = 0;
        /*
        while (i<elements.length){
            for (int j = 0; j <elements.length ; j++) {
                maximumDifference = Math.max(maximumDifference,Math.abs(elements[i]-elements[j]));
            }
            i++;
        }
        */
        //SECOND SOLUTION

        Arrays.sort(elements);
        maximumDifference = elements[elements.length-1]-elements[0];

    }
}
