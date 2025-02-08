package TicTacToa;

public class Player2 extends Player {

	Player2(String name, Symbols s) {
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
			System.out.println("Game status from player 2 is: "+b.status);
		}
	}
	
}
