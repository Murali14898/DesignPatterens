package Registry;

public class Student implements StudentInterface{
	
	public int sid;
	
	public String name;
	
	public String fatherName;
	
	public String batch;
	//method 3 version 2
	protected Student(Student s) {
		s.sid = this.sid;
		s.name = this.name;
		s.fatherName = this.fatherName;
		s.batch = this.batch;
	}

	public Student() {
		
	}

	@Override
	public Student copy() {
		//method 3 version 1
		/*In this version there is no code re-use
		 * Student s = new Student(); 
		 * s.sid = this.sid; 
		 * s.name = this.name;
		 * s.fatherName=this.fatherName;
		 */
		Student s = new Student(this); 
		return s;
	}

}
