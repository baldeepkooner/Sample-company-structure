package employees;


public abstract class SalariedEmployee extends Employee {
	
	public SalariedEmployee(String name, int id){
		this.name = name; 
		this.id = id; 
	}
	
	public SalariedEmployee(){
		this.name = " "; 
		this.id = 0; 
	}
	
	protected double annualSalary;

	public double getAnnualSalary() {
		return annualSalary;
	}

	public void setAnnualSalary(double annualSalary) {
		this.annualSalary = annualSalary;
	} 
	
	public double calculatePay(){
		return (annualSalary / 26.0);
	}
	
	public abstract void act(); 
	
	public boolean equals(Object obj){
		if (this == obj)
			return true;
		
		if (obj == null || obj.getClass() != this.getClass())
			return false; 
		
		SalariedEmployee se = (SalariedEmployee) obj;
		
		return (name == se.name && id == se.id && annualSalary == se.annualSalary);
	}

}
