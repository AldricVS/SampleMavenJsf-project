package client;

import javax.persistence.Entity;

@Entity
public class Consultation extends AbstractOperation {
	
	public Consultation() {
		
	}

	public Consultation(int serviceTime) {
		super(serviceTime);
	}

	@Override
	public boolean isUrgent() {
		return false;
	}
	
	@Override
	public String toString() {
		return "Operation : Consultation";
	}
}
