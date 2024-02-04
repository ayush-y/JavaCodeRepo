package org.JavaProblems;

import java.util.Scanner;

class ReverseDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        System.out.println(reverseDigit(sc.nextInt()));
    }

    private static int reverseDigit(int n) {
        int rev = 0;
        while(n > 0){
            int digit = n%10;
            rev = rev*10 + digit;
            n/=10;
        }
        return rev;
    }
}
