package com.wowapp;

import com.wowapp.enumerations.Move;

public class RockPaperScissors {
    private User user;
    private Computer computer;
    private StatisticsService statisticService;

    public RockPaperScissors() {
        user = new User();
        computer = new Computer();
        statisticService = new StatisticsService();
    }

    public void startGame() {
        System.out.println("New Rock, Paper, Scissors game started");


        playOneGame();

        if (user.wantToPlayAgain()) {
            System.out.println();
            startGame();
        } else {
            statisticService.printGameStatistics();
        }
    }

    private void playOneGame() {
        Move userMove = user.getMove();
        Move computerMove = computer.getRandomMove();

        System.out.println("You played " + userMove + ". Computer played " + computerMove);

        int gameResult = userMove.compare(computerMove);


        switch (gameResult) {
            case 0:
                System.out.println("Draw!");
                statisticService.gameDraw();
                break;
            case 1:
                System.out.println(userMove + " win " + computerMove + ". User is winner!");
                statisticService.userWin();
                break;
            case -1:
                System.out.println(computerMove + " beats " + userMove + ". Computer is winner!");
                statisticService.computerWin();
                break;
        }

    }


    public static void main(String[] args) {
        RockPaperScissors game = new RockPaperScissors();
        game.startGame();
    }
}