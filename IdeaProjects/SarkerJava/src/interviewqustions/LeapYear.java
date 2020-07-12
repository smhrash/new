package interviewqustions;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {

        // Century year is a leap year only when it's perfectly divided by 400
        // 1900 is not a leap year
        // 2012, 2016 is leap year

        Scanner input= new Scanner(System.in);
        System.out.println("Please enter the year number");

        int year=input.nextInt();
        boolean isLeapYear=false;

        if (year%4==0){
            if (year%100==0){
                if (year%400==0){
                    isLeapYear=true;
                }else {
                    isLeapYear=false;

                }
            }else {
                isLeapYear=true;

            }

        }else {
            isLeapYear=false;
        }
        if (isLeapYear){
            System.out.println(year+" is leap year");
        }
        else {
            System.out.println(year+ " is not a leap year");
        }


    }

}
