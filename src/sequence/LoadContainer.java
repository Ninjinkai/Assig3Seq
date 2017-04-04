package sequence;

public class LoadContainer {

	public static void main(String[] args) {
		
		Operator operator = new Operator(1);
		Crane crane = new Crane(1);
		Warehouse warehouse = new Warehouse(1);
		Location location = new Location(1);
		Ship ship = new Ship(1);
		
		operator.activate(crane);
		
		operator.move(crane, warehouse);

	}

}
