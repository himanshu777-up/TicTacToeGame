package com.himanshu.tictactoe;

public class Player {

    private String playerId;
    private String playerName;
    private int choice;
    private boolean flag;

    public int getChoice() {
        return choice;
    }

    public void setChoice(int choice) {
        this.choice = choice;
    }

    public boolean getFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public Player(String playerId, String playerName, int choice) {
        this.playerId = playerId;
        this.playerName = playerName;
        this.choice = choice;
        this.flag = true;
    }

    public String getPlayerId() {
        return playerId;
    }

    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }
}
