package java;

/**
 * Created by superova on 19.03.2017.
 */
public class Lesson3 {
    public static void main(String[] args){
        int absval, val;
        val = 5;
        absval = val < 0 ? -val : val;
        System.out.println(absval);
        val = -5;
        absval = val < 0 ? -val : val;
        System.out.println(absval);
    }
}
