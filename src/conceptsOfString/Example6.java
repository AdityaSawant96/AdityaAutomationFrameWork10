package conceptsOfString;

public class Example6 {

	public static void main(String[] args) {
	String s1= "Aditya Sawant";
	String s2="ADITYA SAWANT";
	boolean b=s1.equals(s2);
	System.out.println(b);
	// here Case are not matter
	boolean c=s1.equalsIgnoreCase(s2);
	System.out.println(c);

	}

}
