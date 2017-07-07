package ajaymehta.sexyloopconditionconditionoperator;

import java.util.Scanner;

/**
 * Created by Avi Hacker on 7/7/2017.
 */

public class Program3 {

    public static void main(String args[]) {

        System.out.print("You want loop to start with Zero or One..TYpe it:: ");  // one put 0 n 1 to make it work..
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        if(x == 0) {

            for(int i=1; i<=10; i++){

                System.out.print(x+" ");
                x = (x==0)? 1: 0;
            }
        } else {

            for(int i=1; i<=10; i++){

                System.out.print(x+" ");
                x = (x==0)? 1: 0;
            }

        }
    }
}

