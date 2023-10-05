package conceptsOfString;
// to reverse the String
public class Example10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1= "Aditya Sawant";
String s="";
int l=s1.length();

for(int i=l-1;i>=0;i--)
{
	char b=s1.charAt(i);
	s=s+b;
	
}

System.out.println(s);
	}

}