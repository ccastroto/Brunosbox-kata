package edu.asestatuas;

public class RegularRound implements Round {

    private final String roundScore;
    private byte redBoxerScore;
    private byte blueBoxerScore;

    RegularRound(String roundScore) {
        this.roundScore = roundScore.replaceAll("\\s", "");
        this.boxerRoundScore();
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
        String[] scores = getRoundScore().split("-",2);
        this.redBoxerScore = Byte.parseByte(scores[0]);
        this.blueBoxerScore = Byte.parseByte(scores[1]);
    }

    @Override
    public String toString(){
        return this.getRedBoxerScore() + " - " + this.getBlueBoxerScore();
    }

}
