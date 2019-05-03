import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Enum 
{
		
	public static void main(String[] args) throws IOException
	{
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter base of original number system: ");
		String sCur = in.readLine();
		int a = Integer.parseInt(sCur);
		
		if(a == 2)
		{
			
			System.out.println("Enter Your count: ");
			String sNew = in.readLine();
			int x = Integer.parseInt(sNew,a);
			
			System.out.println("Enter base of target number system: " );
			String sNu = in.readLine();
			int b = Integer.parseInt(sNu);
			
			System.out.println("Your count: " + Integer.toString(x , b));
		}
		
		if(a >= 3)
		{
			
			if(a == 16) 
			{
				System.out.println("Enter your count: ");
				String sNum = in.readLine();
				int x = Integer.parseInt(sNum, a);
				
				System.out.println("Enter base of target number system: " );
				String sNu = in.readLine();
				int b = Integer.parseInt(sNu);
				
				System.out.println("Your count: " + Integer.toString(x , b));
			}
			
			if (a == 8)
			{
				System.out.println("Enter your count: ");
				String sNum = in.readLine();
				int x = Integer.parseInt(sNum, a);
				
				System.out.println("Enter base of target number system: " );
				String sNu = in.readLine();
				int b = Integer.parseInt(sNu);
				
				System.out.println("Your count: " + Integer.toString(x , b));
			}
			
			else
			{
				
				System.out.println("Enter your count: ");
				String sNum = in.readLine();
				int x = Integer.parseInt(sNum,a);
				
				System.out.println("Enter base of target number system: " );
				String sNu = in.readLine();
				int b = Integer.parseInt(sNu);
				
				System.out.println("Your count: " + Integer.toString(x , b));
			}
		}
	}
	
}
