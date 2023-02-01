package oving3;

import java.util.ArrayList;
import java.util.List;

public class Nim {

    /*
     * 3 hauger med brikker
     * En spiller velger én av haugene og fjerner så mange brikker
     * som ønskelig (minst én brikke)
     * Spillet er over når en av haugene er tomme
     * 
     * Tilstand:
     * 1 omgang av 3 hauger med et antall brikker
     * Klassen må vise hvor mange brukker som er i hver haug og oppdatere dette
     * hver gang det fjernes brukker
     * 
     */

    // states

    private List<Integer> nim = new ArrayList<Integer>();

    // constructor to decide how many pieces in a pile

    public Nim(int pileSize) {
        nim.add(pileSize);
        nim.add(pileSize);
        nim.add(pileSize);
    }

    public Nim() {
        nim.add(10);
        nim.add(10);
        nim.add(10);
    }

    // method for removing pieces from a pile
    public void removePieces(int number, int targetPile) {
        if (isGameOver()) {
            throw new IllegalStateException();
        }

        if (!isValidMove(number, targetPile)) {
            throw new IllegalArgumentException("Illegal move!");
        }
        // should remove the number of pieces from targetpile, Array?
        if (targetPile == 0) {
            nim.set(0, nim.get(0) - number);

        } else if (targetPile == 1) {
            nim.set(1, nim.get(1) - number);
        } else {
            nim.set(2, nim.get(2) - number);
        }

    }

    // checks if move is valid
    public boolean isValidMove(int number, int targetPile) {
        if (isGameOver()) {
            return false;
        }

        if (number < 1) {
            return false;
        }

        if (targetPile < 0 || targetPile > 2) {
            return false;
        }

        if (number > nim.get(targetPile)) {
            return false;
        }

        return true;

    }

    public boolean isGameOver() {
        // should return true if one of the piles have 0 pieces
        // if (nim.contains(0)) {
        // return true;
        // }

        // return false;
        return nim.contains(0);
    }

    // returns amount of pieces in pile

    public int getPile(int targetPile) {

        if (targetPile < 0 || targetPile > 2) {
            throw new IllegalArgumentException("Illegal pile number");
        }
        return nim.get(targetPile);

    }

    @Override
    public String toString() {
        return "Nim [nim=" + nim + "]";
    }

    public static void main(String[] args) {
        Nim game1 = new Nim();
        System.out.println(game1);
        game1.removePieces(2, 0);
        System.out.println(game1);
        System.out.println(game1.getPile(2));

    }

}
