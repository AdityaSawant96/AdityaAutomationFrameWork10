package conceptsOfString;
// seprate character here we know the exact count of index of character that's why used for loop
public class Example8 {

	public static void main(String[] args) {
		String s1="Aditya Sawant";
		char a=s1.charAt(0);
		System.out.println(a);
		int l=s1.length();
		for( int i=1;i<=l-1; i++)
		{
			char b=s1.charAt(i);
			System.out.println(b);
		}

	}

}
