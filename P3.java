import java.util.Scanner;
public class P3 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the string");
		String s= sc.next();
		String ns="";
		for(int i =s.length()-1;i>=0;i--)
		{
			char ch=s.charAt(i);
			ns=ns+ch;
		}
		if(ns.equals(s))
		{
			System.out.println(ns+ " is palindrome");
		}
		else
		{
			System.out.println(ns+" is not palindrome");
		}
	}
}
