package hackerrank30days.Arrays2D;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ramon on 11-01-16.
 */
public class Arrays2d {
    static int suma_mayor = 0;
    public static void main(String[] args) {
        int[][] matrix = new int[6][6];
        int [][] aux = new int [3][3];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = (int) (Math.random() * 10);
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                //System.out.print("["+matrix[i][j]+""+"]");
                System.out.print("[" + matrix[i][j] + "" + "]");
            }
            System.out.println();
        }

        System.out.println();

         int point = 0;

        for (int i = 1; i <matrix.length-1 ; i++) {
            for (int j = 1; j <matrix.length-1 ; j++) {
                System.out.println("("+i+","+j+")");
            }
            System.out.println();
        }

    }

    public static int suma(int [][]matrix){
        int suma = 0;
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j <matrix.length ; j++) {
                suma+=matrix[i][j];
            }
        }
        suma += -(matrix[matrix.length/2][(matrix.length/2)-1]+matrix[matrix.length/2][(matrix.length/2)+1]);
        return suma;
    }
   /*public static [][]submatrix(int [][]matrix,int x,int y){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {

            }
        }
    }
*/
}
