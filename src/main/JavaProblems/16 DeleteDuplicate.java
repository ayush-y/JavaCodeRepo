package org.JavaProblems;

import java.util.Arrays;
import java.util.Scanner;

class DeleteDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = ArrayUtility.inputArray();
        System.out.print("Enter array element to delete :");
        int n = sc.nextInt();
        int i = 0;
        int count = 0;
        while(i < arr.length){
            if(n == arr[i]){
                count++;
            }
            i++;
        }
        int[] ans = deleteEle(arr, count, n);
        System.out.println(Arrays.toString(ans));

    }

    private static int[] deleteEle(int[] arr, int count, int n) {
        if(count == 0){
            return arr;
        }
        int size = arr.length - count;
        int[] org_arr = new int[size];
        int i  =0; int j = 0;
        while(i < arr.length){
            if(n != arr[i]){
                org_arr[j] = arr[i];
                j++;
            }
            i++;
        }
        return org_arr;
    }
}
