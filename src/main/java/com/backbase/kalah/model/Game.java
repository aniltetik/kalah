package com.backbase.kalah.model;

import java.util.UUID;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Game {

    private final String id;
    private final Board board;
    private Player winner;
    private Player turn;

    public Game() {
        this.id = UUID.randomUUID().toString();
        this.board = new Board();
    }

}
