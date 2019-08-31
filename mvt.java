import java.util.Scanner;

public class Main {

    static String[][] map = {
            {"[ ]","[ ]","[ ]","[ ]","[ ]"},
            {"[ ]","[ ]","[ ]","[ ]","[ ]"},
            {"[ ]","[ ]","[O]","[ ]","[ ]"},
            {"[ ]","[ ]","[ ]","[ ]","[ ]"},
            {"[ ]","[ ]","[ ]","[ ]","[ ]"}};
    static int row = 2;
    static int col = 2;
    static int ymax = 4;
    static int xmax = 4;

    public static void main(String[] args) {
        display(map);
        nestedmove(map, row, col);
    }
    static void display(String map[][]) {
        for (int i = 0; i < ymax + 1; i++) {
            for (int j = 0; j < xmax + 1; j++) {
                    System.out.print(map[i][j]);
            }
            System.out.println();
        }
    }
    static void nestedmove(String map[][], int row, int col) {
        Scanner obj = new Scanner(System.in);
        //System.out.println("W A S D");
        String move = obj.next();
        if (move.equals("w")) {
            map[row][col] = "[ ]";
            row -= 1;
            if (row < 0) {
                row += 1;
            }
            map[row][col] = "[O]";
            display(map);
            nestedmove(map, row, col);
        } else if (move.equals("s")) {
            map[row][col] = "[ ]";
            row += 1;
            if (row > ymax) {
                row -= 1;
            }
            map[row][col] = "[O]";
            display(map);
            nestedmove(map, row, col);
        } else if (move.equals("a")) {
            map[row][col] = "[ ]";
            col -= 1;
            if (col < 0) {
                col += 1;
            }
            map[row][col] = "[O]";
            display(map);
            nestedmove(map, row, col);
        } else if (move.equals("d")) {
            map[row][col] = "[ ]";
            col += 1;
            if (col > xmax) {
                col -= 1;
            }
            map[row][col] = "[O]";
            display(map);
            nestedmove(map, row, col);
        }
    }
}
