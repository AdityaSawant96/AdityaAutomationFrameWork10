package conceptsOfString;

public class Example15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="My Name is an Aditya Sawant";
		//it used for comparing your string with end character in string or end word
		boolean a= s1.endsWith("t");
		System.out.println(a);
		// to calculate index of particular chatracter
		int b= s1.indexOf("i");
		System.out.println(b);
		int c=s1.indexOf('n', 4);
		// it shows character N index and which are present in after 2 index
		System.out.println(c);
		// it shows Character a index which are present in "an" word and present in after 10 index
		int d= s1.indexOf("an", 10);
		System.out.println(d);
		String s2="My Name Sawant is an Aditya Sawant";
		// I want index of a first "Sawant" of character 's' and these are present after 7 index
		int e=s2.indexOf("Sawant", 7);
		System.out.println(e);
		// I want index of a Second"Sawant" of character 's' and these are present after 27 index
		int f=s2.indexOf("Sawant",27 );
		System.out.println(f);


	}

}
