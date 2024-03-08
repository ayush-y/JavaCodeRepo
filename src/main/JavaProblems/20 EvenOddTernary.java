package org.JavaProblems;

import java.util.Scanner;

class EvenOddTernary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String ans = (a%2 == 0) ? "even" : "odd";
        System.out.println("Number is given is " +ans);

    }
}
