package sequence;

import java.util.Random;

public class Crane {
	
	public int craneIDNumber;
	
	public Crane(int craneIDNumber) {
		this.craneIDNumber = craneIDNumber;
	}

	public boolean validateOperator(Operator operator) {
		
		if (operator.operatorIDNumber == this.craneIDNumber) {
			return true;
		}
		
		return false;
	}

	public void move(Warehouse warehouse) {
		
		Random random = new Random();
		int countdown = random.nextInt(10);
		
		System.out.print("Moving Crane " + this.craneIDNumber + " to Warehouse " + warehouse.warehouseIDNumber + ".");
		while (countdown > 0) {
			System.out.print('.');
			countdown--;
		}
		System.out.println("Done.");
	}
	
	public void pickup() {
		
	}
	
	public void deliver() {
		
	}
	
}
