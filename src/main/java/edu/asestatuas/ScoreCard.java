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
        this.redCorner = redCorner;
    }

}
