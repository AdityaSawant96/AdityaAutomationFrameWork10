package logicalProgramOnString;

public class Example2 {
//Java program to from a new word by extracting the first letter of each word in 
	//the entered sentence
	public static void main(String[] args) {
	String s="Indian Institute Of Technology";
		
	String sentence =s.toLowerCase();
	String[]word=sentence.split(" ");
	int l=word.length;
	System.out.println(l);
	String value="";
	String Combineword="";
	for(int i=0; i<=word.length-1; i++)
	{
		value=word[i];
		char ch=value.charAt(0);
		Combineword=Combineword+ch;
	}
		System.out.println(Combineword)	;

	}

}
