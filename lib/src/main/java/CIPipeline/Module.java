package CIPipeline;
import java.util.ArrayList;

public class Module {
	
	String moduleName, ID;
	
	ArrayList<String> students, courses = new ArrayList<String>(); // Create an ArrayList object
	
	public Module(String moduleName, String ID, ArrayList<String> students, ArrayList<String> courses) {
		this.moduleName = moduleName;
		this.ID = ID;
		this.students = students;
		this.courses = courses;
	}
	
	/**
	 * Accessor methods
	 */
	
	String getModuleName() {
		return moduleName;
	}
	
	String getID() {
		return ID;
	}
	
	ArrayList<String> getStudents(){
		return students;
	}
	
	ArrayList<String> getCourses(){
		return courses;
	}
	
	/**
	 * Mutator methods
	 */
	
	void setModuleName(String setModuleName) {
		moduleName = setModuleName;
	}
	
	void setID(String setID) {
		ID = setID;
	}
	
}
