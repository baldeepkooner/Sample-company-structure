package employees;
import java.util.ArrayList;


public class Company {
	
	protected ArrayList<Employee> employees = new ArrayList <Employee> (); 
	
	public Company(){
		this.employees = new ArrayList<Employee> (); 
	}
	
	public boolean equals(Object obj){
		if (this == obj)
			return true;
		
		if (obj == null || obj.getClass() != this.getClass())
			return false; 
		
		Company c = (Company) obj;
		
		return (employees == c.employees);
	}
	
	public String lookUpEmployee(Employee e){
		for(Employee employee : employees){
			if(employee.equals(e))
				return employee.toString(); 
		}
		return null;
	}
	
	public boolean addEmployee(Employee e){
		String check = lookUpEmployee(e); 
		if(check == null){
			employees.add(e); 
			return true; 
		}
		return false; 
	}
	
	public double calculatePayroll(){
		double payroll = 0.0; 
		for(Employee e : employees)
			payroll += e.calculatePay(); 
		return payroll; 
	}
}
