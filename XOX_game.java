package com.Tictoctoy.game;

import java.util.Scanner;

public class XOX_game {

	// Two d array with char
	public static char[][] a = { { ' ', ' ', ' ' }, { ' ', ' ', ' ' }, { ' ', ' ', ' ' } };
	public static char currentplayer = 'x';
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			print_board();
			System.out.println(currentplayer + ": Please select row");
			int row = sc.nextInt();
			System.out.println(currentplayer + ": please select col");
			int col = sc.nextInt();
			if (row < 0 || row > 2 || col < 0 || col > 2 || a[row][col] != ' ') {
				System.out.println("Invalid move!");
				continue;

			}
			a[row][col]=currentplayer;
			if(checkwinner()) {
				print_board();
				System.out.println(currentplayer+"check Winner!");
				break;
			}
			if(draw()) {
				print_board();
				System.out.println("Match draw!!!");
				break;
			}
			
			currentplayer = currentplayer == 'x'?'O':'x';
		}

	}

	public static void print_board() {
		System.out.println("----------------");
		for (char[] a1 : a) {
			System.out.print("| ");

			for (char c : a1) {
				System.out.print(c+"  | ");
			}

			System.out.println("");
			System.out.println("----------------");

		}
	}

	public static boolean checkwinner() {
		// for rows
		for (int i = 0; i < a.length; i++) {
			if (a[i][0] == currentplayer && a[i][1] == currentplayer && a[i][2] == currentplayer) {
				return true;

			}
		}
		//for col
		for (int i = 0; i < a.length; i++) {
			if (a[0][i] == currentplayer && a[1][i] == currentplayer && a[2][i] == currentplayer) {
				return true;
			}
		}
		//for diag
		if (a[0][0] == currentplayer && a[1][1] == currentplayer && a[2][2] == currentplayer) {
			return true;
		}
		if (a[0][2] == currentplayer && a[1][1] == currentplayer && a[2][0] == currentplayer) {
			return true;
		}
		return false;

	}

	public static boolean draw() {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				a[i][j] = ' ';
				return false;

			}
		}
		return false;
	}

}
