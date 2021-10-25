package com.himanshu.tictactoe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {

        Player one = new Player("play1", "play1", 1);
        Player zero = new Player("play0", "play0", 0);

        Board board = new Board(3);

        Game game = new Game(new ArrayList<>(Arrays.asList(one, zero)), board);

        board.displayBoard();

        System.out.println("Starting with player1.............");
        Scanner scn = new Scanner(System.in);
        while (true) {
            if(one.getFlag()){
                System.out.println("PLayer 1 needs to input posx and posy");
                System.out.println("Enter posx");
                int posx = scn.nextInt();
                System.out.println("Enter posy");
                int posy = scn.nextInt();

                game.play(one, posx, posy);

                one.setFlag(false);
                zero.setFlag(true);
                board.displayBoard();

                if(game.winDiagonal()){
                    System.out.println("Winner is player 1");
                    break;
                }

                //if win or draw, break
            }

            else{
                //continue with player 0
                System.out.println("PLayer 0 needs to input posx and posy");
                System.out.println("Enter posx");
                int posx = scn.nextInt();
                System.out.println("Enter posy");
                int posy = scn.nextInt();

                game.play(zero, posx, posy);


                zero.setFlag(false);
                one.setFlag(true);
                board.displayBoard();

                if(game.winDiagonal()){
                    System.out.println("Winner is player 0");
                    break;
                }

                //if win or draw, break
            }


        }


    }
}
