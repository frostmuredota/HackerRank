package hackerrank30days.inheritance;

/**
 * Created by ramon on 12-01-16.
 */
public class Grade extends Student{
    private int score;

    public Grade(String name,String lastname,int phone,int score){
        super(name,lastname,phone);
        this.score=score;
    }

    public char Calculate(){
       if(score<40){
           return 'D';
        }else{
           if((score>=40) && (score<60)){
               return 'B';
           }else{
               if((score>=60) && (score<75)){
                   return 'A';
               }else{
                   if((score>=75) && (score<90)){
                       return 'E';
                   }else
                  return 'O';

               }

           }

       }

    }
}
