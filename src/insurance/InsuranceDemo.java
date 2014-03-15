package insurance;

import java.io.File;
import java.io.IOException;
import javax.swing.*;

public class InsuranceDemo {
	public static void main(String args[])throws IOException, IllegalPolicyCodeException
	{
		File file=new File("data.txt");
		ClientsDetailsList cdl=InputData.readFile(file);
		System.out.println(cdl.numberOfClients()+" Client Details Read Successfully");
		System.out.println(cdl.toString());
		enterNewPolicy(cdl);
	}
	public static void enterNewPolicy(ClientsDetailsList cdl)throws IOException, IllegalPolicyCodeException
	{
		String option=JOptionPane.showInputDialog("Existing Client (Y or N)");
		ClientDetails cd=null;
		if(option.equals("Y") || option.equals("y"))
		{
			String method=JOptionPane.showInputDialog("Identify client by\n1) Last Name and Post code\n2)Client ID");
			if(method.equals("1"))
			{
				String name=JOptionPane.showInputDialog("Enter last name of client");
				String postcode=JOptionPane.showInputDialog("Enter postcode of client");
				String client_id=cdl.findClient(name,postcode);
				cd=cdl.getClientDetails(client_id);
			}
			else if(method.equals("2"))
			{
				String client_id=JOptionPane.showInputDialog("Enter Client ID");
				cd=cdl.getClientDetails(client_id);
			}
			if(cd==null)
			{
				JOptionPane.showMessageDialog(null,"No such client found");
			}
			else
			{
				String policy_no=JOptionPane.showInputDialog("Enter policy number");
				Policy p=new Policy(policy_no);
				PolicyList pl=cd.getPolicyList();
				pl.checkPolicy(p);
				pl.addPolicy(p);
			}
		}
		else if(option.equals("N") || option.equals("n"))
		{
			String client_id=JOptionPane.showInputDialog("Enter client ID");
			String title=JOptionPane.showInputDialog("Enter title");
			String initials=JOptionPane.showInputDialog("Enter initials");
			String surname=JOptionPane.showInputDialog("Enter surname");
			String street=JOptionPane.showInputDialog("Enter street address");
			String town=JOptionPane.showInputDialog("Enter town/city");
			String postcode=JOptionPane.showInputDialog("Enter postcode");
			String policy_no=JOptionPane.showInputDialog("Enter policy number");
			Name name=new Name(title, initials, surname);
			Address address=new Address(street, town, postcode);
			Policy p=new Policy(policy_no);
			PolicyList pl=new PolicyList();
			pl.addPolicy(p);
			cd=new ClientDetails(client_id, name, address, pl);
			cdl.addClient(cd);
		}
		System.out.println(cdl.toString());
	}
}
