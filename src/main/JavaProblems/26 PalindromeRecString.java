package org.JavaProblems;

import java.util.Scanner;

class PalindromeRecString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter  the string : ");
        String str = sc.next();

        System.out.println("Yhe given string is "+ ((isPalin(str) ? "Palindrome" : "Not Palindrome")));
    }

    private static boolean isPalin(String str) {
        if(str.length() <= 1){
            return true;
        }
        int lastPos = str.length()-1;
        System.out.println("The last pos is "+ lastPos);
        if(str.charAt(0) != str.charAt(lastPos)){
            return false;
        }
        String newStr = str.substring(1, lastPos);
        System.out.println("The new String is : "+newStr);
        return isPalin(newStr);
    }
}
