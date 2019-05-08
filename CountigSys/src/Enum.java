import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Enum 
{
		
	public static void main(String[] args) throws IOException
	{
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter base of original number system(a): ");
		String sCur = in.readLine();
		int a = Integer.parseInt(sCur);
		
		System.out.println("Enter Your count(x): ");
		String sNew = in.readLine();
		int x = Integer.parseInt(sNew,a);
		
		System.out.println("Enter base of target number system(b): " );
		String sNu = in.readLine();
		int b = Integer.parseInt(sNu);
		
		System.out.println("Your count(x): " + Integer.toString(x , b)+ "  " + "on the bases: " + b);
		
	}
	
}
