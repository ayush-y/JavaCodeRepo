package org.JavaProblems;

import java.util.Scanner;

class PasswordChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pass;

        do{
            System.out.print("Please enter  the password : ");
            pass = sc.next();

        } while(!IsPassValid(pass));
        System.out.println("This is correct password ");
    }

    private static boolean IsPassValid(String pass) {
        return pass.length() > 6;
    }
}
