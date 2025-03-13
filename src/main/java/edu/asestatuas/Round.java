package edu.asestatuas;

public interface Round {

    byte redBoxerScore = 0;
    byte blueBoxerScore = 0;

    static byte boxerRoundScore(){
        return redBoxerScore + blueBoxerScore;
    }

    byte getRedBoxerScore();
    byte getBlueBoxerScore();
}
