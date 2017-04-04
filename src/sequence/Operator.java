package sequence;

public class Operator {
	
	public int operatorIDNumber;
	
	public Operator(int operatorIDNumber) {
		this.operatorIDNumber = operatorIDNumber;
	}

	public void activate(Crane crane) {
		System.out.println("Activating Crane " + crane.craneIDNumber + ".");
		
		if (crane.validateOperator(this)) {
			System.out.println("Operator is validated for this crane.");
			System.out.println("Crane " + crane.craneIDNumber + " activated.");
		}
		else {
			System.out.println("Operator is not validated for this crane.");
		}
	}
	
	public void move(Crane crane, Warehouse warehouse) {
		crane.move(warehouse);
	}
	
	public void pickup() {
		
	}
	
	public void deliver() {
		
	}

}
