import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.List.*;
import java.util.StringTokenizer;



public class Model 
{
	//List<String><String> referees = new ArrayList<String><String>();
	//String[][] referees = new String[12][7]; 
	private List<List<String>> referees;
	Model()
	{
		referees = new ArrayList<List<String>>();
		readingInput();
		myPrint();
	}
	
	void readingInput()
	{
		try {
				File file = new File("RefereesIn.txt");
				FileReader fileReader = new FileReader(file);
				BufferedReader bufferedReader = new BufferedReader(fileReader);
				StringBuffer stringBuffer = new StringBuffer();
				String line;
				while ((line = bufferedReader.readLine()) != null)
				{
					StringTokenizer spaceTokenizer = new StringTokenizer(line);
					List<String> row = new ArrayList<String>();
					while (spaceTokenizer.hasMoreTokens())
					{
						row.add(spaceTokenizer.nextToken());
					}
					referees.add(row);
				}
				fileReader.close();
			} 
			catch (IOException e)
			{
				e.printStackTrace();
			}
	}
	
	public void myPrint()
	{
		System.out.println("\n*********************update*********************\n");
		System.out.format("%-15s%-15s%-15s%-15s%-20s%-15s%-15s\n", "Referee ID","First name", "Last name", "Qualification", "Number of matches", "Home area", "Areas");
		for(int i=0;i<referees.size();i++)
		{
			String[] x = referees.get(i).toArray(new String[referees.get(i).size()]);
			System.out.format("%-15s%-15s%-15s%-15s%-20s%-15s%-15s\n", x);
		}
	}
	
	
	public String[] refereesName()
	{
		String[] refN = new String[referees.size()];
		for(int i=0;i<referees.size();i++)
		{
			refN[i] = String.format("%s %s", referees.get(i).get(1), referees.get(i).get(2));
		}
		return refN;
	}

}
