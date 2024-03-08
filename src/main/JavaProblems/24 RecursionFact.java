package org.JavaProblems;

import java.util.Scanner;

class RecursionFact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter  number : ");
        int num = sc.nextInt();
        long ans = factRecursion(num);
        System.out.println("Factorial of number is :" +ans);
    }
    public static long factRecursion(int num){
        if(num == 1){
            return 1;
        }
        return num * factRecursion(num - 1);
    }
    public static long factIterative(int num){
        long result =1;
        for(int i = 1; i <= num; i++){
            result *=i;
        }
        return result;
    }
}
