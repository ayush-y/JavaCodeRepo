package org.JavaProblems;

import java.util.Scanner;
class AbsoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int num = a < 0 ? -a : a;
        System.out.println("Absolute value is "+ num);
    }
}
