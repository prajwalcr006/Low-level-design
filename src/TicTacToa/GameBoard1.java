package TicTacToa;


public class GameBoard1 extends GameBoard {

	GameBoard1(String id, int size) {
		super(id, size);
	}

	@Override
	public void addObservers(GameStateObservers observer) {
		observerList.add(observer);
		
	}

	@Override
	public void removeObservers(GameStateObservers observer) {
		observerList.remove(observer);
		
	}

	@Override
	public void updateAll() {
		for(GameStateObservers observer: observerList) {
			observer.update(this);
		}
	}

	@Override
	public void updateBoard(int row, int col, Symbols s) {
		board[row][col] = s;
		updateAll();
	}

	@Override
	public void initialize() {
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				board[i][j] = Symbols.START;
			}
		}
	}
	
}
