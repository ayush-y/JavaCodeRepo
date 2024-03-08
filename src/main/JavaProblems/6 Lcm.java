package org.JavaProblems;

import java.util.Scanner;

 class Lcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        System.out.println(lcmOfTwo(sc.nextInt(), sc.nextInt()));
    }

    private static int lcmOfTwo(int a, int b) {
        int i = 1;
        while(true) {
            int factor = a*i;
            if(factor % b == 0){
                return factor;
            }
            i++;
        }
    }
}
