package TicTacToa;

public enum Symbols {
	START("*"),
	CIRCLE("O"),
	TRIANGLE("T");
	
	private String value;
	
	Symbols(String value) {
		this.value = value;
	}
}
