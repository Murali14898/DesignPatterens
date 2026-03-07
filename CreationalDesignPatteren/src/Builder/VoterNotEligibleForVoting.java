package Builder;

public class VoterNotEligibleForVoting extends Exception {
	
	public VoterNotEligibleForVoting() {
		super();
	}
	
	public VoterNotEligibleForVoting(String msg) {
		super(msg);
	}
}
