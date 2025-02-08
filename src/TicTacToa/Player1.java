package TicTacToa;

public class Player1 extends Player {

	Player1(String name, Symbols s) {
		super(name, s);
	}

	@Override
	public void makeMove(GameBoard gameBoard, int row, int col) {
		gameBoard.board[row][col] = s;
	}

	@Override
	public void update(GameStateObservables observable) {
		if(observable instanceof GameBoard) {
			GameBoard b = (GameBoard)observable;
			System.out.println("Game status from player 1 is: "+b.status);
		}
	}
	
}
