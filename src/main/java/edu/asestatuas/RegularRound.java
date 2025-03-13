package edu.asestatuas;

public class RegularRound implements Round {

    private String roundScore;
    private byte redBoxerScore;
    private byte blueBoxerScore;

    RegularRound(String roundScore) {
        this.roundScore = roundScore.replaceAll("\\s", "");
    }

    String getRoundScore() {
        return roundScore;
    }

    @Override
    public byte getRedBoxerScore(){
        return this.redBoxerScore;
    }
    @Override
    public byte getBlueBoxerScore(){
        return this.blueBoxerScore;
    }
}
