package com.accenture.prebootcamp.tictactoe.game;

public class Moves {
private String[][] moves=new String[3][3];

    String[][] FillEmpty(){
        for(int i=0; i<3;i++){
            for(int y=0;y<3;y++){
                moves[i][y]=" ";
            }
        }
        return moves;
    }
    String[][]NextMove(int x, int y, String sign){
        moves[x-1][y-1]=sign;
        return moves;
    }
}
