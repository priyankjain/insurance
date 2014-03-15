package insurance;

import java.util.ArrayList;
import java.util.Collection;

public class PolicyList {
	public Collection<Policy> policyList=new ArrayList<Policy>();
	public int numberOfPolicies()
	{
		return policyList.size();
	}
	public boolean addPolicy(Policy a)
	{
		return policyList.add(a);
	}
	@Override
	public String toString() {
		return "PolicyList [policyList=" + policyList + "]";
	}
}
