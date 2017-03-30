package employees;


public abstract class HourlyEmployee extends Employee{
	
	protected double hourlyWage; 
	protected double hoursWorked; 
	
	public HourlyEmployee(String name, int id){
		this.name = name; 
		this.id = id; 
	}
	
	public HourlyEmployee(){
		this.name = " "; 
		this.id = 0; 
	}

	public double getHourlyWage() {
		return hourlyWage;
	}

	public void setHourlyWage(double hourlyWage) {
		this.hourlyWage = hourlyWage;
	}

	public double getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(double hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	
	public double calculatePay(){
		return (hoursWorked * 2 * hourlyWage); 
	}

	public abstract void act(); 
	
	public boolean equals(Object obj){
		if (this == obj)
			return true;
		
		if (obj == null || obj.getClass() != this.getClass())
			return false; 
		
		HourlyEmployee he = (HourlyEmployee) obj;
		
		return (name == he.name && id == he.id && hourlyWage == he.hourlyWage && hoursWorked == he.hoursWorked);
	}
	
}
