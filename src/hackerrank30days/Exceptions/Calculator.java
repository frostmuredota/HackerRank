package hackerrank30days.Exceptions;

/**
 * Created by ramon on 18-01-16.
 */
public class Calculator {
    public int power(int x, int y)throws Exception{
        if((x<0) || (y<0)){
            throw new Exception("n and p should be non-negative");
        }else{
            if(y==0){
                return 1;
            }else{
                if (y==1){
                    return x;
                }else{
                    return x * power(x,y-1);
                }
            }
        }
    }
}
