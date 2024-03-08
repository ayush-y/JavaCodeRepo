package org.JavaProblems;

import java.util.Arrays;

class Merge2SortedArray {
    public static void main(String[] args) {
        int[] arr1 = ArrayUtility.inputArray();
        int[] arr2 = ArrayUtility.inputArray();
        System.out.println("Merge two sorted array is : ");
        int[] ans = mergeArr(arr1, arr2);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] mergeArr(int[] arr1, int[] arr2) {
        int i = 0,  j = 0, k = 0;
        int newSize = arr1.length+ arr2.length;
        int[] newArr = new int[newSize];
        while(i < arr1.length || j < arr2.length){
            if(j == arr2.length ||
                    (i < arr1.length && arr1[i] < arr2[j])){
                newArr[k] = arr1[i];
                i++;
                k++;
            } else{
                newArr[k] = arr2[j];
                j++;
                k++;
            }
        }
        return newArr;
    }
}
