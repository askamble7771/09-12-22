import java.util.Scanner;

public class PigLatin{
	public static void main(String[] args){
		String inStr = "night";
		
		char out = inStr.charAt(0);
		
		String outstr = inStr.substring(2);
		
		outstr = outstr + out + "ay";
		
		System.out.println("Input: "+ inStr);
		System.out.println("Output: "+ outstr);
		
	}
}