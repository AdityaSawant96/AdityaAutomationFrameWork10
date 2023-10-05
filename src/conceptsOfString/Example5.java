package conceptsOfString;

public class Example5 {

	public static void main(String[] args) {
	String s1="Aditya Sawant";
	// String s2="Aditya sawant"'
	String s3= new String("Aditya Sawant");
	boolean b=s1==s3;// here not compare object,only compare the value
	System.out.println(b);
	 
	boolean c=s1.equals(s3);// here compare the object
	System.out.println(c);

	}

}
