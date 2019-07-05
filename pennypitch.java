import java.util.Random;
import java.util.Scanner;

public class pennypitch {
    public static void main(String args[]) {
        int[][] board = {
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0}};
        System.out.println("BOARD:");
printnewboard(board);
        System.out.println();
        Scanner numpitches = new Scanner(System.in);
        System.out.println("Number of pitches:");
        int p = numpitches.nextInt();
        System.out.println();
pitchpennies(board,p);
        System.out.println("PITCHES:");
printboard(board);
System.out.println();
        System.out.println("PRIZES:");
checkwin(board);
    }
    static void printnewboard(int board[][]) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                Random rand = new Random();
                int value = rand.nextInt(6);
                board[i][j] = value;
                if (board[i][j] == 0) {
                    System.out.print("[ Doll ]");
                } else if (board[i][j] == 1) {
                    System.out.print("[Puzzle]");
                } else if (board[i][j] == 2) {
                    System.out.print("[ Game ]");
                } else if (board[i][j] == 3) {
                    System.out.print("[ Ball ]");
                } else if (board[i][j] == 4) {
                    System.out.print("[Poster]");
                }else if (board[i][j] == 5) {
                    System.out.print("[      ]");
                }
            }
            System.out.println();
        }
    }

    static void printboard(int board[][]) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (board[i][j] == 0) {
                    System.out.print("[ Doll ]");
                } else if (board[i][j] == 1) {
                    System.out.print("[Puzzle]");
                } else if (board[i][j] == 2) {
                    System.out.print("[ Game ]");
                } else if (board[i][j] == 3) {
                    System.out.print("[ Ball ]");
                } else if (board[i][j] == 4) {
                    System.out.print("[Poster]");
                } else if (board[i][j] == 5) {
                    System.out.print("[      ]");
                } else {
                    System.out.print("[LANDED]");
                }
            }
            System.out.println();
        }
    }

    static void pitchpennies(int board[][], int p) {
for (int i = 0; i < p; i++) {
    Random rand1 = new Random();
    int j = rand1.nextInt(5);
    Random rand2 = new Random();
    int k = rand2.nextInt(5);
board[j][k] = 6;
}
    }

    static void checkwin(int board[][]) {
        String[] prizes = {"Doll", "Puzzle", "Game", "Ball", "Poster"};
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
    for (int k =0; k < prizes.length; k++) {
    if (board[i][j] == k) {
        prizes[k] = "";
    }
}
            }
        }
        for (int l =0; l < prizes.length; l++) {
            if (prizes[l] != "") {
                System.out.println(prizes[l]);
            }
            }
        }
}
