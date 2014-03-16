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
		String ret="";
		try
		{
		ret+= "Policy Number: " + policy_no +"\nPolicy Year: "+this.getYearOfIssue()+"\nPolicy Type: "+this.getPolicyType();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			return ret;
		}
	}
	final static String policy_type[]={"HOME","HOME_CONTENTS","CAR","LIFE"};
	public String getPolicyType() throws IllegalPolicyCodeException
	{
		String c="";
		c+=this.policy_no.charAt(4);
		int a=Integer.parseInt(c);
		if(a<4 && a>-1)
		{
			return policy_type[a];
		}
		else
			throw new IllegalPolicyCodeException("Illegal Policy Code Detected");
	}
	
	public int getYearOfIssue(){
		return Integer.parseInt(this.policy_no.substring(0,4));
	}
}
