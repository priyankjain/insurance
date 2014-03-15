package insurance;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ClientsDetailsList {
	private Collection<ClientDetails> clientDetailsList=new ArrayList<ClientDetails>();
	public int numberOfClients()
	{
		return clientDetailsList.size();
	}
	public boolean addClient(ClientDetails a)
	{
		return clientDetailsList.add(a);
	}
	@Override
	public String toString() {
		return "ClientDetailsList [clientDetailsList=" + clientDetailsList
				+ "]";
	}
	/**
	* A method to determine whether or not a given person, identified by a
	* surname and a postcode is a client of the Insurance company.
	* If so, the client’s ID should be returned.
	* @param lastName the surname of the person to be searched for.
	* @param code
	the postcode of the address of the person to be searched for.
	* @return
	the Client ID if the person has at least one policy
	*
	with the company, null otherwise.
	*/
	public String findClient(String lastName, String code){
		for(Iterator<ClientDetails> iterator=clientDetailsList.iterator();iterator.hasNext();)
		{
			ClientDetails clientDetails=(ClientDetails)iterator.next();
			if(clientDetails.getName().getSurname().equals(lastName) && clientDetails.getAddress().getPostcode().equals(code))
			{
				return clientDetails.getID();
			}
		}
		return null;
	}
	/**
	* A method to get the client details corresponding to a given client ID.
	*
	* @param clientID
	the client ID whose details are required.
	*
	* @return
	the required ClientDetails if found, null otherwise.
	*/
	public ClientDetails getClientDetails(String givenID){
			for(Iterator<ClientDetails> iterator=clientDetailsList.iterator();iterator.hasNext();)
			{
				ClientDetails clientDetails=iterator.next();
				if(clientDetails.getID()==givenID)
					return clientDetails;
			}
			return null;
		}
	
	/**
	* A method to determine another client who has the same address as
	* the client whose details are given.
	*
	* @param cDetails
	the client details whose address is to be
	*
	searched for.
	* @return
	the ClientDetails of a client with the same
	*
	address if there is one, null otherwise.
	*/
	public ClientDetails sameAddressCheck(ClientDetails cDetails){
		for(Iterator<ClientDetails> iterator=clientDetailsList.iterator();iterator.hasNext();)
		{
			ClientDetails clientDetails=(ClientDetails)iterator.next();
			if(clientDetails.getAddress().compareTo(cDetails.getAddress())==0)
			{
				return clientDetails;
			}
		}
		return null;
	}

}
