package conceptsOfString;

public class Example17 {

	public static void main(String[] args) {
		
		String s1="My Name is an Aditya Sawant";
		//  it Searching character from last and  counting index from start of a string
		int a=s1.lastIndexOf('a');
		System.out.println(a);
		String b=s1.repeat(2);
		// With the help of these method we can repeat your string
		// we are put 2 value in argument bracket means it is repeat twice time
		System.out.println(b);
		String c=s1.replace('a', 'z');
		// with the help of this we can replace your character
		System.out.println(c);
		String d=s1.replace("Name", "Same");
		// with the help of this method we can replace your word in a string
		System.out.println(d);
		String e=s1.replaceAll(s1, "Aditya Sawant");
		// with the help of this method we can replace your string
		System.out.println(e);


	}

}
