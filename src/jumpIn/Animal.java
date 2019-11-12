package jumpIn;

public class Animal {
	
	private int x;
	private int y;
	
	private boolean isRabbit;
	private boolean isFox;
	
	private String occupant;
	private boolean validCon;
	
	public Animal(int x, int y, String occupant) {
		this.x = x;
		this.y = y;
		if ( (occupant.equals("r")) || (occupant.contentEquals("f")) ) {
			validCon = true;
		}
		else {
			throw new IllegalArgumentException("Please enter f for fox or r for rabbit");
		}
		if ( (validCon) && (occupant.equals("r")) ) {
			this.makeRabbit();
		}
		else if( (validCon) && (occupant.contentEquals("f")) ) {
			this.makeFox();
		}
	}
	
	public boolean isRabbit() {
		return this.isRabbit;
	}
	
	public void makeRabbit() {
		this.isRabbit = true;
	}
	
	public boolean isFox() {
		return this.isFox;
	}
	
	public void makeFox() {
		this.isFox = true;
	}
	
	public static void main(String[] args) {
		
		
		}
}

