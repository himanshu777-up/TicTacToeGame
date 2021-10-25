package com.himanshu.tictactoe;

import java.util.List;

public class Board {

    private int size;
    private int[][] matrix;

    public Board(int size) {
        this.size = size;
        this.matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = -1;
            }
        }
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }


    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public void displayBoard() {
        System.out.println("Condition of board till now.............");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + "  |  ");
            }
            System.out.println("");
            System.out.println("----------------------");
        }
    }
}
