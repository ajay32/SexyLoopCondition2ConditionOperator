package ajaymehta.sexyloopconditionconditionoperator;

import java.util.Scanner;

/**
 * Created by Avi Hacker on 7/6/2017.
 */
/*

        1010101
        0101010
        1010101
        0101010
        1010101
        0101010
        1010101

*/

public class Pattern15Alternative {  // this program taken from the pattern series...just because to show you..so to use loop to print alternative when you dont have option check odd even..see our j loop always starts
    // with 1  so..u cant do now  (i%2==0 ) always 1 ..so see the first column..or pattern..on every row..it will always start with 1 otherwise..so applied this type of technique.

    static Scanner sc = new Scanner(System.in);

    public static void forloop(int n) {

        for (int i = 1; i <= n; i++) {

            int num;
            if(i%2==0) {

                num =0;

                for (int j = 1; j <= n; j++) {

                    System.out.print(num+" ");
                    num = (num ==0)? 1:0;
                } // end of j loop
            } else {
                num = 1;

                for (int j = 1; j <= n; j++) {

                    System.out.print(num+" ");
                    num = (num ==0)? 1:0;
                } // end of j loop

            }
        System.out.println();
    }

    sc.close();
}


    public static void main(String args[]) {

        System.out.print("How many rows to create a pattern:");

        int x = sc.nextInt();

        System.out.println();

        forloop(x);
    }
}
