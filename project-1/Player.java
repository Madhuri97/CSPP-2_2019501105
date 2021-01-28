
public class Player {
	private String playerName;
	private int score;

	// Constructor
	public Player(final String playerName, final int score) {
		this.playerName = playerName;
		this.score = score;
	}

	//setters
	public  void setPlayerName(final String playerName) {
		this.playerName = playerName;
	}
	public void setScore(final int score) {
		this.score = score;
	}
	//getters
	public String getPlayerName() {
		return this.playerName;
	}
	public int getScore() {
		return this.score;
	 }
}