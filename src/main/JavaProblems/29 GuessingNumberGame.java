package org.JavaProblems;

import java.util.Scanner;

class GuessingNumberGame {
    int random;
    GuessingNumberGame(){
        random = (int) Math.ceil((Math.random())*100);
    }

    /**
     *
     * @param guessNumber The number that player that guess
     * @return
     * - Negative if the guessed number is less
     * + Positive if the guessed number is greater
     * 0 if guessed number is correct
     *
     */
    int guessNumber(int guessNumber){
        return guessNumber - random;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GuessingNumberGame game = new GuessingNumberGame();
        System.out.println("Welcome to the guessing game, guess the number between 1 - 100 ");
        int guess;
        int result;

        do{
            System.out.print("Guess the number :");
            guess = sc.nextInt();
            result = game.guessNumber(guess);
            if(result == 0){
                System.out.println("You guessed the correct number :");
            } else if (result < 0) {
                System.out.println("Please enter greater number :");
            } else
                System.out.println("Please enter the lower number :");
        }while (result != 0);
    }
}
