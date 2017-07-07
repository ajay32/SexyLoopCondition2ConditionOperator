package ajaymehta.sexyloopconditionconditionoperator;

/**
 * Created by Avi Hacker on 7/7/2017.
 */

public class Program2 {

    public static void main(String args[]) {

        int num=0;

        for(int i=1; i<=10; i++) {

            System.out.print(num+" "); // print number
            num = (num == 0)? 1 : 0; // if number is 0 then make it 1 ..if 1 make it 0 n again print it ..then again change..

        }

    }
}
