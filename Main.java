//(c) A+ Computer Science
//www.apluscompsci.com
//Name -Jonathan Hsing

import static java.lang.System.*;

public class Main
{
	public static void main( String args[] )
	{
		int[] r = {5, 12, 9, 6, 1, 4, 8, 6 };
		NumberAnalyzer test = new NumberAnalyzer( r );
		out.println(test);
		out.println("odd count = "+test.countOdds());
		out.println("even count = "+test.countEvens());
		out.println("perfect count = "+test.countPerfects()+"\n\n\n");

		//add more test cases			
    int[] r1 = {5, 12, 3, 7, 28, 496, 81, 65, 33, 11};
		NumberAnalyzer test1 = new NumberAnalyzer( r1 );
		out.println(test1);
		out.println("odd count = "+test1.countOdds());
		out.println("even count = "+test1.countEvens());
		out.println("perfect count = "+test1.countPerfects()+"\n\n\n");
	}
}