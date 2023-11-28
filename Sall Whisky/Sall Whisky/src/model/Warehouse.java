package model;

import java.util.List;

public class Warehouse implements Observer {

    /**
     * Return a list of all the racks in the warehouse that are not fully filled.
     */
    public List<Rack> getAvailableRacks() {
        return null;
    }

    /**
     * Checks if all the racks in the warehouse are full, if so, set isFilled to true.
     */
    @Override
    public void update() {

    }
}
