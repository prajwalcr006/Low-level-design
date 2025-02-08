package TicTacToa;

public class DefaultWinStratergy implements WinStratergy {

	@Override
	public boolean checkWin(GameBoard board) {
		return 	checkRows(board) || 
				checkColumns(board) || 
				checkMainDiagonal(board) || 
				checkSecondaryDiagonal(board);
	}
	
	private boolean checkRows(GameBoard gameBoard) {
		boolean flag;
		for(int i=0;i<gameBoard.size;i++) {
			flag = true;
			Symbols start = gameBoard.board[i][0];
			for(int j=1;j<gameBoard.size;j++) {
				if(start != gameBoard.board[i][j]) {
					flag = false;
					break;
				}
			}
			
			if(flag && start != Symbols.START) {
				return true;
			}
		}
		
		return false;
	}
	
	private boolean checkColumns(GameBoard gameBoard) {
		boolean flag;
		for(int i=0;i<gameBoard.size;i++) {
			flag = true;
			Symbols start = gameBoard.board[0][i];
			for(int j=1;j<gameBoard.size;j++) {
				if(start != gameBoard.board[j][i]) {
					flag = false;
					break;
				}
			}
			
			if(flag && start != Symbols.START) {
				return true;
			}
		}
		
		return false;
	}
	
	private boolean checkMainDiagonal(GameBoard gameBoard) {
		Symbols start = gameBoard.board[0][0];
		boolean flag = true;
		for(int j=1;j<gameBoard.size;j++) {
			if(start != gameBoard.board[j][j]) {
				flag = false;
				break;
			}
		}
		
		if(flag && start != Symbols.START) {
			return true;
		}
		
		return false;
	}
	
	private boolean checkSecondaryDiagonal(GameBoard gameBoard) {
		int size = gameBoard.size;
		Symbols start = gameBoard.board[size-1][size-1];
		boolean flag = true;
		for(int j=size-2;j>=0;j--) {
			if(start != gameBoard.board[j][j]) {
				flag = false;
				break;
			}
		}
		
		if(flag && start != Symbols.START) {
			return true;
		}
		
		return false;
	}

}
