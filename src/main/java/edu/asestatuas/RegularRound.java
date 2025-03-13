package edu.asestatuas;

public class RegularRound implements Round {

    private final String roundScore;
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

    void boxerRoundScore(){ // el void es provisional hay que modificarlo, se pone para que no rompa el código
        this.redBoxerScore = 10;
        this.blueBoxerScore = 9;
    }

    public String toString(){
        return this.getRedBoxerScore() + " - " + this.getBlueBoxerScore();
    }

}
