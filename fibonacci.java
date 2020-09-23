public class Fibonacci{
  public static int Fibonacci(int number){  //Number for which 
	  int previousNumber = 0, currentNumber = 1, nextNumber;
      for(int i = 1; i < number; i++){
		  nextNumber = previousNumber;
	      previousNumber = currentNumber;
	      currentNumber = previousNumber + nextNumber;
        }
	return currentNumber; 
  }
}
	  