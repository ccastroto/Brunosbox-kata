package edu.asestatuas;

import com.github.freva.asciitable.AsciiTable;

public class Brunosbox {
    public static void main( String[] args ) {

        System.out.println("\n - I see three of them out there." +
                "\n - Hit the one in the middle.- Rocky Balboa\n");

        String[] headers = {"Round 1", "Round 2", "Round 3", "Round 4", "Round 5",
                "Round 6", "Round 7", "Round 8", "Round 9", "Round 10"};

        String[][] data = {

                //  White ScoreCard
                {"9 - 10",
                        "9 - 10",
                        "9 - 10",
                        "9 - 10",
                        "10 - 9",
                        "10 - 9",
                        "10 - 9",
                        "9 - 10",
                        "10 - 9",
                        "9 - 10"},

                // Blue ScoreCard
                {"9 - 10",
                        "9 - 10",
                        "9 - 10",
                        "8 - 10", // knockdown
                        "10 - 8", // knockdown
                        "10 - 8",
                        "10 - 9",
                        "9 - 10",
                        "10 - 9",
                        "10 - 9"},

                // Pink ScoreCard
                {"9 - 10",
                        "9 - 10",
                        "9 - 10",
                        "1, 8 - 10", // referee point deduction
                        "10 - 8",    // knockdown
                        "10 - 8 ,1", // referee point deduction
                        "10 - 9",
                        "9 - 10",
                        "10 - 9",
                        "10 - 8" // knockdown
                }

        };

        System.out.println(AsciiTable.getTable(headers, data));


        ScoreCard whiteScoreCard = new ScoreCard("WHITE");


        whiteScoreCard.setRCorner("Rocky Balboa");
        whiteScoreCard.setBCorner("Apollo Creed");


        System.out.println(whiteScoreCard);


        RegularRound round = new RegularRound("10 - 9");
        round.boxerRoundScore();
        System.out.println("\n\t Regular round\t" + round.getRedBoxerScore() +
                " - " + round.getBlueBoxerScore());


        whiteScoreCard.loadJudgeScoreCard(data[0]
                // Escribe aquí el código para acceder al primer
                // elemento del array String[][] data de la línea 13,
                // la tarjeta blanca
        );
        System.out.println(whiteScoreCard);


        KnockdownRound knockdownRound = new KnockdownRound("10 - 8");
        System.out.println("\n\t knockdown round: " + knockdownRound.getRedBoxerScore() +
                " - " + knockdownRound.getBlueBoxerScore());


        RegularRound regular = (RegularRound) RoundFactory.getRound("9 - 10");
        System.out.println("\t regular round: " + regular);
        KnockdownRound knockdown = (KnockdownRound) RoundFactory.getRound("8 - 10");
        System.out.println("\t knockdown round: " + knockdown);



    }
}