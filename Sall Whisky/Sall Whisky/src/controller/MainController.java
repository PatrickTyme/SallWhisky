package controller;

import java.util.ArrayList;
import java.util.List;

public class MainController {
    List<Observer> observers = new ArrayList<>();

    /**
     * Opret og returner en Cask
     * Pre: countryOfOrigin må ikke være null
     * Pre: sizeInLiters > 0
     * Pre: CaskSupplier og Position må ikke være null
     */
    public static Cask createCask(String countryOfOrigin, double sizeInLiters, String previousContent,
                                  Position position, CaskSupplier supplier) {



        return  null;
    }


    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }


}
