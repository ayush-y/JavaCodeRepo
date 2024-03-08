package org.JavaProblems;

class ReverseArray {
    public static void main(String[] args) {
        int[] arr = ArrayUtility.inputArray();
        int[] ans = reverseArray(arr);
        ArrayUtility.display(ans);
    }

    private static int[] reverseArray(int[] arr) {
        int i = 0;
        int j = arr.length-1;
        while(i <= j){
            swapEle(arr, i, j);
            i++;
            j--;
        }
        return arr;
    }

    private static void swapEle(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
