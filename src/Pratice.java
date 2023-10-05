
public class Pratice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="11234788";
char [] ch= s.toCharArray();
for(int i=0; i<ch.length-1; i++)
{
	if((ch[i]==ch[i+1]))
	{
		System.out.println(ch[i]);
	}
		
}
	}

}
