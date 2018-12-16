package com.wowapp;

import com.wowapp.enumerations.Move;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MovesLogicTest {

    @Test
    public void testMovesLogic() {

        assertEquals(0, Move.PAPER.compare(Move.PAPER));
        assertEquals(0, Move.ROCK.compare(Move.ROCK));
        assertEquals(0, Move.SCISSORS.compare(Move.SCISSORS));

        assertEquals(1, Move.PAPER.compare(Move.ROCK));
        assertEquals(1, Move.SCISSORS.compare(Move.PAPER));
        assertEquals(1, Move.ROCK.compare(Move.SCISSORS));

        assertEquals(-1, Move.ROCK.compare(Move.PAPER));
        assertEquals(-1, Move.PAPER.compare(Move.SCISSORS));
        assertEquals(-1, Move.SCISSORS.compare(Move.ROCK));

    }
}
