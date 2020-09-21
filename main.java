import java.util.*;

class Main{

	public static void main(String[] args){
		SubscriptionClass subscription;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your user Id");
		int userId = Integer.parseInt(input.nextLine());
		System.out.println("Enter your user name");
		String userName = input.nextLine();
		subscription = new SubscriptionClass(userName, userId);
		int digit = -1;
		while(!(digit == 0 )) {
			System.out.println("select for payment [1] Free, [2] Basic , [3] Premium [0] Quit");
			digit = Integer.parseInt(input.nextLine());
			switch(digit)
			{
			case 0: break;
			case 1: System.out.println("Free trial for 1 month");
			       break;
			case 2: System.out.println("Costs $10 per month");
			        break;
			case 3: System.out.println("Costs $30 per month");
			        break;
			default:
				System.out.println("Please enter the above numbers");
			}
				
		}
	} 

}