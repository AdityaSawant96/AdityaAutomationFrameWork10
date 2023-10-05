package conceptsOfString;

public class Example19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="My Name is an Aditya Sawant";
String []b=s1.split(" ");
System.out.println(b);
//int a=b.length();
// it is used for split sprint after space because space are given in argument
for(int i=0; i<=b.length-1; i++)
//for(int i=b.length-1; i>=0; i--)
{
	System.out.print(b[i]+" ");
}

	}

}
