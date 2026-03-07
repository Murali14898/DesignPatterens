package Builder;

public class Voter {
	private String voterName;
	private int age;
	private String state;
	private String postalCode;
	
	public Voter(VoterHelper vh) throws VoterNotEligibleForVoting, StateMismatch, InvalidPostalCode {
		this.voterName = vh.getVoterName();
		if(vh.getAge()<18) {
			throw new VoterNotEligibleForVoting("Age is not greater than "+18);
		}
		if(vh.getState() != "Odisha") {
			throw new StateMismatch("Voter Should be from Odisha");
		}
		if(vh.getPostalCode().length() != 6) {
			throw new InvalidPostalCode("Postalcode is not for Odisha");
		}
	}
	public void objectCreationStatus() {
		System.out.println("Objcet created successfully : "+this.hashCode());
	}
	public static VoterHelper getInstance() {
		return new VoterHelper();
	}
	static class VoterHelper {
		private String voterName;
		private int age;
		private String state;
		private String postalCode;
		public String getVoterName() {
			return voterName;
		}
		public VoterHelper setVoterName(String voterName) {
			this.voterName = voterName;
			return this;
		}
		public int getAge() {
			return age;
		}
		public VoterHelper setAge(int age) {
			this.age = age;
			return this;
		}
		public String getState() {
			return state;
		}
		public VoterHelper setState(String state) {
			this.state = state;
			return this;
		}
		public String getPostalCode() {
			return postalCode;
		}
		public VoterHelper setPostalCode(String postalCode) {
			this.postalCode = postalCode;
			return this;
		}
		public Voter build() throws Exception{
			return new Voter(this);
		}
	}

}
