package insurance;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

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
		String ret="";
		for(Iterator<Policy> iterator=this.policyList.iterator();iterator.hasNext();)
		{
			Policy p = (Policy)iterator.next();
			ret+=p.toString();
			ret+="\n-----------------------------\n";
		}
		return ret;
	}
	public void checkPolicy(Policy b)throws IllegalPolicyCodeException
	{
		for(Iterator<Policy> iterator=policyList.iterator();iterator.hasNext();)
		{
			Policy a=(Policy)iterator.next();
			if(a.getPolicyType().equals(b.getPolicyType()))
			{
				policyList.remove(a);
				return;
			}
		}
		return;
	}
}
