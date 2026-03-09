package Prototype;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * method 1 : Simply create object and assign the value of target object
		 * Student s = new Student();
		 * s.id = 101;
		 * s.name = "Murali"
		 * Student s1 = new Student();
		 * s1.id = s.id;
		 * s1.name = s.name;
		 * 
		 * In the above way code struture will break if i will create multgiple copy
		 * 
		 * Method 2 : By using a method copy method in main class or constuctor in student class 
		 * which will accept Studnet object as parameter
		 * Student(Student s){
		 *     Student s1 = new Student(s);
		 *     s1.id = s.id;
		 *     s1.name = s.name;
		 * }
		 * Student copy(Student s){
		 *     Student s1 = new Student(s);
		 *     s1.id = s.id;
		 *     s1.name = s.name;
		 * }
		 * 
		 * In both method there will be a problem if i pass a child class of Student that is Intelligent student
		 * The copied object will be of type IntelligentStudent.
		 * 
		 * Method 3 : The copy method is inside the student and intelligentStudent class so that at runtime the object will
		 * call its own copy() method
		 */
		Student firstStudentObject = new Student();
		firstStudentObject.sid = 101;
		firstStudentObject.name = "Murali";
		firstStudentObject.fatherName = "Pradeep";
		
		Student s1 = firstStudentObject.copy();
		System.out.println(firstStudentObject.hashCode() + "  "+s1.hashCode());
		
		IntelligentStudent firstIntelligentStudentObject = new IntelligentStudent();
		firstIntelligentStudentObject.sid = 102;
		firstIntelligentStudentObject.name = "Mohan";
		firstIntelligentStudentObject.fatherName = "Samal";
		firstIntelligentStudentObject.psp = 88;
		firstIntelligentStudentObject.rank = 2;
		
		IntelligentStudent is1 = firstIntelligentStudentObject.copy();
		System.out.println(firstIntelligentStudentObject.hashCode() + "  "+is1.hashCode());

	}

}
