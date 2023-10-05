package logicalProgramOnString;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str1="MAmAm";
String str =str1.toLowerCase();
String rev="";
for(int i=0;i<str.length(); i++ )
{
	char ch =str.charAt(i);
	rev= ch+rev;
}
System.out.println(rev);
if(str.equals(rev))
{
	System.out.println("Palindrome");

}
else
{
	System.out.println("non Palindrome");

}
	}

}
