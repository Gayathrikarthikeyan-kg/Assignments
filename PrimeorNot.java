package Assignmentsweek1;

public class PrimeorNot {
	

	public static void main(String[] args) {
	
		 int remainder;
		  boolean isPrime=true;
		  int numToCheck=13;
		  for(int i=2;i<=numToCheck/2;i++)
		  {
		   //numberToCheckber is dived by itself
		            remainder=numToCheck%i;
		            System.out.println(numToCheck+" Divided by "+ i + " gives a remainder "+remainder);
		            if(remainder==0)
		            {
		               isPrime=false;
		               
		            }
		         }
		  if(isPrime) {
			     System.out.println(numToCheck + " is a Prime numberToCheck");
		  }else
			     System.out.println(numToCheck + " is not a Prime numberToCheck");
			    }
			      

	}


