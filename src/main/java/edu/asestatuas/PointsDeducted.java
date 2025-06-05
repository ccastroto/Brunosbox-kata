package edu.asestatuas;

public class PointsDeducted  implements Round {

    private final String roundScore;
    private byte redBoxerScore;
    private byte blueBoxerScore;

    PointsDeducted(String roundScore){
        this.roundScore = roundScore.replaceAll("\\s", "");
        this.boxerRoundScore();
    }

    String getRoundScore(){
        return this.roundScore;
    }

    private void boxerRoundScore(){
        String[] scores = getRoundScore().split("-",2);
        String redBoxerScore = scores[0];
        String blueBoxerScore = scores[1];

        if(redBoxerScore.indexOf(',') == -1){
            this.redBoxerScore = Byte.parseByte(redBoxerScore);
            this.blueBoxerScore = this.parseComaBlue(blueBoxerScore);
        } else {
            this.blueBoxerScore = Byte.parseByte(blueBoxerScore);
            this.redBoxerScore = this.parseComaRed(redBoxerScore);
        }
    }
    private byte parseComaBlue(String score){
        return Byte.parseByte(score.substring(0, score.indexOf(',')));
    }
    private byte parseComaRed(String score){
        return Byte.parseByte(score.substring(score.indexOf(',') + 1));
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
