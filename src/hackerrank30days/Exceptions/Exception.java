package hackerrank30days.Exceptions;

/**
 * Created by ramon on 18-01-16.
 */
public class Exception extends java.lang.Exception {
    private String msg;

    public Exception(String m){
        super(m);
        this.msg=m;
    }

    public String getMsg(){
        return msg;
    }
}

