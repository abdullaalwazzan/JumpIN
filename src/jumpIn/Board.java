package jumpIn;

public class Board {
	
	private Square[][] board;
	
	public Board() {
		board = new Square[5][5];
	}
	
	public String toString() {
		String board = "   0   1   2   3   4 " + "\n" +
					 "---------------------\n" +
					 "0| |   |   |   |" + "\n" +
					 "---------------------\n" +
					 "1|   |   |   |   |\n" +
					 "---------------------\n" +
					 "2|   |   |   |   |\n" +
					 "---------------------\n" +
					 "3|   |   |   |   |\n" +
					 "---------------------\n" +
					 "4|   |   |   |   |\n";
		return board;
						
	}

	public static void main(String[] args) {
		
		Board board = new Board();
		System.out.println(board.toString());
		// TODO Auto-generated method stub

	}

}
