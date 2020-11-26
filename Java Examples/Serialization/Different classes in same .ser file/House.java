import java.io.Serializable;

public class House implements Serializable {

	private int numBathrooms;
	private int numBedrooms;
	
	public House(int bath, int bed) {
		this.numBathrooms = bath;
		this.numBedrooms = bed;
	}
	
	public int getNumBathrooms() {
		return this.numBathrooms;
	}
	public int getNumBedrooms() {
		return this.numBedrooms;
	}
}
