package com.backbase.kalah.repository;

import com.backbase.kalah.model.Game;

public interface GameRepository {

    Game find(final String id);

    Game save(final Game game);

}
