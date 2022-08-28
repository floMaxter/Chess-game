package com.chess.model.player.ai;

import com.chess.model.board.Board;

public interface BoardEvaluator {
    int evaluate(Board board, int depth);
}
