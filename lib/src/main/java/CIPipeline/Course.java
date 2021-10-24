package CIPipeline;

import java.util.ArrayList;
import org.joda.time.LocalDate;

public class Course {
	ArrayList<String> modules, students = new ArrayList<String>();
	String courseName;
	LocalDate startDate, endDate = new LocalDate();
	
	public Course(String courseName, ArrayList<String> modules, ArrayList<String> students, LocalDate startDate, LocalDate endDate) {
		this.courseName = courseName;
		this.modules = modules;
		this.students = students;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	
	String getCourseName() {
		return courseName;
	}
	
	ArrayList<String> getModules(){
		return modules;
	}
	
	ArrayList<String> getStudents(){
		return students;
	}
	
	LocalDate getStartDate() {
		return startDate;
	}
	
	LocalDate getEndDate() {
		return endDate;
	}
	
	//Mutator methods
	void setCourseName(String setCourseName) {
		courseName = setCourseName;
	}
	
	void setModules(ArrayList<String> setModules) {
		modules = setModules;
	}
	
	void setStudents(ArrayList<String> setStudents) {
		students = setStudents;
	}
	
	void setStartDate(LocalDate setStartDate) {
		startDate = setStartDate;
	}
	
	void setEndDate(LocalDate setEndDate) {
		endDate = setEndDate;
	}

}
