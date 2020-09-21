package com.accenture.prebootcamp.tictactoe.game;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner oneMove=new Scanner(System.in);
        String moveAdd;

        Moves AllMoves=new Moves();
        GameField newGame=new GameField();
        newGame.printField(AllMoves.FillEmpty());
        do{
            System.out.println("Your move ");
            moveAdd=oneMove.nextLine();
            int x=Integer.parseInt(moveAdd.substring(0,1));
            int y=Integer.parseInt(moveAdd.substring(1,2));
            newGame.printField(AllMoves.NextMove(x,y));
        }while (moveAdd!="Stop");

    }
}
