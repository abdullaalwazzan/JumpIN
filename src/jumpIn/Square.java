package jumpIn;

public class Square {
	private int x;
	private int y;
	private boolean isEmpty;
	private boolean isHole;
	private boolean isMushroom;
	private String occupant;
	private boolean validCon;
	
	
	public Square(int x, int y, String occupant) throws IllegalArgumentException{
		if ((x < 0) || (x > 4) || (y < 0) || (y > 4)) {
			throw new IllegalArgumentException("Out of bounds!!\n please enter values from 0 - 4");
		}
		else {
			this.x = x;
			this.y = y;
			if ( (occupant.equals("m")) || (occupant.equals("h")) || (occupant.equals("e")) ) {
				validCon = true;
			}
			this.occupant = occupant;
			if( (validCon) && (occupant.equals("m")) ) {
				this.makeMushroom();
			}
			
			else if( (validCon) && (occupant.equals("h")) ) {
				this.makeHole();
			}
			
			else if( (validCon) && (occupant.equals("e")) ) {
				this.makeEmpty();
			}
		}
	}
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
	public boolean isEmpty() {
		return this.isEmpty;
	}
	
	public void makeEmpty() {
		this.isEmpty = true;
		this.isHole = false;
		this.isMushroom = false;
	}
	
	public boolean isHole() {
		return this.isHole;
	}
	
	public void makeHole() {
		this.isHole = true;
		this.isEmpty = false;
		this.isMushroom = false;
	}

	public boolean isMushroom() {
		return this.isMushroom;
	}
	
	public void makeMushroom() {
		this.isMushroom = true;
		this.isHole = false;
		this.isEmpty = false;
	} 
	
	public String getOccupant() {
		return this.occupant;
	}
	
	public String toString() {
		String s= "";
		if(this.isHole()) {
			s = "| X |";
		}
		if(this.isMushroom()) {
			s = "| M |";
		}
		
		if(this.isEmpty()) {
			s = "|   |";
		}
		return s;
	}	
	
	public static void main(String[] args) {
			
	}

}