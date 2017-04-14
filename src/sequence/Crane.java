package sequence;

public class Crane {
	
	public int craneIDNumber;
	public int craneLocation;
	
	public Crane(int craneIDNumber, int craneLocation) {
		
		this.craneIDNumber = craneIDNumber;
		this.craneLocation = craneLocation;
		
	}

	public boolean validateOperator(Operator operator) {
		
		if (operator.validCranes.contains(this.craneIDNumber)) {
			System.out.println("Operator " + operator.operatorIDNumber +
					" is validated for this crane.");
			System.out.println("Crane " + this.craneIDNumber + " activated.");
			return true;
		}
		
		System.out.println("Operator " + operator.operatorIDNumber +
				" is not validated for this crane.");
		return false;
		
	}

	public String move(Warehouse warehouse) {
		
		while (this.craneLocation != warehouse.warehouseLocation) {
			
			System.out.print(".");
			
			if (this.craneLocation > warehouse.warehouseLocation) {
				this.craneLocation--;
			}
			else {
				this.craneLocation++;
			}
		}
		
		return "Arrived.";
		
	}
	
	public String move(Ship ship, Container container) {
		
		while (this.craneLocation != ship.shipLocation) {
			
			System.out.print(".");
			
			if (this.craneLocation > ship.shipLocation) {
				this.craneLocation--;
				
			}
			else {
				this.craneLocation++;
			}
			
			container.containerLocation = this.craneLocation;
		}
		
		return "Arrived.";
		
	}
	
	public String pickup(Container container) {
		
		while (this.craneLocation != container.containerLocation) {
			
			System.out.print(".");
			
			if (this.craneLocation > container.containerLocation) {
				this.craneLocation--;
				
			}
			else {
				this.craneLocation++;
			}
			
		}
		
		return container.pickup(this.craneLocation);
		
	}

	public String deliver(Ship ship, Container container) {
		
		return ship.receive(container);
		
	}
	
}