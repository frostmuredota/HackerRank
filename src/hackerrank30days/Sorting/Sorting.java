package hackerrank30days.Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by ramon on 18-01-16.
 */
public class Sorting {
    static int minabsolutedifference=0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val1 =0;
        int val2=0;
        int [] arr = new int[sc.nextInt()];
        List<Integer> aux = new ArrayList<Integer>();
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = sc.nextInt();
        }
        int j =0;

        Arrays.sort(arr);
        for (int i = 0; i+1 <arr.length ; i++) {
            int r = Math.abs(arr[i] - arr[i+1]);
            if(minabsolutedifference==0){
                aux.add(arr[i]);
                aux.add(arr[i+1]);
                minabsolutedifference = r;
            }else{
                if(r<minabsolutedifference){
                    val1=arr[i];
                    val2=arr[i+1];
                    aux.clear();
                    aux.add(val1);
                    aux.add(val2);
                    minabsolutedifference=r;
                }else{
                    if(r==minabsolutedifference){
                        aux.add(arr[i]);
                        aux.add(arr[i + 1]);
                    }
                }
            }

        }

        for (int i = 0; i <aux.size() ; i++) {
            System.out.print(aux.get(i) + " ");
        }
    }
}
