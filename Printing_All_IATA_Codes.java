package airport_codes_IATA;

public class Printing_All_IATA_Codes {

	public static void main(String[] args) {
		String[] TripleLetter = new String[17600];
		int index = 0;
		//setting up an alphabet array (an array will all the letters of the alphabet
		char[] alpha = new char[26];
		for(int i = 0; i<26; i++)
		{
			//using ASCII codes (uppercase letters start at 65
			alpha[i] = (char)(i+65);
		}
		
		for(int one = 0; one<26;one++)//first letter of code
		{
			for(int two = 0; two<26; two++)//second letter of code
			{
				for(int three = 0; three <26; three++)//third letter of code
				{
					index++;
					String current = "" + alpha[one] + alpha[two] + alpha[three];
					TripleLetter[index] = current;
				}
				
			}
				
		}
	}

}
