import java.util.Scanner;

class P4EvenOdd{
		public static void main(String args[]){
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		num=sc.nextInt();
		if(num%2==0){
			System.out.println("Number is even number");
		}else{
			System.out.println("Number is odd number");
		}
	}
}