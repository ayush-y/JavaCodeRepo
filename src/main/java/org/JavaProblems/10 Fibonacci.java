package org.JavaProblems;

import java.util.Scanner;

class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        System.out.println(fibonacci(sc.nextInt()));
    }

    private static int fibonacci(int n) {
        int a = 0;
        int b = 1;
        int c = 0;
        int i =2;
        while(i < n){
            c = a+b;
            a = b;
            b = c;
            i++;
        }
        return c;
    }
}
