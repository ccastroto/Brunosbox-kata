package edu.asestatuas;

public class RoundFactory {

     public static Round getRound(String roundScore){
        if (roundScore == null){
            return null;
        }
        if (roundScore.equalsIgnoreCase("10 - 9")
        || roundScore.equalsIgnoreCase("9 - 10")) {
            return new RegularRound(roundScore);
        }
        return null;
    }

}
