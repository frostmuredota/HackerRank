package hackerrank30days.interfaces;

/**
 * Created by ramon on 19-01-16.
 */
public class Calculator implements AdvancedArithmetic {
    @Override
    public int divisorSum(int n) {
        int sum = 0;
        for (int i = 1; i <=n ; i++) {
            if(n%i==0){
                sum+=i;
            }
        }
        return sum;
    }
}
