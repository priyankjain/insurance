package insurance;

public class Policy {
	private String policy_no;

	public Policy(String policy_no) {
		super();
		this.policy_no = policy_no;
	}

	public String getPolicy_no() {
		return policy_no;
	}

	public void setPolicy_no(String policy_no) {
		this.policy_no = policy_no;
	}


	@Override
	public String toString() {
		return "Policy [policy_no=" + policy_no + "]";
	}
	final static String policy_type[]={"HOME","HOME_CONTENTS","CAR","LIFE"};
	public String getPolicyType() throws IllegalPolicyCodeException
	{
		char c=this.policy_no.charAt(4);
		if(c<4 && c>-1)
		{
			return policy_type[c];
		}
		else
			throw new IllegalPolicyCodeException("Illegal Policy Code Detected");
	}
	
	public int getYearOfIssue(){
		return Integer.parseInt(this.policy_no.substring(0, 3));
	}
}
