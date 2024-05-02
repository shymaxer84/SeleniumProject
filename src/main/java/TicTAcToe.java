import java.util.Scanner;

import static org.testng.Reporter.clear;

public class TicTAcToe {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


        System.out.println("Player 1, what's your name?");
        String player1 = in.nextLine();

        System.out.println("Player 2, what's your name?");
        String player2 = in.nextLine();

        // 3x3 Tic Tac Toe board
        // empty space
        // X player 1
        // 0 player 2

        char[][] board = new char[3][3];


        //Fill the board with dashes
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }

        //Keep track of whose turn it is
        boolean isPlayer1 = true;

        //Keep track if the game has ended
        boolean gameEnded = false;

        while (!gameEnded) {

            // Keep track of what symbol we are using to play
            char symbol = ' ';
            if (isPlayer1) {
                symbol = 'x';

            } else {
                symbol = '0';
            }

            //Print out the player's turn
            if (isPlayer1) {
                System.out.println(player1 + "'s Turn(x):");

            } else {
                System.out.println(player2 + "'s Turn(0):");
            }

            int row;
            int col;
            while (true) {
                //Get row and col from user
                System.out.println("Enter a row (0, 1, or 2):");
                row = in.nextInt();

                System.out.println("Enter a col (0, 1, or 2):");
                col = in.nextInt();

                //Check if row and col are valid
                if (row < 0 || col < 0 || row > 2 || col > 2) {
                    System.out.println("Your row and col are out of bounds!");
                } else if (board[row][col] != '-') {
                    //Board position has x or 0
                    System.out.println("Someone has already made a move there!");
                } else {
                    //Row and col are valid
                    break;
                }

            }
            //Setting the position on the board to the player's symbol
            board[row][col] = symbol;
            drawBoard(board);
            hasWon(board);


            if (hasWon(board) == 'x') {
                System.out.println(player1 + "has won!");

            } else if (hasWon(board) == '0') {
                System.out.println(player2 + "has won!");
            } else {
                //Nobody won
                if (hasTied(board)) {
                    System.out.println("It's a tie!");
                } else {
                    //Continue the Game and toggles the turn
                    isPlayer1 = !isPlayer1;
                }
            }

        }
    }




    public static void drawBoard(char[][] board)
    {

        for (int i =0;i<3; i++ )
        {
            for (int j =0;j<3; j++ )
            {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }

    public static char hasWon(char[][] board) {
        //Raw
        int i;
        for (i = 0; i < 3; i++) {

            if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != '-') {
                return board[i][0];
            }
        }
        //Col

        int j;
        for (j = 0; j < 3; j++) {

            if (board[0][j] == board[1][j] && board[1][j] == board[2][j] && board[0][j] != '-') {

                return board[0][j];
            }
        }

        //Diagonals
        if (board[0][0]==board[1][1] && board[1][1] == board[2][2] && board[0][0]!='-')
        {
            return board[0][0];

        }
        if(board[2][0]==board[1][1] && board[1][1] == board[2][2] && board[0][0]!='-'){

            return board[2][0];
        }

        //Nobody hase won
        return '-';
    }

    //Check if the board is full
    public static boolean hasTied(char[][] board){

        for (int i =0;i<3; i++ )
        {
            for (int j =0;j<3; j++ )
            {
                if (board[i][j]=='-')
                    return false;
            }
        }
        return true;
    }
}
