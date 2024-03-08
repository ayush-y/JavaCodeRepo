package org.JavaProblems;

import java.util.Scanner;

class Gcd {
  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the number : ");
   System.out.println(gcdOfTwo(sc.nextInt(), sc.nextInt()));
  }
 private static int gcdOfTwo(int a, int b) {
   int min = Math.min(a,b);
   int i = 2;
   int gcd = 1;
   while(i <= min){
    if(a % i == 0 && b % i == 0){
     gcd = i;
    }
    i++;
   }
   return gcd;
 }
}
