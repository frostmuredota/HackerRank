package hackerrank30days.TestingPart1;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by ramon on 26-01-16.
 */
public class Testing {
        static int value=0;
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int d1 = in.nextInt();
            int m1 = in.nextInt();
            int y1 = in.nextInt();
            int d2 = in.nextInt();
            int m2 = in.nextInt();
            int y2 = in.nextInt();

            int yeardiff = y1-y2;
            int monthdiff = m1-m2;
            int daydiff = d1-d2;

            System.out.println(printValue(yeardiff, monthdiff, daydiff));

            /*
            Calendar cal = new GregorianCalendar(y1,m1,d1);
            Calendar cal1 = new GregorianCalendar(y2,m2,d2);
            SimpleDateFormat sdf = new SimpleDateFormat("dd MM yyyy");

            if(cal.get(Calendar.YEAR)==cal1.get(Calendar.YEAR)){
                if((cal.before(cal1)) || (cal.compareTo(cal1)==0)){
                    value=0;
                }else{
                    if(cal.get(Calendar.MONTH)==cal1.get(Calendar.MONTH)){
                        value=15*(Math.abs(cal.get(Calendar.DAY_OF_MONTH)-cal1.get(Calendar.DAY_OF_MONTH)));
                    }else{
                        value=500*(Math.abs(cal.get(Calendar.MONTH)-cal1.get(Calendar.MONTH)));
                    }
                }
            }else{
                value=10000;
            }
            System.out.println(value);
            */
        }

    private static int printValue(int yeardiff, int monthdiff, int daydiff) {
        if(yeardiff>0) return 10000;
        if(yeardiff==0 && monthdiff==0 && daydiff>0) return 15*daydiff;
        if(yeardiff==0 && monthdiff>0) return 500*monthdiff;
        return  0;
    }
}
