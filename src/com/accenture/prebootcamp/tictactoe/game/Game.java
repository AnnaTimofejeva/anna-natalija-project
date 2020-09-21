package com.accenture.prebootcamp.tictactoe.game;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner oneMove=new Scanner(System.in);
        int moveAdd;

        Moves AllMoves=new Moves();
        GameField newGame=new GameField();
        newGame.printField(AllMoves.FillEmpty());
        do{
            System.out.println("Your move is ");
            moveAdd=oneMove.nextInt();
            newGame.printField(AllMoves.NextMove(((moveAdd-moveAdd%10)/10)%10,moveAdd%10));
        }while (moveAdd!=0);

    }
}
