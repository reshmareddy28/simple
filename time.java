import java.util.Scanner;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
		int num = in.nextInt(); 
		int hours = num/ 60;
		int minutes = num % 60;
		 System.out.print(hours+ " " + minutes);
	
    }    
 }
