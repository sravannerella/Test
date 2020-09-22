import java.util.*;

class Main{

	public static void main(){
		//System.out.println('Hello World');
		int num;
          
		System.out.println("Enter how may Fibonnaci numbers to print:");
		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();
		
		for (int i = 0; i<=num-1; ++i)
		{
		   System.out.print(fibonacciNumber(i) + ", ");
		}
	}

}