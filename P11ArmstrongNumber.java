import java.util.Scanner;

class P11ArmstrongNumber{
	public static void main(String args[])
	{
		int number,mod,sum=0,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number=");
		number=sc.nextInt();
		temp=number;    

		//Calculation for finding armstron number
		while(number>0)    
		{    
			mod=number%10;    
			sum=sum+(mod*mod*mod);    
			number=number/10;    
		}    
		if(temp==sum)   
		{
			System.out.println("Armstrong  number "); 
		} 
		else 
		{
			System.out.println("Not Armstrong number");  
		}   
	}
}