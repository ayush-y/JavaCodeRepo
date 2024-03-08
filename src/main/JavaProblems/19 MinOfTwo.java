package org.JavaProblems;

import java.util.Scanner;

class MinOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        MinOfTwo ternary = new MinOfTwo();
        int num = ternary.minNum(a,b);
        System.out.println("The greater number is "+num);
    }
    public int minNum(int a, int b){

        return a > b ? a : b;
    }
}
