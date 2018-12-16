package com.wowapp;

import com.wowapp.enumerations.Move;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComputerMovesTest {


    @Test
    public void testComputerMoves() {
        Computer computer = new Computer();
        Map<Move, Integer> movesMap = new HashMap<>();


        for (int cnt = 0; cnt < 20; cnt++) {
            Move move = computer.getRandomMove();
            movesMap.putIfAbsent(move, 1);
            movesMap.compute(move, (k, v) -> v + 1);
        }

        assertEquals(3, movesMap.keySet().size());

    }

}
