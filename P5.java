import java.util.Scanner;
public class P5 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the string");
		String n=sc.next();
		String n1=sc.next();
		System.out.println("length of "+n+" is "+n.length());
		System.out.println("enter the index");
		int i=sc.nextInt();
		System.out.println("the letter is "+ n.charAt(i));
		System.out.println("substring is "+ n.substring(i));
		System.out.println("concatenated word is "+n.concat(n1));
		char c=sc.next().charAt(0);
		System.out.println("last index of string is"+" "+n.lastIndexOf(c));
		if(n1.equalsIgnoreCase(n))
			System.out.println("strings are equal");
		System.out.println("lower case is "+" "+n.toLowerCase());
		System.out.println("upper case is "+" "+n.toUpperCase());
	}
}
