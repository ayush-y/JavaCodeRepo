package org.JavaProblems;

import java.util.Scanner;

 class SumOfOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        System.out.println(sumAllOdd(sc.nextInt()));
    }

    private static int sumAllOdd(int n) {
        int i = 0;
        int sum = 0;
        while (i <= n){
            if(i % 2 != 0){
                sum +=i;
            }
            i++;
        }
        return sum;
    }
}
