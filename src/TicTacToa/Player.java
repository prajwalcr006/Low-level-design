package TicTacToa;

public abstract class Player implements GameStateObservers {
	String name;
	Symbols s;
	
	Player(String name, Symbols s) {
		this.name = name;
		this.s = s;
	}     
	
	public abstract void makeMove(GameBoard board, int row, int col);
}
