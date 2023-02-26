package entities;

public class OutsourcedEmployee extends Employee{
	
	private double additionalCharge;
	
	public OutsourcedEmployee(){
		super();
	}

	public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}

	public double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}
	
	@Override
	public double payment() { //retorna o pagamento normal, por isso super.payment() e + os 110% do additionalCharge
		return super.payment() + (additionalCharge * 1.1);
	}
	
}
