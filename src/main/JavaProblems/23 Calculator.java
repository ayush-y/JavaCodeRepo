package org.JavaProblems;

import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter first number : ");
        int num1 = sc.nextInt();
        System.out.print("Please enter second number : ");
        int num2 = sc.nextInt();
        System.out.print("Please enter operation to perform : ");
        String operation = sc.next();
        int result = switch (operation){
            case "+" -> num1+num2;
            case "-" -> num1-num2;
            case "*" -> num1*num2;
            case "/" -> num1/num2;
            default -> -1;
        };
        System.out.println("the result is : "+result);
    }
}
