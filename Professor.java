package employees;
import java.util.ArrayList;


public class Professor extends SalariedEmployee{
	
	protected ArrayList <Student> students = new ArrayList <Student> ();
	protected ArrayList <TeachingAssistant> teachingAssistants = new ArrayList <TeachingAssistant> (); 
	
	public Professor(String name, int id){
		this.name = name; 
		this.id = id; 
	}

	public ArrayList<Student> getStudents() {
		return students;
	}

	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}

	public ArrayList<TeachingAssistant> getTeachingAssistants() {
		return teachingAssistants;
	}

	public void setTeachingAssistants(
			ArrayList<TeachingAssistant> teachingAssistants) {
		this.teachingAssistants = teachingAssistants;
	}
	
	public boolean addEmployee(Employee e){
		if(e instanceof Student){
			students.add((Student) e); 
			return true;
		} else if (e instanceof TeachingAssistant){
			teachingAssistants.add((TeachingAssistant) e); 
			return true; 
		}
		return false; 
	}
	
	public void act(){
		for(TeachingAssistant ta : teachingAssistants)
			ta.act();
		for(Student s : students){
			s.setEmailMessage("Your grades have been posted. Please kindly check the course website");
		} 
	}
	
	public boolean equals(Object obj){
		if (this == obj)
			return true;
		
		if (obj == null || obj.getClass() != this.getClass())
			return false; 
		
		Professor p = (Professor) obj;
		
		return (name == p.name && id == p.id && annualSalary == p.annualSalary && teachingAssistants == p.teachingAssistants && students == p.students);
	}

}
