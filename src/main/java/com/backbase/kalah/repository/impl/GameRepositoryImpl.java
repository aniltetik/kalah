package com.backbase.kalah.repository.impl;

import com.backbase.kalah.model.Game;
import com.backbase.kalah.model.exception.GameNotFoundException;
import com.backbase.kalah.repository.GameRepository;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Service
public class GameRepositoryImpl implements GameRepository {

    private final Map<String, Game> repository = new HashMap<>();

    @Override
    public Game find(final String id) {
        Optional<Game> optionalGame = Optional.ofNullable(this.repository.get(id));
        return optionalGame.orElseThrow(() -> new GameNotFoundException(id));
    }

    @Override
    public Game save(final Game game) {
        this.repository.put(game.getId(), game);
        return this.find(game.getId());
    }

}
