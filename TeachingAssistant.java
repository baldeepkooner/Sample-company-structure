package employees;
import java.util.ArrayList;


public class TeachingAssistant extends HourlyEmployee{
	
	protected ArrayList <Student> students = new ArrayList <Student> ();

	public ArrayList<Student> getStudents() {
		return students;
	}
	
	public TeachingAssistant(String name, int id, double wage, int hours){
		this.name = name; 
		this.id = id; 
		this.hourlyWage = wage; 
		this.hoursWorked = hours; 
	}

	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	} 
	
	public boolean equals(Object obj){
		if (this == obj)
			return true;
		
		if (obj == null || obj.getClass() != this.getClass())
			return false; 
		
		TeachingAssistant ta = (TeachingAssistant) obj;
		
		return (name == ta.name && id == ta.id && hourlyWage == ta.hourlyWage && hoursWorked == ta.hoursWorked && students == ta.students);
	}
	
	public boolean addStudent(Student s){
		if (students.contains(s))
			return false; 
		else 
			students.add(s); 
			return true; 
	}
	
	public void act(){
		for(Student s : students)
			if(name.charAt(0) == 'A' || name.charAt(0) == 'B' || name.charAt(0) == 'C' || name.charAt(0) == 'D' || name.charAt(0) == 'E' || name.charAt(0) == 'F' || name.charAt(0) == 'G' || name.charAt(0) == 'H' || name.charAt(0) == 'I' || name.charAt(0) == 'J' || name.charAt(0) == 'K' || name.charAt(0) == 'L' || name.charAt(0) == 'M')
				s.setGrade('A'); 
			else 
				s.setGrade('F');
	}

}
