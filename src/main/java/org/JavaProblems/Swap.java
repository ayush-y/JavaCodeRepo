package org.JavaProblems;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        System.out.println("Hello");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number's ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a;
        a = b;
        b = c;
        System.out.println("Value of a is "+a);
        System.out.println("Value of a is "+b);
    }

}

