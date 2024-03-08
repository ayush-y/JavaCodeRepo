package org.JavaProblems;

import java.util.Scanner;

 class SumOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        System.out.println(sumOfDigits(sc.nextInt()));
    }

    private static int sumOfDigits(int n) {
        int sum = 0;
        while(n > 0){
            sum += n%10;
            n /=10;
        }
        return sum;
    }
}
