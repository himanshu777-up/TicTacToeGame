package com.himanshu.tictactoe;

import java.util.List;

public class Game {

    private List<Player> playerList;
    private Board board;

    public Game(List<Player> playerList, Board board) {
        this.playerList = playerList;
        this.board = board;
    }

    public void play(Player player, int posx, int posy) {

        board.getMatrix()[posx][posy] = player.getChoice();

    }

    public int diagonalSum() {
        int sum = 0;
        for (int i = 0; i < board.getSize(); i++) {
            for (int j = 0; j < board.getSize(); j++) {
                if (i == j) {
                    sum += board.getMatrix()[i][j];
                }
            }
        }
        return sum;
    }

    public boolean winDiagonal() {
        if (diagonalSum() == board.getSize()) {
            return true;
        } else if (diagonalSum() == 0) {
            return true;
        }
        return false;
    }


}
