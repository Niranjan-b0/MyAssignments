package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {

		int n = 8, sum, firstTerm = 0, secondTerm = 1;

		for	(int i=1; i<n; i++)	{

			sum = firstTerm + secondTerm;

			firstTerm = secondTerm;

			secondTerm = sum;

			System.out.println(sum);

		}

	}

}
