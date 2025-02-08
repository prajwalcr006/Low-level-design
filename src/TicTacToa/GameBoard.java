package TicTacToa;

import java.util.List;
import java.util.Queue;
import java.util.ArrayList;
public abstract class GameBoard implements GameStateObservables {
	String id;
	int size;
	GameStatus status;
	Symbols board[][];
	List<GameStateObservers>observerList;
	
	GameBoard(String id, int size) {
		this.id = id;
		this.size = size;
		
		status = GameStatus.RUNNING;
		observerList = new ArrayList<>();
		board = new Symbols[size][size];
		
	}
	
	public abstract void initialize();
	public abstract void updateBoard(int row, int col, Symbols s);
	
}
