package Assignmentsweek1;

public class Factorial {
	// method to find factorial of given number 
    static int factorial(int n) 
    { 
        if (n == 0) 
          return 1; 
          
        return n*factorial(n-1); 
    } 

	public static void main(String[] args) {

        int num = 5; 
        System.out.println("Fact of "+ num + " is " + factorial(5)); 

	}

}
