import java.util.Scanner;

class P6SwitchcaseMenucard{
	public static void main(String args[])
	{
		int choise,qty=0,bill=0;
		double disval=0.0,netval=0.0;
		Scanner sc=new Scanner(System.in);
		System.out.println("****MENU****");
		System.out.println("\n 1. Tea\t\t\t15/-Rs.");
		System.out.println("\n 2. Coffee\t\t20/-Rs.");
		System.out.println("\n 3. Cold Coffee\t\t30/-Rs.");
		System.out.println("\n 4. Exit");
		System.out.println("Select Menu Using Number=");
		choise=sc.nextInt();
		if(choise>=1 && choise<=3)
		{	
			System.out.println("Enter Number Of Quantity=");
			qty=sc.nextInt();
		}
		switch(choise)
		{
			case 1: bill= qty*15;
					System.out.println("\n Enjoy your Tea and bill amount is %d/-Rs."+bill);
					break;
			
			case 2: bill= qty*20;
					System.out.println("\n Enjoy your Coffee and bill amount is %d/-Rs."+bill);
					break;
					
			case 3: bill= qty*30;
					System.out.println("\n Enjoy your Cold Coffee and bill amount is %d/-Rs."+bill);
					break;
					
			case 4: System.out.println("\n BYE BYE...............");
					System.out.println("\n Thank you Visit Again");
					break;
				
			default : System.out.println("\n Invalid Selection");
					  break;
		}
	
	// Calculate disscount on bill amount
		if(bill !=0)
		{
				if(bill>=200)
				{
					disval=bill*0.1;
					netval=bill-disval;
					System.out.println("\n\n Hello, Your are eligible for disscount");
					System.out.println("\n Dissount="+disval);
					System.out.println("\n Pay Bill="+netval);
					System.out.println("\n BYE BYE...............");
					System.out.println("\n Thank you Visit Again");	
				} 
				else
				{
					System.out.println("\n Sorry You are not eligible for disscount");
					System.out.println("\n Pay Bill="+bill);
					System.out.println("\n BYE BYE...............");
					System.out.println("\n Thank you Visit Again");	
				}
		}
	}
}