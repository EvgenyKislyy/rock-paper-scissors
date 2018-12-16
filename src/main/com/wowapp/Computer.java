package com.wowapp;

import com.wowapp.enumerations.Move;

import java.util.Random;

public class Computer {
    public Move getRandomMove() {
        Random random = new Random();
        int index = random.nextInt(Move.values().length);
        return Move.values()[index];
    }
}