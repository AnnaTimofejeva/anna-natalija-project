package com.accenture.prebootcamp.tictactoe.game;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner oneMove=new Scanner(System.in);
        String moveAdd;

        Moves AllMoves=new Moves();
        GameField newGame=new GameField();
        newGame.printField(AllMoves.FillEmpty());
        int plNr=1;

        do{
            System.out.println("Your move P"+plNr);
            moveAdd=oneMove.nextLine();
            int x=Integer.parseInt(moveAdd.substring(0,1));
            int y=Integer.parseInt(moveAdd.substring(1,2));
            String sign;

            newGame.printField(AllMoves.NextMove(x,y,plNr));
            if (AllMoves.Winner(plNr)){
                System.out.println("P"+plNr+" wins!");
                break;
            }
            if (plNr==2){
                plNr=1;
            }else{
                plNr=2;
            }

        }while (moveAdd!="Stop");

    }
}
