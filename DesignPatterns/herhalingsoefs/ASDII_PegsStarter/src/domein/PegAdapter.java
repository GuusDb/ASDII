package domein;

public class PegAdapter implements ISquarePeg, IRoundPeg {

	private IRoundPeg roundPeg;
	private ISquarePeg squarePeg;
	
	public PegAdapter(IRoundPeg roundPeg) {
		this.roundPeg = roundPeg;
	}
	
	public PegAdapter(ISquarePeg squarePeg) {
		this.squarePeg = squarePeg;
	}

	public void insert(String str) {
		if(roundPeg!=null)
			roundPeg.insertIntoHole(str);
	}

	public void insertIntoHole(String mes) {
		if(squarePeg!=null)
			squarePeg.insert(mes);
	}
}
