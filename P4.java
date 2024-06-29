import java.util.Scanner;
public class P4 
{
	public static void main(String[]args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the string");
		String q =sc.next();
		System.out.println("enter the index you want to replace at");
		int i=sc.nextInt();
		System.out.println("enter the charecter you want to insert");
		char c =sc.next().charAt(0);
		System.out.println(q.substring(0,i-1)+c+q.substring(i));
		
		//substring(0,2)-prints from 0 to 1
		//substring(1)-prints after index 1
		
	}

}
