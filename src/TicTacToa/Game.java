package TicTacToa;

import java.util.List;
import java.util.Queue;
import java.util.ArrayDeque;

public abstract class Game {
	GameBoard board;
	List<Player>playerList;
	Queue<Player>turnQueue;
	MoveStratergy moveStratergy;
	WinStratergy winStratergy;
	DrawStratergy drawStratergy;
	
	Game(GameBoard board, List<Player>playerList, MoveStratergy moveStratergy, WinStratergy winStratergy, DrawStratergy drawStratergy) {
		this.board = board;
		this.playerList = playerList;
		this.moveStratergy = moveStratergy;
		this.winStratergy = winStratergy;
		this.drawStratergy = drawStratergy;
		
		turnQueue = new ArrayDeque<>();
		
		for(Player player: playerList) {
			turnQueue.add(player);
		}
	}
	
	public abstract void initialize();
	public abstract void runGame();
	public abstract void announceWinner(Player p);
}
