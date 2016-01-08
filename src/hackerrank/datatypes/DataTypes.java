package hackerrank.datatypes;

/**
 * Created by ramon on 07-01-16.
 */
public class DataTypes {
    public static void main(String[] args) {

        Object [] data = new Object[]{5.35,'a',false,100,"I am a code monkey",true,17.3,'c',"derp"};
        for (int i = 0; i <data.length; i++) {
            if(data[i] instanceof Double){
                System.out.println("Primitive : double");
            }
            if(data[i] instanceof Integer){
                System.out.println("Primitive : int");
            }
            if(data[i] instanceof String){
                System.out.println("Reference : String");
            }
            if(data[i] instanceof Character){
                System.out.println("Primitive : char");
            }
            if(data[i] instanceof Boolean){
                System.out.println("Primitive : boolean");
            }
        }
    }
}
