package conceptsOfString;

public class Example22 {

	public static void main(String[] args) {
		//ParseInt Method (Convert String into Integer
		
				String S1="423489";
				String S2="423489";
				System.out.println(S1+S2);
				
				int S3 = Integer.parseInt(S1);
				int S4 = Integer.parseInt(S2);
				System.out.println(S3+S4);//846978
				
				//ValueOf Method (Integer to String)
				int x = 45;
				int y = 75;
				System.out.println(x+y);
				
				String Z = String.valueOf(x);
				String W = String.valueOf(y);
				System.out.println(Z+W);
				}
			}
