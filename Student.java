package employees;

public class Student extends HourlyEmployee{
	
	private char grade; 
	private String emailMessage; 
	
	public Student(String name, int id, double wage, double hours){
		this.name = name; 
		this.id = id; 
		this.hourlyWage = wage; 
		this.hoursWorked = hours; 
	}
	
	public Student(){
		this.name = " "; 
		this.id = 0; 
		this.hourlyWage = 0.0; 
		this.hoursWorked = 0.0; 
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}

	public String getEmailMessage() {
		return emailMessage;
	}

	public void setEmailMessage(String emailMessage) {
		this.emailMessage = emailMessage;
	}
	
	public boolean equals(Object obj){
		if (this == obj)
			return true;
		
		if (obj == null || obj.getClass() != this.getClass())
			return false; 
		
		Student s = (Student) obj;
		
		return (name == s.name && id == s.id && hourlyWage == s.hourlyWage && hoursWorked == s.hoursWorked && grade == s.grade && emailMessage == s.emailMessage);
	}
	
	public void act(){
		if(grade == 'A')
			System.out.println("I have passed this course.");
		else 
			System.out.println("I need to work harder");
	}
	
}
