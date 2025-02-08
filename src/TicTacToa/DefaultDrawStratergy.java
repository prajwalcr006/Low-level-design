package TicTacToa;

public class DefaultDrawStratergy implements DrawStratergy {

	@Override
	public boolean checkDraw(GameBoard gameBoard) {
		
		for(int i=0;i<gameBoard.size;i++) {
			for(int j=0;j<gameBoard.size;j++) {
				if(gameBoard.board[i][j] == Symbols.START) {
					return false;
				}
			}
		}
		
		return true;
	}

	
}
