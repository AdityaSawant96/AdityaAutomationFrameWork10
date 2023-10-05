package conceptsOfString;

public class Example20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="My Name is an Aditya Sawant";
		// it is used for Splitting String after character which are given in argument
		String []b=s1.split("a",5);
		for(int i=0;i<=b.length-1;i++)
		{
			System.out.println(b[i]);
		}
	}

}
