package com.wowapp;

import com.wowapp.enumerations.Move;

import java.util.Scanner;

public class User {
    private Scanner inputScanner;

    public User() {
        inputScanner = new Scanner(System.in);
    }

    public Move getMove() {
        System.out.print("Rock (1), paper (2), or scissors (3)? ");

        String userInput = inputScanner.nextLine();
        char firstLetter = userInput.toUpperCase().charAt(0);
        if (firstLetter == '1' || firstLetter == '2' || firstLetter == '3') {
            return Move.values()[Character.getNumericValue(firstLetter) - 1];
        } else {
            return getMove();
        }
    }

    public boolean wantToPlayAgain() {
        System.out.print("Do you want to play again? (Y/N)?");
        String userInput = inputScanner.nextLine();
        return userInput.toUpperCase().charAt(0) == 'Y';
    }
}