import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/*Advent of Code Day1 fully working part 1 and 2
By Daniel McAdam
Written in Java
Needs refactoring eventually :)
*/
public class Program {

	 
	public static void main(String[] args) {


		
		Path copyPath = Paths.get("./data/input.txt");
		
		try {
			InputStream is = Files.newInputStream(copyPath);
			BufferedReader reader = new BufferedReader(new InputStreamReader(is));
			
			String line = "";
			int mass = 0;
			int requiredFuel = 0;
			int totalRequiredFuel = 0;
			
				System.out.println("moduleooo " + moduleMass(1969,0));
			
			while((line = reader.readLine()) != null)
			{
				mass = Integer.parseInt(line) ;
				System.out.println(line);
				requiredFuel = Math.floorDiv(mass, 3) - 2;
				
				System.out.println("modMass " + moduleMass(mass,0));
				totalRequiredFuel += moduleMass(mass,0) - mass;
			}
			
			System.out.println(totalRequiredFuel);
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}

	}
	
	public static int moduleMass(int curMass, int totalMass)
	{
		if((Math.floorDiv(curMass, 3) - 2) <= 0)
		{
			System.out.println("testing");
			System.out.println("final curpass " + curMass);
			return totalMass + curMass;
			
		}
		else
		{
			System.out.println("total mass is: " + totalMass);
			System.out.println("current mass is: " + curMass);
			return moduleMass((Math.floorDiv(curMass, 3) - 2), totalMass += curMass);
		}
	}

}
