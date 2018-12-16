package com.wowapp;

import com.wowapp.enumerations.Statistics;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class StatisticsTest {

    @Test
    public void statisticTest() {
        com.wowapp.StatisticsService statisticsService = new com.wowapp.StatisticsService();
        assertEquals(statisticsService.getStatisticMap().get(Statistics.COMPUTER_WIN), Integer.valueOf(0));
        assertEquals(statisticsService.getStatisticMap().get(Statistics.GAMES_NUMBER), Integer.valueOf(0));
        assertEquals(statisticsService.getStatisticMap().get(Statistics.USER_WIN), Integer.valueOf(0));

        statisticsService.computerWin();
        statisticsService.computerWin();

        assertEquals(Integer.valueOf(2), statisticsService.getStatisticMap().get(Statistics.GAMES_NUMBER));
        assertEquals(Integer.valueOf(2), statisticsService.getStatisticMap().get(Statistics.COMPUTER_WIN));


        statisticsService.userWin();
        statisticsService.userWin();
        statisticsService.userWin();
        statisticsService.userWin();
        assertEquals(Integer.valueOf(4), statisticsService.getStatisticMap().get(Statistics.USER_WIN));
        assertEquals(Integer.valueOf(6), statisticsService.getStatisticMap().get(Statistics.GAMES_NUMBER));

        statisticsService.gameDraw();
        statisticsService.gameDraw();
        statisticsService.gameDraw();
        assertEquals(Integer.valueOf(3), statisticsService.getStatisticMap().get(Statistics.GAME_DRAW));
        assertEquals(Integer.valueOf(9), statisticsService.getStatisticMap().get(Statistics.GAMES_NUMBER));
    }
}
