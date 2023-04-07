package leaderboards.serializables;

import contracts.IHighScore;
import highscore.serializables.HighScoreSpeedRun;

public class LeaderboardsSpeedrun extends BaseLeaderboardsSerializable{
    public final String FILE_NAME = "LeaderboardsSpeedrun.bin";
    
    @Override
    public void addToLeaderboards(IHighScore iHighScore) {
        var highScore = (HighScoreSpeedRun) iHighScore;
        leaderboards.add(0, highScore);
    }
}
