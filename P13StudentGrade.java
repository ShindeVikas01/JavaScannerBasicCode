import java.util.Scanner;

class P13StudentGrade{
	public static void main(String args[])
	{
		int sub1,sub2,sub3,sub4,sub5,total=0;
		double per;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 5 subjects mark=");
		sub1=sc.nextInt();
		sub2=sc.nextInt();
		sub3=sc.nextInt();
		sub4=sc.nextInt();
		sub5=sc.nextInt();
		
		total=sub1+sub2+sub3+sub4+sub5;
		per=total/5;
		
		System.out.println("\n Total Marks= "+total);
		System.out.println("\n Student Percentage= "+per+"%");
		
		if(per>=35 && per<55)
		{
			System.out.println("\n The student has a D grade.");
		}
		else if(per>=55 && per<65)
		{
			System.out.println("\n The student has a C grade.");
		}
		else if(per>=65 && per<75)
		{
			System.out.println("\n The student has a B grade.");
		}
		else if(per>=75 && per<85)
		{
			System.out.println("\n The student has a A grade.");
		}
		else if(per>=85 && per<=100)
		{
			System.out.println("\n The student has a A+ grade.");
		}
		else
		{
			System.out.println("\nThe student has failed");
		}
	}
}