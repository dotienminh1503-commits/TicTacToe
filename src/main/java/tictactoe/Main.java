package tictactoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char[][] board = {
                {'-', '-', '-'},
                {'-', '-', '-'},
                {'-', '-', '-'}
        };
        Scanner scanner = new Scanner(System.in);
        char player = 'x';
        boolean gameEnded = false;

        while (!gameEnded) {
            drawBoard(board);
            System.out.println("Luot cua nguoi choi" + player);

            int row = -1;
            int col = -1;

            while (true) {
                System.out.println("Nhap vi tri hang 1 -> 3: ");
                row = scanner.nextInt() - 1;
                System.out.println("Nhap vi tri cot 1 -> 3: ");
                col = scanner.nextInt() - 1;
                if (row < 0 || row > 2 || col < 0 || col > 2) {
                    System.out.println("Vi tri khong hop le");
                } else if (board[row][col] != '-') {
                    System.out.println("Chon o khac ");
                } else {
                    break;
                }
            }

            board[row][col]= player;
            //in ra ket qua thang thua
        }
    }
    public static void drawBoard (char[][] board) {
        System.out.println("\nYour Board");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
