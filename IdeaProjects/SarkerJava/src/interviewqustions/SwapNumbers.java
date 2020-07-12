package interviewqustions;

import java.sql.SQLOutput;

public class SwapNumbers {

    public static void main(String[] args) {
         int a=40;
         int b= 30;

        System.out.println("Before swapping");
        System.out.println("a = "+a);
        System.out.println("b = "+b);

        System.out.println("After swapping");
//        int temp=a;
//        a=b;
//        b=temp;
//        System.out.println("a = "+a);
//        System.out.println("b = "+b);

        System.out.println("===================== Without temp variable ========================");
        a=a-b;//10
        b=a+b;//40
        a=b-a;//30
        System.out.println("a = "+a);
        System.out.println("b = "+b);

    }
}
