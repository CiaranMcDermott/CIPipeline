/**
 * 
 */
package CIPipeline;

/**
 * @author Ciaran
 *
 */
public class Student {
String name, DOB, ID, username, course, module;
int age;

	public Student(String name, int age, String DOB, String ID, String course, String module) {
		this.name = name;
		this.age = age;
		this.DOB = DOB;
		this.ID = ID;		
		this.course = course;
		this.module = module;
		this.username = getUsername();
	}
	
	String getUsername(){
		return "name"+age; 
	}
	
	/**
	 * Accessor methods
	 */
	
	String getName() {
		return name;
	}
	
	int getAge() {
		return age;
	}
	
	String getDOB() {
		return DOB;
	}
	
	String getID() {
		return ID;
	}
	
	String getCourse() {
		return course;
	}
	
	String getModule() {
		return module;
	}
	
	/**
	 * Mutator methods
	 */
	
	void setName(String setName) {
		name = setName;
	}
	
	void setAge(int setAge) {
		age = setAge;
	}
	
	void setDOB(String setDOB) {
		DOB = setDOB;
	}
	
	void setID(String setID) {
		ID = setID;
	}
	
	void setUsername(String setUsername) {
		username = setUsername;
	}
	
	void setCourse(String setCourse) {
		course = setCourse;
	}
	
	void setModule(String setModule) {
		module = setModule;
	}
}