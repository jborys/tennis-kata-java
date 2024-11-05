public class Score {
    private String PlayerOneName;
    private String PlayerTwoName;
    private int playerOneScore;
    private int playerTwoScore;
    private String score = "Love-All";

    public Score(int playerOneScore, int playerTwoScore, String score) {
        this.playerOneScore = playerOneScore;
        this.playerTwoScore = playerTwoScore;
        this.score = score;
    }

    public String getPlayerOneName() {
        return PlayerOneName;
    }

    public void setPlayerOneName(String playerOneName) {
        PlayerOneName = playerOneName;
    }

    public String getPlayerTwoName() {
        return PlayerTwoName;
    }

    public void setPlayerTwoName(String playerTwoName) {
        PlayerTwoName = playerTwoName;
    }

    public int getPlayerOneScore() {
        return playerOneScore;
    }

    public void setPlayerOneScore(int playerOneScore) {
        this.playerOneScore = playerOneScore;
    }

    public int getPlayerTwoScore() {
        return playerTwoScore;
    }

    public void setPlayerTwoScore(int playerTwoScore) {
        this.playerTwoScore = playerTwoScore;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }
}
