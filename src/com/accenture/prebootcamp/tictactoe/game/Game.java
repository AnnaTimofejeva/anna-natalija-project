package com.accenture.prebootcamp.tictactoe.game;

import java.util.Scanner;

public class Game {
public static int mainPlNr=1;
    public static void main(String[] args) {
        Scanner oneMove=new Scanner(System.in);
        String moveAdd;

        Moves AllMoves=new Moves();
        GameField newGame=new GameField();
//draw empty game field
        newGame.printField(AllMoves.FillEmpty());

//Start the game
        do{
            System.out.println("Your move P"+mainPlNr);
            moveAdd=oneMove.nextLine();
//determine first coordinate
            int x=Integer.parseInt(moveAdd.trim().substring(0,1));
//determine second coordinate
            int y=Integer.parseInt(moveAdd.trim().substring(1,2));
//Draw game Filed with new move
            newGame.printField(AllMoves.NextMove(x,y,mainPlNr));
//Check for the win
            if (AllMoves.Winner(mainPlNr)){
                System.out.println("P"+mainPlNr+" wins!");
                break;
            }
//Change player
            if (Game.mainPlNr==2){
                Game.mainPlNr=1;
            }else{
                Game.mainPlNr=2;
            }
        }while (moveAdd!="Stop");

    }
}
