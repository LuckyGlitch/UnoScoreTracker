public class ScoreAndPlayerCount {

    public static void getScoreAndPlayerCount(){

        int numberOfPlayers = InterAction.getNumberValue("number of players");
        if (numberOfPlayers > 8 || numberOfPlayers < 2) {
            while (numberOfPlayers > 8 || numberOfPlayers < 2) {
                InterAction.print("The number of players should contain minimum 2 players to maximum 8 players");
                InterAction.print("Enter valid number of players");
                numberOfPlayers = InterAction.getNumberValue("number of players");
            }
        }
        int winScore = InterAction.getNumberValue("winning score");
        if(winScore < 1){
            while(winScore < 1){
                InterAction.print("Enter valid winscore");
                winScore = InterAction.getNumberValue("winning score");
            }
        }else {
            InterAction.print("Your have " + numberOfPlayers + " players and your winning score is " + winScore);
        }

        InterAction.print("Do you wish to proceed? (Yes/No)");
        if (InterAction.checkYesOrNo()) {
            InterAction.getPlayerNames();
        } else {
            InterAction.updateScoreAndPlayerCount();
        }
    }
}
