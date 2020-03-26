package com.qa.main;

public class Runner {

	public static void main(String[] args) {
		String[][] chessBoard = {
				//0       1               2         3       4        5         6         7                 
				{ "Rook", "Bishop-Black", "Knight", "King", "Queen", "Knight", "Bishop", "Rook"},   //0
				{ "Pawn", "Pawn", "Pawn", "Pawn", "Pawn", "Pawn", "Pawn", "Pawn"},                  //1
				{},                                                                                 //2
				{},													 							    //3
				{},																				    //4
				{},																				    //5
				{ "Pawn", "Pawn", "Pawn", "Pawn", "Pawn", "Pawn", "Pawn", "Pawn"},                  //6
				{ "Rook", "Bishop-White", "Knight", "Queen", "King", "Knight", "Bishop", "Rook"},   //7
		};
		System.out.println(chessBoard[7][1]);
		
		

		int[] ageArray = { 43, 45, 32, 46, 25 };
		System.out.println(ageArray[4]);

	}

}
