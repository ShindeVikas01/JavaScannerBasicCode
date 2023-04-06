import java.util.Scanner;

class P8Factorial{
	public static void main(String args[])
	{
		int i,num,fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number find factorial=");
		num=sc.nextInt();
		for(i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of "+num+" is "+fact);
	}
}