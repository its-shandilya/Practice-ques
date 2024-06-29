import java.util.Scanner;
public class P1 
{
	public static void main (String[]args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the string");
		String n= sc.next();
		String ns="";
		char ch;
		for(int i=n.length()-1;i>=0;i--)
		{
			 ch=n.charAt(i);
			ns=ns+ch;
		}
		System.out.println(ns);
	}

}
