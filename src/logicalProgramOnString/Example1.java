package logicalProgramOnString;

public class Example1 {
//Java program to enter a sentence and print the words which starting with a 
//	vowel
	public static void main(String[] args) {
		String s="My Name is Aditya Sawant";
		String sentence=s.toLowerCase();
		String []word=sentence.split(" ");
		int l= word.length;
		/*for(int i=0;i<=l-1; i++)
	{
		System.out.println(word [i]);	}

	System.out.println(l);*/
		String value="";
		for(int i=0;i<=word.length-1; i++)
		{
			value=word[i];
			char ch=value.charAt(0);
			if( ch=='a'||ch=='e' || ch=='i'||ch=='o'|| ch=='u')
			{
				System.out.println("Words with vowel="+value);
			}
			else
			{
				System.out.println("Words with Consonant="+value);
			}
		}
		

	}

}
