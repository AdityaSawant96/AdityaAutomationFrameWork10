package logicalProgramOnString;

public class DuplicateElementsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s= "Aditya Sawant";
String abc= s.toLowerCase();
char ch[]= abc.toCharArray();
int length=ch.length;
System.out.println(length);
for(int i=0;i<ch.length;i++)
{
	for(int j=i+1;j<ch.length;j++)
	{
		if(ch[i]==ch[j])
		{
			System.out.println("character which repeat:" +ch[j]);
			break;
		}
	}
}
	}
}
