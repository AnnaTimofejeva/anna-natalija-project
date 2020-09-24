package com.accenture.prebootcamp.tictactoe.game;

public class Board {
    private String[][] board = new String[3][3];

    Board() {
        reset();
        print();
    }

    void print() {
        System.out.println("  1   2   3 ");
        System.out.println("1 " + board[0][0] + " | " + board[0][1] + " | " + board[0][2] + " ");
        System.out.println(" -----------");
        System.out.println("2 " + board[1][0] + " | " + board[1][1] + " | " + board[1][2] + " ");
        System.out.println(" -----------");
        System.out.println("3 " + board[2][0] + " | " + board[2][1] + " | " + board[2][2] + " ");
    }

    boolean makeMove(int x, int y, String sign) {
        if (x <= 3 && y <= 3 && x > 0 && y > 0 && (board[x - 1][y - 1].equals(" "))) {
            board[x - 1][y - 1] = sign;
            return true;
        }
        return false;
    }


    boolean hasWinner(String marker) {
        int check = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j].equals(marker)) {
                    check++;
                }
            }
            if (check == 3) {
                return true;
            } else {
                check = 0;
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[j][i].equals(marker)) {
                    check++;
                }
            }
            if (check == 3) {
                return true;
            } else {
                check = 0;
            }
        }

        for (int i = 0; i < 3; i++) {
            if (board[i][i].equals(marker)) {
                check++;
            }
        }
        if (check == 3) {
            return true;
        } else {
            check = 0;
        }

        for (int i = 0; i < 3; i++) {
            if (board[2 - i][i].equals(marker)) {
                check++;
            }
        }
        if (check == 3) {
            return true;
        } else {
            check = 0;
        }

        return false;
    }
    private void reset() {
        for (int i = 0; i < 3; i++) {
            for (int y = 0; y < 3; y++) {
                board[i][y] = " ";
            }
        }
    }
}
