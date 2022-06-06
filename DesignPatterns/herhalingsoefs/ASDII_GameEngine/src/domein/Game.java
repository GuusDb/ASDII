package domein;

public abstract class Game {

	private int playersCount;

	public final void playOneGame(int playersCount) {
		int player = -1;
		initializeGame();
		setPlayersCount(playersCount);
		while(!endOfGame()) {
			player = (player+1)%playersCount;
			makePlay(player);
		}
		printWinner(player);
		
	}

	private void setPlayersCount(int playersCount) {
		this.playersCount = playersCount;
	}

	protected abstract void initializeGame();

	protected abstract void makePlay(int player);

	protected abstract boolean endOfGame();

	protected abstract void printWinner(int player);
}
