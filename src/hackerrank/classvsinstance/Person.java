package hackerrank.classvsinstance;

/**
 * Created by ramon on 07-01-16.
 */
public class Person {
    private int age;

    public Person(int initial_Age){
        if(initial_Age<0){
            System.out.println("This person is not valid, setting age to 0.");
            initial_Age=0;
            this.age=initial_Age;
        }else{
            this.age=initial_Age;
        }
    }

    public void amIOld(){
        if(age<13)
            System.out.println("You are young");
        else{
            if((age>=13)&&(age<18))
                System.out.println("You are a teenager");
            else{
                System.out.println("You are old");
            }
        }
    }

    public void yearPasses(){
        this.age=age+1;
    }
}
