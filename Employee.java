package employees;

public abstract class Employee {
	
	protected String name; 
	protected int id; 
	
	public Employee(){
		this.name = " "; 
		this.id = 0; 
	}
	
	public Employee(String name, int id){
		this.name = name; 
		this.id = id; 
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "name: " + name + ", id: " + id; 
	}
	
	public boolean equals(Object obj){
		if (this == obj)
			return true;
		
		if (obj == null || obj.getClass() != this.getClass())
			return false; 
		
		Employee e = (Employee) obj;
		
		return (name == e.name && id == e.id);
	}
	
	public abstract double calculatePay(); 

}
