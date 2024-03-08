package org.JavaProblems;

import java.util.Scanner;

class OccurrenceArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Occurrence array :");
        int[] numArr = ArrayUtility.inputArray();
        System.out.println("Enter number you want to find :");
        int num = sc.nextInt();
        int ans = occurrenceArr(numArr, num);
        System.out.println("Occurrence of the element in array is :"+ ans);
    }

    private static int occurrenceArr(int[] arr, int n) {
        int i =0;
        int count = 0;
        while(i < arr.length){
            if(arr[i] == n){
                count++;
            }
            i++;
        }
        return count;
    }

}
