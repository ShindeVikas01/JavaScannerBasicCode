import java.util.Scanner;

class P1Add2Num{
	public static void main(String args[])
	{
		int num1,num2,total=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Two Number");
		num1=sc.nextInt();
		num2=sc.nextInt();
		total=num1+num2;
		System.out.println("Addition= "+total);
	}
}