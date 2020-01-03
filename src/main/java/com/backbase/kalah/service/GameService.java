package com.backbase.kalah.service;


import com.backbase.kalah.model.Game;

public interface GameService {

    Game createGame();

    Game play(String gameId, Integer pitId);

}
