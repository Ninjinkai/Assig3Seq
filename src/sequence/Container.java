package sequence;

public class Container {

	public int containerIDNumber;
	public int containerLocation;
	
	public Container(int containerIDNumber, int containerLocation) {
		
		this.containerIDNumber = containerIDNumber;
		this.containerLocation = containerLocation;
		
	}
	
	public String pickup(int craneLocation) {
		
		if (this.containerLocation == craneLocation) {
			return "Done.";
		}
		else {
			return "Pick up failed.";
		}
		
	}
	
}