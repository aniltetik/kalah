package com.backbase.kalah.model;

public enum Player {
    PLAYER_NORTH(Board.END_INDEX / 2),
    PLAYER_SOUTH(Board.END_INDEX);

    private int houseIndex;

    Player(final int houseIndex) {
        this.houseIndex = houseIndex;
    }

    public int getHouseIndex() {
        return this.houseIndex;
    }
}
