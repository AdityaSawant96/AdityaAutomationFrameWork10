package conceptsOfString;

public class Example12 {

	public static void main(String[] args) {
		// Equals and Equals case show output in boolean form
String s1="Aditya Sawant";
String s2="aditya sawant";
boolean b=s1.equals(s2);
System.out.println(b);
boolean c=s1.equalsIgnoreCase(s2);
System.out.println(c);
/*Compare to and Compare Egnore case show output in integer 
	and this concepts are on the basis of ascill value*/
int d=s1.compareTo(s2);//s1<s2=negative,because in lowercase ascill value is greater
System.out.println(d);
int e=s1.compareToIgnoreCase(s2);/*s1==s2=0, here case are not consider
therefore show zero value*/
System.out.println(e);
	}
}
