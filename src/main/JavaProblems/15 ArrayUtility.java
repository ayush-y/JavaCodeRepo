package org.JavaProblems;

import java.util.Arrays;
import java.util.Scanner;

class ArrayUtility {
    public static int[] inputArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of element: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int i = 0;
        while (i < size){
            System.out.print("Enter array element "+ (i+1)+" :");
            arr[i]  = sc.nextInt();
            i++;
        }
        return arr;
    }
    public static void display(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
}
