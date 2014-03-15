package insurance;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class InputData {
	public static ClientsDetailsList readFile( File inputFile ) throws IOException
	{
		ClientsDetailsList cdl=new ClientsDetailsList();
		BufferedReader br=new BufferedReader(new FileReader(inputFile));
		String line;
		while((line=br.readLine())!=null)
		{
			line=line.substring(0,line.length()-2);
			String bits[]=line.split("/");
			String clientID=bits[0];
			Name name=new Name(bits[1], bits[2],bits[3]);
			Address address=new Address(bits[4],bits[5],bits[6]);
			PolicyList pl=new PolicyList();
			for(int i=7;i<bits.length;i++)
			{
				Policy p=new Policy(bits[i]);
				pl.addPolicy(p);
			}
			ClientDetails cd=new ClientDetails(clientID,name,address,pl);
			cdl.addClient(cd);
		}
		return cdl;
	}
}
