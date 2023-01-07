package org.example.OneDimensionalDotComGame;

public class SimpleDotCom {
    int[] locationCells;
    int numOfHits = 0;

    public void setLocationCells(int[] locationCells) {
        this.locationCells = locationCells;
    }

    public String checkYourself(String stringGuess) {
        int guess = Integer.parseInt(stringGuess);
        String result = "miss";

        for (int i = 0; i < locationCells.length; i++) {
            if (guess == locationCells[i]) {
                result = "hit";
                numOfHits++;
                locationCells[i] = -1;
                break;
            }
        }

        if (numOfHits == locationCells.length) {
            result = "kill";
        }

        System.out.println(result);
        return result;
    }
}
