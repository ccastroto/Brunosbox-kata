package edu.asestatuas;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Collections;

public class ScoreCard {

    private final String color;
    private String blueCorner = "";
    private String redCorner = "";
    private String[] judgeScoreCard;
    private Byte redBoxerScoreFinal = 0;
    private Byte blueBoxerScoreFinal = 0;

    private List<Round> rounds = new ArrayList<Round>();

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
        return (byte) this.getRounds().size();
    }

    public List<Round> getRounds() {
        return Collections.unmodifiableList(this.rounds);
    }

    public String toString() {
        return "\n\t\t\t\t " + this.color
                + "\n\t\t" + this.blueCorner
                + "\t" + this.redCorner
                + "\n\t\t\t\t"
                + this.getNumRounds() + " rounds\n"
                + this.viewRounds()
                + "\n\tFINAL SCORE: "
                + this.redBoxerScoreFinal
                + " - "
                + this.blueBoxerScoreFinal
                + " FINAL SCORE";
    }

    private void setJudgeScoreCard(String[] scoreCard) {
        this.judgeScoreCard = scoreCard;
    }

    private void addRound(Round round) {
        this.rounds.add(round);
    }

    public void loadJudgeScoreCard(String[] judgeScoreCard) {
        this.setJudgeScoreCard(judgeScoreCard);

        Optional<Round> round = Optional.empty();
        for (String roundScore : this.judgeScoreCard) {
            round = Optional.ofNullable(RoundFactory.getRound(roundScore));
            round.ifPresent(this::addRound);
        }
    }

    public byte getRedBoxerScoreFinal() {
        if (this.redBoxerScoreFinal == 0) {
            this.redBoxerScoreFinal =
                    this.getRounds()
                            .stream()
                            .map(Round::getRedBoxerScore)
                            .map(Byte::intValue)
                            .reduce(0, Integer::sum)
                            .byteValue();
                    // Tmb se puede hacer un contador utilizando un for.
        }
        return this.redBoxerScoreFinal;
    }
    public byte getBlueBoxerScoreFinal() {
        if (this.blueBoxerScoreFinal == 0) {
            this.blueBoxerScoreFinal =
                    this.getRounds()
                            .stream()
                            .map(Round::getBlueBoxerScore)
                            .map(Byte::intValue)
                            . reduce(0,Integer::sum)
                            .byteValue();
        }
        return this.blueBoxerScoreFinal;
    }
    private String viewRounds(){
        StringBuilder roundsView = new StringBuilder();
        roundsView.append("\tRound \t Score \t Round \t Score \t Round\n")
                  .append("\tScore \t Total           Total \t Score\n");

        byte roundNum = 1;

        byte redBoxerScoreFinal = 0;
        byte blueBoxerScoreFinal = 0;

        for (Round round : this.rounds){
            roundsView.append("\n\t")
                      .append(round.getRedBoxerScore())
                      .append("\t\t")
                      .append(redBoxerScoreFinal += round.getRedBoxerScore())
                      .append("\t\t")
                      .append(roundNum++)
                      .append("\t\t")
                      .append(blueBoxerScoreFinal += round.getBlueBoxerScore())
                      .append("\t\t")
                      .append(round.getBlueBoxerScore());
        }

        return roundsView.toString();
    }

}
