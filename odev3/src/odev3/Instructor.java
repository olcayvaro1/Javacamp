package odev3;

public class Instructor extends user {
	
	private String żnstructorGrade;
	
	public Instructor() {
		
	}
	

	public Instructor(String instructorGrade) {
		super();
		żnstructorGrade = instructorGrade;
	}
	

	public String getInstructorGrade() {
		return żnstructorGrade;
	}

	public void setInstructorGrade(String instructorGrade) {
		żnstructorGrade = instructorGrade;
	}

}
