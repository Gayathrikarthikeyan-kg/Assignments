package Assignmentsweek1;

public class Fibonacci {

	public static void main(String[] args) {
				 int maxNum = 10; 
				 int previousNum = 0;
				 int nextNum = 1;
				 
	   System.out.print("Fibonacci Series of "+maxNum+" numbers:");
		 
			        for (int i = 1; i <= maxNum; i++)
			        {
			            System.out.print(previousNum+" ");
			            int sum = previousNum + nextNum;
			            previousNum = nextNum;
			            nextNum = sum;
			        }
			}
		
	

}
