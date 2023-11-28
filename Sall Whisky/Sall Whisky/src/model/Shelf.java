package model;

import java.util.List;

public class Shelf implements Observer {

    /**
     * Return a list of all the positions on the shelf that are not fully filled.
     */
    public List<Rack> getAvailablePositions() {
        return null;
    }

    /**
     * Checks if all the positions on the shelf are full, if so, set isFilled to true.
     */
    @Override
    public void update() {

    }
}
