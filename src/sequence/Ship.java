package sequence;

public class Ship {

	public int shipIDNumber;
	public int shipLocation;
	
	public Ship(int shipIDNumber, int shipLocation) {
		
		this.shipIDNumber = shipIDNumber;
		this.shipLocation = shipLocation;
		
	}
	
	public String receive(Container container) {
		
		if (this.shipLocation == container.containerLocation) {
			return "Done.";
		}
		else {
			return "Loading failed.";
		}
		
	}
	
}