package sequence;

public class LoadContainer {
	
	public static void main(String[] args) {
		
		System.out.println("Program to load a container into a ship.");
		
//		The following objects' properties would be set by a user interface.
//		Port objects have an ID and a location (except Operator).  For
//		simplicity, the IDs are not unique.  The location is an integer
//		that refers to some specific place in the port, similar to an ID.
		
//		Creates the Operator with an ID number followed by the ID numbers of
//		cranes they can operate.
		Operator operator = new Operator(8, 1, 2, 5, 6);
//		Creates the Crane with an ID number and its current location.
		Crane crane = new Crane(4, 2);
//		Creates the Warehouse with an ID number and its current location.
		Warehouse warehouse = new Warehouse(17, 3);
//		Creates the Container with an ID number and its current location.
		Container container = new Container(845, 9);
//		Creates the Ship with an ID number and its current location.
		Ship ship = new Ship(4, 20);
		
//		If the Operator can activate the Crane, loading will occur.
		if (operator.activate(crane)) {
			
//			The Operator moves the Crane to the Warehouse.
			operator.move(crane, warehouse);
//			The Operator picks up the Container.
			operator.pickup(crane, container);
//			The Operator moves the Crane with the Container to the Ship.
			operator.move(crane, ship, container);
//			The Operator delivers the Container to the Ship with the Crane.
			operator.deliver(crane, ship, container);
		}
		
	}

}