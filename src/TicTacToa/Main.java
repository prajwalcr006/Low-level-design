package TicTacToa;

import java.util.List;
import java.util.UUID;
import java.util.Arrays;

public class Main {
	public static void main(String args[]) {
		
		GameBoard board = new GameBoard1(UUID.randomUUID().toString(), 3);
		
		List<Player> playerList = Arrays.asList(
			    new Player1("Ben", Symbols.CIRCLE),
			    new Player2("Max", Symbols.TRIANGLE)
			);
		
		MoveStratergy moveStratergy = new DefaultMoveStratergy();
		WinStratergy winStratergy = new DefaultWinStratergy();
		DrawStratergy drawStratergy = new DefaultDrawStratergy();
		
		Game game = new Game1(board, playerList, moveStratergy, winStratergy, drawStratergy);
		
		game.initialize();
		
	}
}
