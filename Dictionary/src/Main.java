import java.util.*;
import java.util.Scanner;

public class Main {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] badWords= {"kaist","KAIST","Wonsup","Nak","Bilgehan"};
		
		AhoCorTree ahc;
		String rawText;
		String checkedText;
		ahc = new AhoCorTree(badWords);
		
		Scanner scan = new Scanner(System.in);
		//Start listening
		System.out.println("Wellcome to the dictionary");
		while(true)
		{
		    rawText= scan.nextLine();
		    if (rawText!="EXIT()")
		    {
		    	checkedText=ahc.traverser(rawText);
		    	System.out.println(checkedText);
		    }
		    else
		    {
		    	scan.close();
		    	return;
		    }
		}
	}

}
