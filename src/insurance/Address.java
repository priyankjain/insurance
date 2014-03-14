package insurance;

public class Address implements Comparable<Address> {
	public String street;
	public String town;
	public String postcode;
	
	public Address(String street, String town, String postcode) {
		super();
		this.street = street;
		this.town = town;
		this.postcode = postcode;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	
	@Override
	public String toString() {
		return "Address [street=" + street + ", town=" + town + ", postcode="
				+ postcode + "]";
	}

	@Override
	public int compareTo(Address arg0) {
		String first=this.street+" "+this.town+" "+this.postcode;
		String second=arg0.getStreet()+" "+arg0.getTown()+" "+arg0.getPostcode();
		return first.compareTo(second);
	}

}
