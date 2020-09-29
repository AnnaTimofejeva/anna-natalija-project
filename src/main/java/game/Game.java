package main.java.game;

import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userInput;

        Board board = new Board();
        boolean gameState = true;
        int move=1;
        do{
            int currentPlayer = number(gameState);

            System.out.println("Your move - player " + currentPlayer);
            userInput = scanner.nextLine();

            //TODO 1) Change so user would have to input space between numbers. For example:
            //     1 1
            //     instead of:
            //     11
            int x, y;

            if (isNumeric(userInput)&&userInput.replace(" ","").length()==2){
                x = Integer.parseInt(userInput.trim().substring(0, 1));
                y = Integer.parseInt(userInput.trim().substring(2, 3));
            } else {
                System.out.println("Check your input! You should input 3 characters - RowNr Space ColumnNr e.g. 1 2");
                continue;
            }


            String playMaker = marker(gameState);

            if (!board.makeMove(x, y, playMaker)) {
                System.out.println("Wrong coordinates! Try again!");
                continue;
            }

            if (board.hasWinner(playMaker)) {
                System.out.println("P" + currentPlayer + " wins!");
                break;
            }
            gameState = !gameState;
            board.print();

        } while (++move<9);
        System.out.println("It is a draw!");
    }

    static String marker(boolean playerSwitch) {
        return playerSwitch ? "X" : "0";
    }

    static int number(boolean playerSwitch) {
        return playerSwitch ? 1 : 2;
    }

    private static boolean isNumeric(String input) {
        try {
            Integer.parseInt(input.replace(" ",""));
        } catch (NumberFormatException ex) {
            return false;
        }
        return true;
    }


}
