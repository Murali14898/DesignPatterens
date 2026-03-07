package Builder;

public class Main {
	public static void main(String[] args) {
		Voter v=null;
		/*Version 1 : the developer should aware about the VoterHelper class inorder to create object for Voter
		
		try {
			v = new VoterHelper().setVoterName("Murali Samal").setAge(28).setState("Odisha").setPostalCode("755012").build();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		*/
		/* 
		 * Version 2 : the developer should only aware about the Voter class inorder to create object for Voter 
		 */
		try {
			v = Voter.getInstance().setVoterName("Murali Samal")
					               .setAge(28).setState("Odisha")
					               .setPostalCode("7550132").build();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		if (v != null)
			v.objectCreationStatus();
	}
}
