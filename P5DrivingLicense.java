import java.util.Scanner;

class P5DrivingLicense{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Client Age=");
		int age=sc.nextInt();
		if( age>=18){
			System.out.println("Client is valid for driving");
		}else{
			System.out.println("Client is not valid for driving");
		}
	}
}