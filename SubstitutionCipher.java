/**
 * Name: Raissa Caitlin Padua
 * Subject: Java Project 1A
 */


public class SubstitutionCipher implements MessageEncoder, MessageDecoder {

	private int shift;
	
	//constructor with one parameter called shift
	public SubstitutionCipher(int shiftkey)
	{
		shift = shiftkey;
	}
	
	public String encodemsg(String plaintext)
	{
		String encodedmsg = "";
		for (int i = 0; i< plaintext.length(); i++)
		{
			char ch = plaintext.charAt(i);
			encodedmsg += shift(ch, shift);
		}
		return encodedmsg;
	}
	
	//private method that shifts a single character
	private char shift(char ch, int shiftv)
	{
		char shiftchar = ch;
		
		//to check if the character is lowercase or uppercase respectively
		if(ch >= 'a' && ch <= 'z')
			shiftchar = (char) ('a' + (ch - 'a' + shiftv) % 26);	
		else if (ch >= 'A' && ch <= 'Z')
			shiftchar = (char) ('A' + (ch - 'A' + shiftv) % 26);
		return shiftchar;
	}
	
	
	public String decodemsg(String cipherText){
		String decodedmsg = "";
		
		for (int i = 0; i < cipherText.length(); i++){
			char ch = cipherText.charAt(i);
			decodedmsg += shift(ch, -shift);
		}
		return decodedmsg;
	}

}
