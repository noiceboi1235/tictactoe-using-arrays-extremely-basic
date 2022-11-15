
/*for anyone wondering this program does not use GUI so it will be confusing at first
but if you know array subscriptions well, you should not have any problem playing this
please use the correct subscripts to play and since this game doesnt have any GUI 
you will have to read a lot of text in order to play, i will be working on a GUI version
of this same game so please wait for that, thanks for reading enjoy:*/
import java.util.*;

class tictactoe {

    Scanner sc = new Scanner(System.in);
    // creating array
    String tic[][] = new String[3][3];
    // ivariables for winning conditions
    int k = 0, l = 0;
    // loop variables
    int i, j;

    // setting tic tac toe board
    public void board() {
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                tic[i][j] = "_";
            }
        }
        // printing tic tac toe board
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print(tic[i][j] + " ");
            }
            System.out.println();
        }
    }

    void turn() {
        // turn looping
        while (true) {

            // taking input for white
            System.out.println("O's turn :enter where you want to put O");
            int r = sc.nextInt();
            int c = sc.nextInt();
            // checking if position is already occupied
            if (tic[r][c] == "X") {
                tic[r][c] = "X";
                for (i = 0; i < 3; i++) {
                    for (j = 0; j < 3; j++) {
                        System.out.print(tic[i][j] + " ");
                    }
                    System.out.println();
                }
                System.out.println("you cant occupy your opponents space, choose somewhere else");
                System.out.println("O's turn once again :enter where you want to put O");
                r = sc.nextInt();
                c = sc.nextInt();
                tic[r][c] = "O";
            }
            if (tic[r][c] == "O") {
                tic[r][c] = "O";
                for (i = 0; i < 3; i++) {
                    for (j = 0; j < 3; j++) {
                        System.out.print(tic[i][j] + " ");
                    }
                    System.out.println();
                }
                System.out.println("you cant occupy your own space, choose somewhere else");
                System.out.println("O's turn once again :enter where you want to put O");
                r = sc.nextInt();
                c = sc.nextInt();
                tic[r][c] = "O";
            }
            tic[r][c] = "O";
            // O wins
            // vertical wins
            if (tic[0][0] == "O" && tic[1][0] == "O" && tic[2][0] == "O") {
                System.out.println("O wins");
                k = 1;

            }
            if (tic[0][1] == "O" && tic[1][1] == "O" && tic[2][1] == "O") {
                System.out.println("O wins");
                k = 1;
            }
            if (tic[0][2] == "O" && tic[1][2] == "O" && tic[2][2] == "O") {
                System.out.println("O wins");
                k = 1;
            }
            // horizontal wins
            if (tic[0][0] == "O" && tic[0][1] == "O" && tic[0][2] == "O") {
                System.out.println("O wins");
                k = 1;
            }
            if (tic[1][0] == "O" && tic[1][1] == "O" && tic[1][2] == "O") {
                System.out.println("O wins");
                k = 1;
            }
            if (tic[2][0] == "O" && tic[2][1] == "O" && tic[2][2] == "O") {
                System.out.println("O wins");
                k = 1;
            }
            // diagonal wins
            if (tic[0][0] == "O" && tic[1][1] == "O" && tic[2][2] == "O") {
                System.out.println("O wins");
                k = 1;
            }
            if (tic[0][2] == "O" && tic[1][1] == "O" && tic[2][0] == "O") {
                System.out.println("O wins");
                k = 1;
            }
            // X wins
            // vertical wins
            if (tic[0][0] == "X" && tic[1][0] == "X" && tic[2][0] == "X") {
                System.out.println("X wins");
                k = 1;
            }
            if (tic[0][1] == "X" && tic[1][1] == "X" && tic[2][1] == "X") {
                System.out.println("X wins");
                k = 1;
            }
            if (tic[0][2] == "X" && tic[1][2] == "X" && tic[2][2] == "X") {
                System.out.println("X wins");
                k = 1;
            }
            // horizontal wins
            if (tic[0][0] == "X" && tic[0][1] == "X" && tic[0][2] == "X") {
                System.out.println("X wins");
                k = 1;
            }
            if (tic[1][0] == "X" && tic[1][1] == "X" && tic[1][2] == "X") {
                System.out.println("X wins");
                k = 1;
            }
            if (tic[2][0] == "X" && tic[2][1] == "X" && tic[2][2] == "X") {
                System.out.println("X wins");
                k = 1;
            }
            // diagonal wins
            if (tic[0][0] == "X" && tic[1][1] == "X" && tic[2][2] == "X") {
                System.out.println("X wins");
                k = 1;
            }
            if (tic[0][2] == "X" && tic[1][1] == "X" && tic[2][0] == "X") {
                System.out.println("X wins");
                k = 1;
            }

            // checking if its a draw
            if (tic[0][0] != "_" && tic[0][1] != "_" && tic[0][2] != "_" && tic[1][0] != "_" && tic[1][1] != "_"
                    && tic[1][2] != "_" && tic[2][0] != "_" && tic[2][1] != "_" && tic[2][2] != "_") {
                System.out.println("Its a draw");
                for (i = 0; i < 3; i++) {
                    for (j = 0; j < 3; j++) {
                        System.out.print(tic[i][j] + " ");
                    }
                    System.out.println();
                }
                break;
            }
            if (k == 1) {
                for (i = 0; i < 3; i++) {
                    for (j = 0; j < 3; j++) {
                        System.out.print(tic[i][j] + " ");
                    }
                    System.out.println();
                }
                break;
            }
            // printing after white's turn
            for (i = 0; i < 3; i++) {
                for (j = 0; j < 3; j++) {
                    System.out.print(tic[i][j] + " ");
                }
                System.out.println();
            }
            // X's input
            System.out.println("X's turn :enter where you want to put X");
            r = sc.nextInt();
            c = sc.nextInt();
            // checking if place is occupied
            if (tic[r][c] == "O") {
                tic[r][c] = "O";
                for (i = 0; i < 3; i++) {
                    for (j = 0; j < 3; j++) {
                        System.out.print(tic[i][j] + " ");
                    }
                    System.out.println();
                }
                System.out.println("you cant occupy your opponents space, choose somewhere else");
                System.out.println("X's turn once again :enter where you want to put X");
                r = sc.nextInt();
                c = sc.nextInt();
                tic[r][c] = "X";
            }
            if (tic[r][c] == "X") {
                tic[r][c] = "X";
                for (i = 0; i < 3; i++) {
                    for (j = 0; j < 3; j++) {
                        System.out.print(tic[i][j] + " ");
                    }
                    System.out.println();
                }
                System.out.println("you cant occupy your own space, choose somewhere else");
                System.out.println("X's turn once again :enter where you want to put X");
                r = sc.nextInt();
                c = sc.nextInt();
                tic[r][c] = "X";
            }
            tic[r][c] = "X";

            // O wins
            // vertical wins
            if (tic[0][0] == "O" && tic[1][0] == "O" && tic[2][0] == "O") {
                System.out.println("O wins");
                k = 1;
            }
            if (tic[0][1] == "O" && tic[1][1] == "O" && tic[2][1] == "O") {
                System.out.println("O wins");
                k = 1;
            }
            if (tic[0][2] == "O" && tic[1][2] == "O" && tic[2][2] == "O") {
                System.out.println("O wins");
                k = 1;
            }
            // horizontal wins
            if (tic[0][0] == "O" && tic[0][1] == "O" && tic[0][2] == "O") {
                System.out.println("O wins");
                k = 1;
            }
            if (tic[1][0] == "O" && tic[1][1] == "O" && tic[1][2] == "O") {
                System.out.println("O wins");
                k = 1;
            }
            if (tic[2][0] == "O" && tic[2][1] == "O" && tic[2][2] == "O") {
                System.out.println("O wins");
                k = 1;
            }
            // diagonal wins
            if (tic[0][0] == "O" && tic[1][1] == "O" && tic[2][2] == "O") {
                System.out.println("O wins");
                k = 1;
            }
            if (tic[0][2] == "O" && tic[1][1] == "O" && tic[2][0] == "O") {
                System.out.println("O wins");
                k = 1;
            }
            // X wins
            // vertical wins
            if (tic[0][0] == "X" && tic[1][0] == "X" && tic[2][0] == "X") {
                System.out.println("X wins");
                k = 1;
            }
            if (tic[0][1] == "X" && tic[1][1] == "X" && tic[2][1] == "X") {
                System.out.println("X wins");
                k = 1;
            }
            if (tic[0][2] == "X" && tic[1][2] == "X" && tic[2][2] == "X") {
                System.out.println("X wins");
                k = 1;
            }
            // horizontal wins
            if (tic[0][0] == "X" && tic[0][1] == "X" && tic[0][2] == "X") {
                System.out.println("X wins");
                k = 1;
            }
            if (tic[1][0] == "X" && tic[1][1] == "X" && tic[1][2] == "X") {
                System.out.println("X wins");
                k = 1;
            }
            if (tic[2][0] == "X" && tic[2][1] == "X" && tic[2][2] == "X") {
                System.out.println("X wins");
                k = 1;
            }
            // diagonal wins
            if (tic[0][0] == "X" && tic[1][1] == "X" && tic[2][2] == "X") {
                System.out.println("X wins");
                k = 1;
            }
            if (tic[0][2] == "X" && tic[1][1] == "X" && tic[2][0] == "X") {
                System.out.println("X wins");
                k = 1;
            }
            for (i = 0; i < 3; i++) {
                for (j = 0; j < 3; j++) {
                    System.out.print(tic[i][j] + " ");
                }
                System.out.println();
            }
            // checking for draw
            if (tic[0][0] != "_" && tic[0][1] != "_" && tic[0][2] != "_" && tic[1][0] != "_" && tic[1][1] != "_"
                    && tic[1][2] != "_" && tic[2][0] != "_" && tic[2][1] != "_" && tic[2][2] != "_") {
                l = 1;
            }
            // executing break if drawed
            if (l == 1) {
                break;
            }
            // executing if anyone winned or no
            if (k == 1) {
                break;
            }
        }

    }

    public static void main(String args[]) {
        tictactoe ob = new tictactoe();
        ob.board();
        ob.turn();
    }
}
