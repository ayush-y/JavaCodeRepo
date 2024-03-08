package PackagesPrctice.ExceptionPractice35;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number's ");
        int first = sc.nextInt();
        int second =  sc.nextInt();
        try {
            int res = first / second;
            System.out.printf("Result is %d ", res);
        } catch (ArithmeticException exp){
            if(exp.getMessage().equals("/ by zero")){
                System.out.println("Divide by zero occurred");
            } else{
                throw exp;
            }
        }
    }
}
