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

        ScoreCard blueScoreCard = new ScoreCard("BLUE");
        blueScoreCard.setRCorner("Rocky Balboa");
        blueScoreCard.setBCorner("Apollo Creed");

        blueScoreCard.loadJudgeScoreCard(data[1]
                // Escribe aquí el código para acceder al segundo
                // elemento del array String[][] data de la línea 13,
                // la tarjeta azul
        );
        System.out.println(blueScoreCard);

        PointsDeducted deducted = new PointsDeducted("10 - 8 ,1");
        System.out.println("\n\t points deducted round:\t" + deducted.getRedBoxerScore() +
                " - " + deducted.getBlueBoxerScore());

        deducted = new PointsDeducted("1, 8 - 10");
        System.out.println("\n\t points deducted round:\t" + deducted.getRedBoxerScore() +
                " - " + deducted.getBlueBoxerScore());

        PointsDeducted pointsDeducted = (PointsDeducted) RoundFactory.getRound("1, 8 - 10");
        System.out.println("\n\t factory deducted round: " + pointsDeducted);

        ScoreCard pinkScoreCard = new ScoreCard("PINK");
        pinkScoreCard.setRCorner("Rocky Balboa");
        pinkScoreCard.setBCorner("Apollo Creed");

        pinkScoreCard.loadJudgeScoreCard(data[2]);
        System.out.println(pinkScoreCard);
    }
}