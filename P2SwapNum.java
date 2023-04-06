import java.util.Scanner;

class P2SwapNum{
	public static void main(String args[])
	{
		int num1,num2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two Number");
		num1=sc.nextInt();
		num2=sc.nextInt();
		num2=num1+num2;
		num1=num2-num1;
		num2=num2-num1;
		System.out.println("Num1="+num1+" Num2="+num2);
	}
}
