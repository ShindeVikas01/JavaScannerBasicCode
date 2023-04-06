import java.util.Scanner;

class P7PrintNumForloop{
	public static void main(String args[])
	{
		int num1,num2,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number two numbers=");
		num1=sc.nextInt();
		num2=sc.nextInt();
		System.out.println("");
		for(i=num1;i<=num2;i++)
		{
			System.out.println(i);
		}
	}
}