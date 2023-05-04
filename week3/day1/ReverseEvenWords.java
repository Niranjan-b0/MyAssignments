package week3.day1;

public class ReverseEvenWords {

	public static void main(String[] args) {
		
		String test = "I am a software tester";
		
		String[] split = test.split("");
		
		System.out.println("Before Changes : "+test);
		System.out.print("After Changes : ");
		for	(int i=0; i<split.length; i++)	{
			
			if (i%2 != 0)	{
				
				char[] chararray = split[i].toCharArray();
				
				for	(int j=chararray.length-1;	j>=0; j--)	{
					System.out.print(chararray[j]);
				}
				
				
			}	else {
				System.out.print(""+split[i]+"");
			}
			
		}
		
	}

}
