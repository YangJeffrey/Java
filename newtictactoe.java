package com.company;
import java.util.Scanner;

public class Main {

    static String turn = "X";

    static String[][] board = {
            {"[ ]","[ ]","[ ]"},
            {"[ ]","[ ]","[ ]"},
            {"[ ]","[ ]","[ ]"}};

    static boolean won = false;

    public static void main(String[] args) {
	display(board);

        for (int k = 0; k < 9; k++) {
            if (!won) {
                move(board, turn);
                display(board);
                win(board, turn);
                if (turn.equals("X")) {
                    turn = "O";
                } else {
                    turn = "X";
                }
            }
        }
    }
    static void move(String board[][], String turn) {
        System.out.println();
        System.out.println("Player " + turn);
        Scanner obj1 = new Scanner(System.in);
        System.out.println("enter row");
        int row = obj1.nextInt();
        if (row > 2) {
            System.out.println("rows and columns 0 to 2");
            move(board, turn);
        }
        Scanner obj2 = new Scanner(System.in);
        System.out.println("enter column");
        int column = obj2.nextInt();
        if (column > 2) {
            System.out.println("rows and columns 0 to 2");
            move(board, turn);
        }
        if (!board[row][column].equals("[ ]")) {
            System.out.println("Please choose another spot");
            move(board, turn);
        }
        System.out.println();
        board[row][column] = "["+turn+"]";
    }
    static void display(String board[][]) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
    static void win(String board[][], String turn) {
            if (board[0][0].equals(board[1][1].equals(board[2][2])) ||
                    board[0][2].equals(board[1][1].equals(board[2][0])) ||
                    board[0][0].equals(board[1][0].equals(board[2][0])) ||
                    board[0][0].equals(board[0][1].equals(board[0][2])) ||
                    board[0][2].equals(board[1][2].equals(board[2][2])) ||
                    board[2][0].equals(board[2][1].equals(board[2][2])) ||
                    board[0][1].equals(board[1][1].equals(board[2][1])) ||
                    board[1][0].equals(board[1][1].equals(board[1][2]))) {
                System.out.println("Player " + turn + " won!");
                won = true;
                }
            }
        }
