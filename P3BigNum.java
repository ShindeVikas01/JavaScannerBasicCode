import java.util.Scanner;

class P3BigNum{
	public static void main(String args[]){
		int num1,num2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two number");
		num1=sc.nextInt();
		num2=sc.nextInt();
		if(num1>num2){
			System.out.println("Num1 is big");
		}else if(num1==num2){
			System.out.println("Both numbers are equal");
		}else{
			System.out.println("Num2 is big");
		}
	}
}
