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
	String[][] referees = new String[12][7]; 
	public static void main(String[] arg)
	{
		readingInput();
	} 
	static void readingInput()
	{
		try {
			File file = new File("RefereesIn.txt");
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			StringBuffer stringBuffer = new StringBuffer();
			String line;
			while ((line = bufferedReader.readLine()) != null)
			{
				StringTokenizer defaultTokenizer = new StringTokenizer(line);
				 while (defaultTokenizer.hasMoreTokens())
				 {
					 System.out.println(defaultTokenizer.nextToken());
				 }
				//stringBuffer.append(line);
				//stringBuffer.append("\n");
			}
			fileReader.close();
			//System.out.println("Contents of file:");
			//System.out.println(stringBuffer.toString());
		} catch (IOException e)
		{
			e.printStackTrace();
		}
	}

}
