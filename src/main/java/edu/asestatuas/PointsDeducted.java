package edu.asestatuas;

public class PointsDeducted  implements Round {

    private final String roundScore;
    private byte redBoxerScore;
    private byte blueBoxerScore;

    PointsDeducted(String roundScore){
        this.roundScore = roundScore.replaceAll("\\s", "");
    }

    String getRoundScore(){
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


    @Override
    public String toString(){
        return this.getRedBoxerScore() + " - " + this.getBlueBoxerScore();
    }
}
