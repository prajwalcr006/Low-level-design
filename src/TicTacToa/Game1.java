package TicTacToa;

import java.util.List;
import java.util.Scanner;

public class Game1 extends Game {

	Game1(GameBoard board, List<Player> playerList, MoveStratergy moveStratergy, WinStratergy winStratergy,
			DrawStratergy drawStratergy) {
		super(board, playerList, moveStratergy, winStratergy, drawStratergy);
	}

	@Override
	public void initialize() {
		board.initialize();
		for(Player player: playerList) {
			board.addObservers(player);
		}
		runGame();
	}

	@Override
	public void runGame() {
		Scanner in = new Scanner(System.in);
		
		while(board.status == GameStatus.RUNNING) {
			Player p = turnQueue.poll();
			
			System.out.println("Player "+p.name+" turn!!");
			boolean invalidMove = true;
			
			do {
				System.out.println("Enter row and col for the game");
				int row = in.nextInt();
				int col = in.nextInt();
				
				if(moveStratergy.isValidMove(board,row,col)) {
					p.makeMove(board,row,col);
					invalidMove = false;
				}
				
			} while(invalidMove);
			
			if(winStratergy.checkWin(board)) {
				board.status = GameStatus.WIN;
				announceWinner(p);
			}
			
			if(drawStratergy.checkDraw(board)) {
				board.status = GameStatus.DRAW;
				announceWinner(p);
			}
			
			turnQueue.add(p);
		}
	}

	@Override
	public void announceWinner(Player p) {
		if (board.status == GameStatus.WIN) {
			System.out.println("Player "+ p.name + " Won!!!");	
		}
		
		if(board.status == GameStatus.DRAW) {
			System.out.println("Game Draw!!!");
		}
	}
}
