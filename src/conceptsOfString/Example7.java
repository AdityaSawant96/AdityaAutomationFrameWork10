package conceptsOfString;

public class Example7 {
// the concepts of blank and empty
	public static void main(String[] args) {
		String s1="      ";// it is blank
		boolean a=s1.isBlank();
		boolean b=s1.isEmpty();
		System.out.println(a);
		System.out.println(b);
String s2="";// it is empty as well as blank
boolean c=s2.isBlank();
boolean d=s2.isEmpty();
System.out.println(c);
System.out.println(d);
	}

}
