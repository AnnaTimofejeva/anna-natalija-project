package com.accenture.prebootcamp.tictactoe.teacher.game;

import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userInput;

        Board board = new Board();
        boolean gameState = true;
        do {
            int currentPlayer = number(gameState);

            System.out.println("Your move - player " + currentPlayer);
            userInput = scanner.nextLine();

            //TODO 1) Change so user would have to input space between numbers. For example:
            //     1 1
            //     instead of:
            //     11
            int x = Integer.parseInt(userInput.trim().substring(0, 1));
            int y = Integer.parseInt(userInput.trim().substring(1, 2));

            String playerMarker = marker(gameState);

            if (!board.makeMove(x, y, playerMarker)) {
                System.out.println("Wrong coordinates! Try again!");
                continue;
            }

            if (board.hasWinner(playerMarker)) {
                System.out.println("P" + currentPlayer + " wins!");
                break;
            }
            gameState = !gameState;
            board.print();
        } while (!"stop".equalsIgnoreCase(userInput));
    }

    static String marker(boolean playerSwitch) {
        return playerSwitch ? "X" : "0";
    }

    static int number(boolean playerSwitch) {
        return playerSwitch ? 1 : 2;
    }
}
