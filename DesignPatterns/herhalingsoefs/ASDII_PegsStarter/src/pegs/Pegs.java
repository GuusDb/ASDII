package pegs;

import domein.PegAdapter;
import domein.RoundPeg;
import domein.SquarePeg;

public class Pegs {

    public static void main(String[] args) {
        RoundPeg roundPeg = new RoundPeg();
        SquarePeg squarePeg = new SquarePeg();

        squarePeg.insert("inserting a square peg");
        //do nu een insert met een round peg
        // ...
        new PegAdapter(roundPeg).insert("insert round peg into...");

        roundPeg.insertIntoHole("inserting a round peg");
        //do nu een insertIntoHole met een squarepeg 
        //
        new PegAdapter(squarePeg).insertIntoHole("insert square into...");
    }
}
