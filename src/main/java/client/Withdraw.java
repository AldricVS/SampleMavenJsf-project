package client;

import javax.persistence.Entity;

@Entity
public class Withdraw extends AbstractOperation {

	public Withdraw() {

	}

	public Withdraw(int serviceTime) {
		super(serviceTime);
	}

	@Override
	public boolean isUrgent() {
		return true;
	}

	@Override
	public String toString() {
		return "Operation : Withdraw";
	}

}