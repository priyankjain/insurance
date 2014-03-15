package insurance;

public class ClientDetails {
	private String ID;
	private Name name;
	private Address address;
	private PolicyList policyList;
	@Override
	public String toString() {
		return "Client ID: " + ID + "\nClient Name: " + name.toString() + "\nClient Address: "
				+ address.toString() + "\nPolicyList: \n" + policyList.toString();
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public Name getName() {
		return name;
	}
	public void setName(Name name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public PolicyList getPolicyList() {
		return policyList;
	}
	public void setPolicyList(PolicyList policyList) {
		this.policyList = policyList;
	}
	public ClientDetails(String iD, Name name, Address address,
			PolicyList policyList) {
		super();
		ID = iD;
		this.name = name;
		this.address = address;
		this.policyList = policyList;
	}
	
	
}
