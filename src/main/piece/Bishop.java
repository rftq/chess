package main.piece;

import main.Color;
import main.Coordinates;

import java.util.Set;

public class Bishop extends Piece{
    public Bishop(Color color, Coordinates coordinates) {
        super(color, coordinates);
    }

    @Override
    protected Set<CoordinatesShift> getPiecesMoves() {
        return null;
    }
}
