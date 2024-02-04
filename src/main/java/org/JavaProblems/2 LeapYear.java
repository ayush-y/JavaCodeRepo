package org.JavaProblems;

import java.util.Scanner;

 class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year to be a leap Year :");
        int year = sc.nextInt();
        if(year % 400 == 0){
            System.out.println("Year is leap year ");
        } else if(year % 4 == 0 && (year & 100) != 0){
            System.out.println("Year is leap year ");
        } else
            System.out.println("This is not a leap year "+ year);
    }
}
