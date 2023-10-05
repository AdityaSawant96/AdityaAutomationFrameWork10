package conceptsOfString;

public class Example13 {

	public static void main(String[] args) {
		// It is used for join two string
String s1="Aditya Sawant";
String s2="Akshay Sawant";
System.out.println(s1+s2);
System.out.println(s1.concat(s2));
String s3="My Name is Sawant";
// it used for showing these content are present in a string are not
boolean a= s3.contains("asdfg");
System.out.println(a);
// it is used for checking equality of two string
boolean b=s3.contentEquals("My Name is Sawant");
System.out.println(b);
	}

}
