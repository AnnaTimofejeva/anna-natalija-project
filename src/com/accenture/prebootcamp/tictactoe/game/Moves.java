package com.accenture.prebootcamp.tictactoe.game;

public class Moves {
private String[][] moves=new String[3][3];
//Fills array with empty values
    String[][] FillEmpty(){
        for(int i=0; i<3;i++){
            for(int y=0;y<3;y++){
                moves[i][y]=" ";
            }
        }
        return moves;
    }
//-----------Records move into array-------------
    String[][]NextMove(int x, int y, int plNr){
        String sign;
//Based on a player selects a sign
        if(plNr==1){
            sign="X";
        }else{
            sign="O";
        }
//validity check. Check for viable numbers and epmty array slot
        if ((x<=3)&&(y<=3)&&(moves[x-1][y-1]==" ")){
            moves[x-1][y-1]=sign;

        }else{
            System.out.println("Wrong coordinates! Try again!");
            //Change player
            if (Game.mainPlNr==2){
                Game.mainPlNr=1;
            }else{
                Game.mainPlNr=2;
            }
        }

        return moves;
    }

// -----------Performs winner check------------
    Boolean Winner(int plNr){
        int check=0;
        String sign;
//Selects sign based on a player
        if(plNr==1){
            sign="X";
        }else{
            sign="O";
        }
//runs over all rows
        for (int i=0; i<3; i++){
            for (int j=0;j<3;j++){
                if (moves[i][j]==sign){
                    check++;
                }
            }
            if (check==3){
                return Boolean.TRUE;
            }else{
                check=0;
            }
        }
//runs over all columns
        for (int i=0; i<3; i++){
            for (int j=0;j<3;j++){
                if (moves[j][i]==sign){
                    check++;
                }
            }
            if (check==3){
                return Boolean.TRUE;
            }else{
                check=0;
            }
        }
//runs over first diagonal
        for (int i=0; i<3; i++){
                if (moves[i][i]==sign){
                    check++;
                }
            }
            if (check==3){
                return Boolean.TRUE;
            }else{
                check=0;
            }
//runs over second diagonal
        for (int i=0; i<3; i++){
            if (moves[2-i][i]==sign){
                check++;
            }
        }
        if (check==3){
            return Boolean.TRUE;
        }else{
            check=0;
        }
//no win
        return Boolean.FALSE;
    }
}
