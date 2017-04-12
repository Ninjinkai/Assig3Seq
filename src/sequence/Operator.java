package sequence;

import java.util.ArrayList;

public class Operator {
	
	public int operatorIDNumber;
	public ArrayList<Integer> validCranes = new ArrayList<Integer>();
	
	public Operator(int operatorIDNumber, int... validCranes) {
		
		this.operatorIDNumber = operatorIDNumber;
		for (int crane : validCranes) {
			this.validCranes.add(crane);
		}

	}

	public boolean activate(Crane crane) {
		
		System.out.println("Operator " + this.operatorIDNumber +
				" is activating Crane " + crane.craneIDNumber + ".");
		return crane.validateOperator(this);
		
	}
	
	public void move(Crane crane, Warehouse warehouse) {
		
		System.out.print("Operator " + this.operatorIDNumber +
				" is moving Crane " + crane.craneIDNumber +
				" to Warehouse " + warehouse.warehouseIDNumber + "...");
		System.out.println(crane.move(warehouse));
		
	}
	
	public void move(Crane crane, Ship ship, Container container) {
		
		System.out.print("Operator " + this.operatorIDNumber +
				" is moving Crane " + crane.craneIDNumber +
				" with Container " + container.containerIDNumber +
				" to Ship " + ship.shipIDNumber + "...");
		System.out.println(crane.move(ship, container));
		
	}
	
	public void pickup(Crane crane, Container container) {
		
		System.out.print("Operator " + this.operatorIDNumber +
				" is using Crane " + crane.craneIDNumber +
				" to pick up Container " + container.containerIDNumber + "...");
		System.out.println(crane.pickup(container));
		
	}

	public void deliver(Crane crane, Ship ship, Container container) {
		
		System.out.print("Operator " + this.operatorIDNumber +
				" is using Crane " + crane.craneIDNumber +
				" to deliver Container " + container.containerIDNumber +
				" to Ship " + ship.shipIDNumber + "...");
		System.out.println(crane.deliver(ship, container));
		
	}

}