package entities;

public final class OutsourcedEmployee extends Employee{
	
	private Double additionalCharge;
	
	//private Employee employee = new Employee();

	//metodo padrão
	public OutsourcedEmployee() {
		
	}

	//metodo com argumentos da classe + da super classe
	public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}
	
	//metodos GETTERS and SETTERS
	public Double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}

	//metodo de pagamentos
	@Override
	public double payment() {
		super.payment();
		return ((hours * valuePerHour) + additionalCharge)
				+ additionalCharge * 0.1;
	}
	
	
}
