package edu.asestatuas;

public class ScoreCard {

    private final String color;
    private String blueCorner = "";
    private String redCorner = "";

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

}
