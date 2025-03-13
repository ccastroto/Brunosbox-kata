package edu.asestatuas;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ScoreCard {

    private final String color;
    private String blueCorner = "";
    private String redCorner = "";
    private String[] judgeScoreCard;

    private  List<Round> rounds = new ArrayList<Round>();

    public ScoreCard(String color) {
        this.color = color;
    }

    String getColor() {
        return this.color;
    }

    void setBCorner(String boxerName) {
        this.blueCorner = boxerName;
    }

    void setRCorner(String boxerName) {
        this.redCorner = boxerName;
    }

    byte getNumRounds() {
        return (byte) (this.blueCorner.length() + this.redCorner.length());
    }
    public String toString() {
        return "\n\t\t\t\t " + this.color
                + "\n\t\t" + this.blueCorner
                + "\t" + this.redCorner
                + "\n\t\t\t\t"
                + "0" + " rounds\n";
    }
    private void setJudgeScoreCard(String[] scoreCard){
        this.judgeScoreCard = scoreCard;
    }

    private  void addRound(Round round){
        this.rounds.add(round);
    }

    public void loadJudgeScoreCard(String[] judgeScoreCard){
        this.setJudgeScoreCard(judgeScoreCard);

        Optional<Round> round = Optional.empty();
        for (String roundScore : this.judgeScoreCard) {
            round = Optional.ofNullable(RoundFactory.getRound(roundScore));
            round.ifPresent(this::addRound);
        }
    }

}
