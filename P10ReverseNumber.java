import java.util.Scanner;

class P10ReverseNumber{
	public static void main(String args[])
	{
		int num,rnum,reverse=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number=");
		num=sc.nextInt();
		while(num>0)
		{
			rnum=num%10;
			reverse=reverse*10+rnum; 
			num=num/10;
		}
		System.out.println("Reverse number is = "+reverse);	
	}
}