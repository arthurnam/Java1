package HomeWork4;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[][] field = initField(5);

        while (true) {
            printField(field);
            turn(field);
            if(isDraw(field)) {
                break;
            }

            if (isWinner(field, "x")) {
                System.out.println("Вы победили");
                break;
            }

            printField(field);
            aiTurn(field);
            if(isDraw(field)) {
                break;
            }

            if (isWinner(field, "0")) {
                System.out.println("Вы проиграли");
                break;
            }
        }
    }

    public static String[][] initField(int size) {
        String[][] field = new String[size][size];

        for(int i = 0; i < field.length; i++) {
            for(int j = 0; j < field[0].length; j++) {
                field[i][j] = "*";
            }
        }
        return field;

    }

    public static void printField(String[][] field) {
        for(int i = 0; i < field.length; i++) {
            for(int j = 0; j < field[0].length; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("---------");
    }

    public static void turn(String[][] field) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Сделайте ход");
            int x = scanner.nextInt() - 1;
            int y = scanner.nextInt() - 1;
            int size = field.length;

            if (x < size && y < size && x >= 0 && y >= 0) {

                if (field[x][y].equals("*")) {
                    field[x][y] = "x";
                    break;
                } else {
                    System.out.println("Вы не правильно сходили");
                }

            } else {
                System.out.println("Вы нажали не на игровое поле");
            }
        }
    }

    public static void aiTurn(String[][] field) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            Random random = new Random();
            int x = random.nextInt(field.length);
            int y = random.nextInt(field.length);

            int size = field.length;


            if (field[x][y].equals("*")) {
                field[x][y] = "$";
                break;
            }
        }
        System.out.println("Компьютер завершил ход");
    }

    public static boolean isDraw(String[][] field) {
        for(int i = 0; i < field.length; i++) {
            for(int j = 0; j < field[0].length; j++) {
                if (field[i][j].equals("*")) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isWinner(String[][] field, String turn) {

        if (
                (field[0][0].equals(turn) && field[0][1].equals(turn) && field[0][2].equals(turn) && field[0][3].equals(turn) && field[0][4].equals(turn)) ||
                        (field[1][0].equals(turn) && field[1][1].equals(turn) && field[1][2].equals(turn) && field[1][3].equals(turn) && field[1][4].equals(turn)) ||
                        (field[2][0].equals(turn) && field[2][1].equals(turn) && field[2][2].equals(turn) && field[2][3].equals(turn) && field[2][4].equals(turn)) ||
                        (field[3][0].equals(turn) && field[3][1].equals(turn) && field[3][2].equals(turn) && field[3][3].equals(turn) && field[3][4].equals(turn)) ||
                        (field[4][0].equals(turn) && field[4][1].equals(turn) && field[4][2].equals(turn) && field[4][3].equals(turn) && field[4][4].equals(turn))
        ) {
            return true;
        }

        else if (
                (field[0][0].equals(turn) && field[1][0].equals(turn) && field[2][0].equals(turn) && field[3][0].equals(turn) && field[4][0].equals(turn)) ||
                        (field[0][1].equals(turn) && field[1][1].equals(turn) && field[2][1].equals(turn) && field[3][1].equals(turn) && field[4][1].equals(turn)) ||
                        (field[0][2].equals(turn) && field[1][2].equals(turn) && field[2][2].equals(turn) && field[3][2].equals(turn) && field[4][2].equals(turn)) ||
                        (field[0][3].equals(turn) && field[1][3].equals(turn) && field[2][3].equals(turn) && field[3][3].equals(turn) && field[4][3].equals(turn)) ||
                        (field[0][4].equals(turn) && field[1][4].equals(turn) && field[2][4].equals(turn) && field[3][4].equals(turn) && field[4][4].equals(turn))
        ) {
            return true;
        }

        else if (
                (field[0][0].equals(turn) && field[1][1].equals(turn) && field[2][2].equals(turn) && field[3][3].equals(turn) && field[4][4].equals(turn))||
                        (field[4][0].equals(turn) && field[1][1].equals(turn) && field[0][4].equals(turn))
        ) {
            return true;
        }

        return false;
    }
}
