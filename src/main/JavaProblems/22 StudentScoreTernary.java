package org.JavaProblems;

import java.util.Scanner;

class StudentScoreTernary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter student marks : ");
        int marks = sc.nextInt();
        String category = marks > 80 ? "High" : (marks > 50 ? "Moderate" : "Low");
        System.out.println("Student category is : "+ category );
    }
}
