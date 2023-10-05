package conceptsOfString;

public class Example4 {

	public static void main(String[] args) {
		// Here we used equal method for Comparision the length of two string
String s1= "Aditya Sawant";
String s2= "Aditya Pandurang Sawant";
 // we can't used this approach
boolean a= s1==s2;
System.out.println(a);
// we always follow this approach
boolean b=s1.equals(s2);
System.out.println(b);

	}

}
