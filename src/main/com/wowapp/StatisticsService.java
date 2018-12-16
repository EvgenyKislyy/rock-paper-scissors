package com.wowapp;

import com.wowapp.enumerations.Statistics;

import java.util.HashMap;
import java.util.Map;

import static com.wowapp.enumerations.Statistics.*;

public class StatisticsService {

    private Map<Statistics, Integer> statistic = new HashMap<>();

    public StatisticsService() {
        statistic.put(GAMES_NUMBER, 0);
        statistic.put(USER_WIN, 0);
        statistic.put(COMPUTER_WIN, 0);
        statistic.put(GAME_DRAW, 0);
    }

    public Map<Statistics, Integer> getStatisticMap() {
        return statistic;
    }

    public void printGameStatistics() {
        System.out.println(statistic);
    }


    public void userWin() {
        statistic.compute(USER_WIN, (k, v) -> v+1);
        statistic.compute(GAMES_NUMBER, (k, v) -> v+1);
    }

    public void computerWin() {
        statistic.compute(COMPUTER_WIN, (k, v) -> v + 1);
        statistic.compute(GAMES_NUMBER, (k, v) -> v + 1);
    }

    public void gameDraw() {
        statistic.compute(GAME_DRAW, (k, v) -> v + 1);
        statistic.compute(GAMES_NUMBER, (k, v) -> v+1);
    }
}
