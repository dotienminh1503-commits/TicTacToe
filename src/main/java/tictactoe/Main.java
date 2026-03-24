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
        char p1 = 'x';
        boolean gameEnded =  false;

        while (!gameEnded) {
            drawBoard(board);
            System.out.println("Luot cua nguoi choi" + p1 );

            int row = -1;
            int col = -1;

            while (true) {
                System.out.println("Nhap vi tri hang 1 -> 3: ");
                row = scanner.nextInt() -1;
                System.out.println("Nhap vi tri cot 1 -> 3: ");
                col = scanner.nextInt() -1;
                if (row<0 || row>0 || col < 0 || col > 0) {
                    System.out.println({"Vi tri khong hop le");
                }
                else if (board[row][col] != '-') {
                    System.out.println("Chon o khac ");
                }
                else {
                    break;
                }
            }
        }

    }
}
