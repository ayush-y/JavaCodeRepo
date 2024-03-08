package org.JavaProblems;

class AverageSum {
    public static void main(String[] args) {
    int[] numArray = ArrayUtility.inputArray();
        int sum = sumArr(numArray);
        System.out.println("Sum of the array is  :" +sum);
        double average = aveArr(numArray);
        System.out.println("Average of the array :"+ average);
    }

    private static double aveArr(int[] arr) {
        double averageSum = sumArr(arr);
        int size = arr.length;

        return (averageSum/size);
    }

    private static int sumArr(int[] arr) {
        int i =0;
        int size = arr.length;
        int sum = 0;
        while(i < size){
            sum +=arr[i];
            i++;
        }
        return sum;
    }

}
