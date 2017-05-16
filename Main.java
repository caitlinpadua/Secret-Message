/**
 * Name: Raissa Caitlin Padua
 * Subject: Java Project 1A
 */


import java.util.*;
public class Main {

	public static void main(String[] args) {

		
		String plaintext;
		int number;
		Scanner input = new Scanner(System.in);
		
		System.out.println("****** Substitution Cipher ******");
		System.out.print("Enter a plain text: ");
		plaintext = input.nextLine();
		System.out.print("Enter shift value (from 1 to 26): ");
		number = Integer.parseInt(input.nextLine()); //converting int to string
		
		//displays the encoded message
		System.out.println("The plain text: " + plaintext);
		
		//creating a SubstitutionCipher
		SubstitutionCipher substitutioncipher = new SubstitutionCipher(number);
		
		String encodedtext = substitutioncipher.encodemsg(plaintext);
		String decodedtxt = substitutioncipher.decodemsg(encodedtext); //decoding
		
		//displays the encoded message on the console
		System.out.println("Encoded text: " + encodedtext);
		System.out.println("Decoded text: " + decodedtxt);
		System.out.println();
		
		System.out.println("****** Shuffle Cipher ******");
		System.out.print("Enter a plain text: ");
		plaintext = input.nextLine();
		System.out.print("Enter the shuffle value: ");
		number = Integer.parseInt(input.nextLine());
		
		//creating a ShuffleCipher
		ShuffleCipher shufflecipher = new ShuffleCipher(number);
		
		encodedtext = shufflecipher.encodemsg(plaintext);
		decodedtxt = shufflecipher.decodemsg(encodedtext);
		
		//displays the encoded message on the console
		System.out.println("Encoded text: " + encodedtext);
		System.out.println("Decoded text: " + decodedtxt);	
	}
}
