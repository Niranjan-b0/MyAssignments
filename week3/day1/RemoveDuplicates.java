package week3.day1;

public class RemoveDuplicates {

	public static void main(String[] args) {

		String text = "We learn java basics as part of java sessions in java week1";

		String[] arraytext = text.split(" ");

		for	(int i=0; i<=arraytext.length-1; i++)	{
			
			int count = 1;

			for	(int j=i+1; j<=arraytext.length-1; j++)	{

				if (arraytext[i].equals(arraytext[j]))	{
					count+=count;
					arraytext[j]="";
				}
				
			}

		}

		System.out.println("without duplicate words : ");
		for	(String a : arraytext)	{
			System.out.println(a+" ");
		}

	}

}			
