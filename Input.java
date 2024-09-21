//You need to complete
import java.util.Scanner;

public class Input 
{
	private Scanner scanner;

	//initializes scanner object
	public Input() 
	{
		scanner = new Scanner(System.in);
	}

	//This method should:
		// Read only the first char from the input
		// Loop to make sure to get only a valid input character
		// return the character
	public char readInput() 
	{
		String input = scanner.next();
		for (int i = 0; i < input.length(); i++)
		{
			if (validInput(input.charAt(i)))
			{
				return input.charAt(i);
			}
		}
		return '!';
	}

	//return boolean if not valid
	private boolean validInput(char c) 
	{
		char[] checks = {'w','a','s','d','q'};
		for (int i = 0; i < checks.length; i++)
		{
			if (checks[i] == c)
			{
				return true;
			}
		}
		return false;

	}
}
