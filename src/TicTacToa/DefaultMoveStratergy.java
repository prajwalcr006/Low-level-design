package TicTacToa;

public class DefaultMoveStratergy implements MoveStratergy {

	@Override
	public boolean isValidMove(GameBoard gameBoard, int row, int col) {
		int size = gameBoard.size;
		
		return !(row>=size || row<0 || col>=size || col<0 || gameBoard.board[row][col] != Symbols.START);
	}

}
