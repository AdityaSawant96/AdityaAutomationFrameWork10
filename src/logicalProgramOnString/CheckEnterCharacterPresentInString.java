package logicalProgramOnString;

import java.util.Scanner;

public class CheckEnterCharacterPresentInString {

	public static void main(String[] args) {
		//Get Input String
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter String :");
		String string=s.nextLine();
		
		//get input Character
		Scanner s1= new Scanner(System.in);
		System.out.println("Enter Character :");
		char ch=s1.next().charAt(0);
		
		int count=0;
		for(int i=0;i<string.length();i++)
		{
		char ch1=string.charAt(i);
		if(ch1==ch)
		{
			count++;
		}
		}
		if(count>0)
		{
			System.out.println("the following character:"+ch+"=:which appears in string");
		}
		else
		{
			System.out.println("the following character:"+ch+"=:which does not appears in string");
		}

	}

}

