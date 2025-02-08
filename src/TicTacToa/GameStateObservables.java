package TicTacToa;

public interface GameStateObservables {
	public void addObservers(GameStateObservers observer);
	public void removeObservers(GameStateObservers observer);
	
	public void updateAll();
}
