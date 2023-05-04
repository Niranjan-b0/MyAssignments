package week3.day1;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {

		String string = "changeme";

		char[] arraystring = string.toCharArray();

		for	(int i=0; i<arraystring.length;	i++)	{

			if	(i%2 == 0)	{
				System.out.print(arraystring[i]);
			}else {
				System.out.print(Character.toUpperCase(arraystring[i]));
			}

		}

	}

}		
