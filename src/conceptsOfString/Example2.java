package conceptsOfString;

public class Example2 {

	public static void main(String[] args) {
		String s="     Aditya Sawant     ";
		int q= s.length();
		System.out.println(q);
		// to avoid starting and ending spaces we have to used trim method
		String r=s.trim();
		System.out.println(r);
		// check the length of the trim String
		int t=r.length();
		System.out.println(t);

	}

}
