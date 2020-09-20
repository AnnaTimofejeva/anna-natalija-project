package com.accenture.prebootcamp.tictactoe;

public class GameField {
 void printField(String positions[][]){
     System.out.println("  1   2   3 ");
     System.out.println("1 "+positions[0][0]+" | "+positions[0][1]+" | "+positions[0][2]+" ");
     System.out.println(" -----------");
     System.out.println("2 "+positions[1][0]+" | "+positions[1][1]+" | "+positions[1][2]+" ");
     System.out.println(" -----------");
     System.out.println("3 "+positions[2][0]+" | "+positions[2][1]+" | "+positions[2][2]+" ");
 }
}
