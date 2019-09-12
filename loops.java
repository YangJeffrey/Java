/* Jeffrey Yang - 4B
 * 9/11/2019
 * Menu Driven Program
 */

import java.util.Scanner;

public class menudriven {

    public static void main(String args[]) {
        System.out.println("Menu:");
        System.out.println("Three number average (2.2)                    1");
        System.out.println("Distance between 2 points (2.8)               2");
        System.out.println("String to characters on new line (3.5)        3");
        System.out.println("12 x 12 Multiplication table (3.7)            4");
        System.out.println("Exit                                          5");
        menu();
    }
    /* display menu and allow for choosing program */
    static void menu() {
        Scanner obj = new Scanner(System.in);
        int selection = obj.nextInt();
        if (selection == 1) {
            threenumberaverage();
        } else if (selection == 2) {
            twopointdistance();
        } else if (selection == 3) {
            stringtonewlinechar();
        } else if (selection == 4) {
            multiplicationtable();
        } else if (selection == 5) {
            System.exit(1);
        } else {
            System.out.println("Choose another number");
            menu();
        }
    }
    /* Gets 3 numbers and gets the average of those numbers (2.2)*/
    static void threenumberaverage() {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = obj.nextInt();
        System.out.println("Enter second number");
        int num2 = obj.nextInt();
        System.out.println("Enter third number");
        int num3 = obj.nextInt();
        double avg = (num1 + num2 + num3)/3;
        System.out.println(avg);
    }
    /* Gets 2 (x, y) coordinates and finds the distance between them (2.8)*/
    static void twopointdistance() {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter x_1");
        int x1 = obj.nextInt();
        System.out.println("Enter y_1");
        int y1 = obj.nextInt();
        System.out.println("Enter x_2");
        int x2 = obj.nextInt();
        System.out.println("Enter y_2");
        int y2 = obj.nextInt();
        double distance = Math.sqrt(Math.pow(x2 - x1,2) + Math.pow(y2 - y1,2));
        System.out.println(distance);
    }
    /* Gets a string and prints each character on a new line (3.5)*/
    static void stringtonewlinechar() {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter string");
        String str = obj.nextLine();
        
        //for loop
        for (int i = 0; i < str.length(); i++ ) {
            System.out.println(str.charAt(i));
        }
        System.out.println();
        
        //while loop
        int j = 0;
        while (j < str.length()) {
            System.out.println(str.charAt(j));
            j++;
        }
        System.out.println();
        
        //do while loop
        int k = 0;
        do {
            System.out.println(str.charAt(k));
            k++;
        } while (k < str.length());

    }
    /* Prints a 12 x 12 multiplication table (3.7)*/
    static void multiplicationtable() {
        for (int i = 0; i <= 12; i++) {
            for (int j = 0; j <= 12; j++) {
                System.out.print("[" + i*j + "]");
            }
            System.out.println();
        }

    }
}


