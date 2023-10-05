class Axoj{


public static void main(String[]args)
{
String str ="Indian  InStitute of Tech";

String abc= str.toLowerCase();
String [] word = abc.split(" ");
int l = word.length;
System.out.println(l);
String value = "";
for(int i=0;i<=word.length; i++)
{
value=word[i];
char ch= value.charAt(0);
if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
{
System.out.println("Vowels  are=" +value);
}
else
{
System.out.println("Consonant are=" +value);
}
}
}
}
