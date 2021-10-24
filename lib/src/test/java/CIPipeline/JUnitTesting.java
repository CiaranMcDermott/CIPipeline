package CIPipeline;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;
import org.joda.time.LocalDate;

public class JUnitTesting {

	@Test
	//Test some Student class methods
	public void StudentTests() {
		System.out.println("\n****JUnit Test 3****");
		
		//create student object
		Student student = new Student("Ciaran", 22, "15/02/1999", "18379421", "Electronic Engineering", "System on Chip");
		
		//Test getCourse() method and print result
		System.out.println(student.getCourse());
		
		//use setCourse() method and retrieve results again
		student.setCourse("Computer Engineering");
		System.out.println(student.getCourse());
	}
	
	@Test
	//Test some Module class methods
	public void moduleTests() {
		System.out.println("\n****JUnit Test 1****");

		//Add students to the module
		ArrayList<String> students = new ArrayList<String>();
	    students.add("Ciaran");
	    students.add("Joe");
	    students.add("Paddy");
	    
	    //Add courses to the module
	    ArrayList<String> courses = new ArrayList<String>();
	    students.add("Engineering");
	    students.add("CSIT");
		
	    //Create module
		Module module = new Module("System on Chip", "EE451", students, courses);
		
		//Test getModuleName method and print variable values
		System.out.println(module.getModuleName());
		
		//change module name and print again
		module.setModuleName("SOC");
		System.out.println(module.getModuleName());
	}
	
	
	@Test
	//Test some Course class methods
	public void courseTests() {
		System.out.println("\n****JUnit Test 2****");
		
		//Add modules to the course
		ArrayList<String> modules = new ArrayList<String>();
	    modules.add("Signals");
	    modules.add("Maths");
	    modules.add("System on Chip");
	    
	    //Add students to the module
  		ArrayList<String> students = new ArrayList<String>();
  	    students.add("Ciaran");
  	    students.add("Joe");
  	    students.add("Paddy");
  	    
  	    LocalDate startDate = LocalDate.parse("2021-09-08");
  	    LocalDate endDate = LocalDate.parse("2022-05-06");
		
		//create Course object
		Course course = new Course("Electronic Engineering", modules, students, startDate, endDate);
		
		//Test getStartDate() method and print output
		System.out.println(course.getStartDate().toString());
		
		//Change start date with setStartDate() method and retrieve start date again
		LocalDate newDate = LocalDate.parse("2021-09-28");
		course.setStartDate(newDate);
		System.out.println(course.getStartDate().toString());
	}
	

	

}
