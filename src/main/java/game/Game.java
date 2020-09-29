package main.java.game;

import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userInput;

        Board board = new Board();
        boolean gameState = true;
        int move=0;
        do{
            move++;
            int currentPlayer = number(gameState);

            System.out.println("Your move - player " + currentPlayer);
            userInput = scanner.nextLine();

            //TODO 1) Change so user would have to input space between numbers. For example:
            //     1 1
            //     instead of:
            //     11
            int lastCh=userInput.length();

            int x;
            int y;
            try {
                lastCh = 3;

                x = Integer.parseInt(userInput.trim().substring(0, 1));
                y = Integer.parseInt(userInput.trim().substring(lastCh - 1, lastCh));

            } catch (Exception e){
                System.out.println("Check your input! Use Row Space Column e.g. 1 2");
                move--;
                continue;
            }
            String playMaker = marker(gameState);

            if (!board.makeMove(x, y, playMaker)) {
                System.out.println("Wrong coordinates! Try again!");
                move--;
                continue;
            }

            if (board.hasWinner(playMaker)) {
                System.out.println("P" + currentPlayer + " wins!");
                break;
            }
            gameState = !gameState;
            board.print();

            if (move==9){
                System.out.println("It is a draw!");
            }
        } while (move<9);
    }

    static String marker(boolean playerSwitch) {
        return playerSwitch ? "X" : "0";
    }

    static int number(boolean playerSwitch) {
        return playerSwitch ? 1 : 2;
    }

}
