package com.company;
import java.util.Scanner;
import java.util.Random;

class game{
    public int number;
    public int inputNumber;
    public int numberOfGuesses=0;
    game(){
        Random rand=new Random();
        this.number= rand.nextInt(100);
    }
    public int getNumberOfGuesses() {
        return numberOfGuesses;
    }
    public void setNumberOfGuesses(int numberOfGuesses) {
        this.numberOfGuesses = numberOfGuesses;
    }
    void takeUserInput(){
        System.out.print("Guess the input number: ");
        Scanner sc=new Scanner(System.in);
        inputNumber=sc.nextInt();
    }
    boolean isCorrectNumber(){
        numberOfGuesses++;
        if (inputNumber==number){
            System.out.format("YES YOU GUESSED IT RIGHT %d\nYOU PASSED IT IN %d ATTEMPTS",number,numberOfGuesses);
            System.out.println("");
            return true;
        } else if (inputNumber<number) {
            System.out.println("Too less...");
        }
        else if (inputNumber>number){
            System.out.println("Too high...");
        }
        return false;
    }
}
public class CWH_43_EX3 {
    public static void main(String[] args) {
        /*

            Create a class Game, which allows a user to play "Guess the Number"
            game once. Game should have the following methods:
            1. Constructor to generate the random number.
            2. takeUserInput() to take a user input of number
            3. isCorrectNumber() to detect whether the number entered by the user is True
            4. getter and setter
            Use props such as noofguesses(int),etc to get this task
         */
        game g=new game();
        boolean b=false;
        while(!b) {
            g.takeUserInput();
            b = g.isCorrectNumber();
        }
    }
}
