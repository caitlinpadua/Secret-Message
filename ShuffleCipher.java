/**
 * Name: Raissa Caitlin Padua
 * Subject: Java Project 1A
 */


public class ShuffleCipher implements MessageDecoder, MessageEncoder{

	private int n;
	
	public ShuffleCipher(int n){
		this.n = n;
	}
	
	//shuffle the message n times
	public String encodemsg(String plaintext){
		String encodetxt = plaintext;
		for (int i = 0; i < n; i++)
			encodetxt = shuffle(encodetxt);
		return encodetxt;
	}
	
	//split the message in half then shuffle it to form a new message
	private String shuffle(String text){
		int half;
		
		if(text.length() % 2 == 0)
			half = text.length() / 2;
		else
			half = (text.length() + 1) / 2;
		
		//first half of the text
		String firsthalf = text.substring(0, half);
		//second half of the text
		String secondhalf = text.substring(half);
		
		String shuffled = "";
		
		for(int i = 0, j = 0; i < firsthalf.length(); i++, j++)
			{
				shuffled += firsthalf.charAt(i);
				if( j < secondhalf.length())
					shuffled += secondhalf.charAt(i); 
			}
		return shuffled;
	}
	
	public String decodemsg(String cipherText){
		String decodedmsg = cipherText;
		String temp = "";
		
		for (int shuffle = 0; shuffle < n; shuffle++){
			for(int i = 0; i < decodedmsg.length(); i++)
			{
				if (i%2 == 0)
					temp += decodedmsg.charAt(i);
			}
			
		for (int i = 0; i < decodedmsg.length(); i++)
		{
			if (i%2 == 1)
				temp += decodedmsg.charAt(i);
		}
			decodedmsg = temp;
			temp = "";
		}
		return decodedmsg;
	}


	
}
