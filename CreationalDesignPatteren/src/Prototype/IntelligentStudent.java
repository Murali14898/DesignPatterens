package Prototype;

public class IntelligentStudent extends Student implements StudentInterface{
	public double psp;
	
	public int rank;
	//method 3 version 2
	private IntelligentStudent(IntelligentStudent is) {
		super(is);
		this.psp = is.psp;
		this.rank = is.rank;
		
	}

	public IntelligentStudent() {
		
	}
	
	
	@Override
	public IntelligentStudent copy() {
		IntelligentStudent is = new IntelligentStudent(this);
		//method 3 version 1
		/*In this version there is no code re-use
		 * is.sid = this.sid; 
		 * is.name =this.name; 
		 * is.fatherName = this.fatherName;
		 * is.psp = this.psp; 
		 * is.rank = this.rank;
		 */
		
		return is;
		
	}


}
