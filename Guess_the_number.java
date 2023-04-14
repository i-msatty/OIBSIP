import java.util.Scanner;						//scanner package is used to take input

public class Guess_The_Number                  //name of the game.
{   
    public static void main(String[] args)
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("WELCOME TO NUMBER GUESSING GAME.");
        int random_number,n=5,flag=0,ub=100,lb=1;				//n is no of attempts,ub and lb be upper bound and lower bound for guessing of number. flag is used to check success.	
         random_number=1 + (int)(100* Math.random());			//random function is used to generate a no from 1 to 100.
        System.out.println("Try to guess the number from 1 to 100.");   //message to user to start guessing.
        int guess=sc.nextInt();				//guess variable will store the guessed value.
        
        while(n>1)							//while loop for making 5 attempts in total
        {	
        	if(guess==random_number) // case where user guessed it right.
        	{	
            	flag=1;
        		System.out.println("Congrats!!You have guessed it right.");
        		break;
        	}
        	
        	if(guess!=random_number) // case when user guessed it wrong
        	{ 
        		System.out.println("You have guessed it wrong.");
        	}
            
        	if(guess < random_number) // case for displaying number is greater or lesser than actual number
                	System.out.println("Number is greater than guessed.");
            if(guess>random_number)
                	System.out.println("Number is lesser than guessed.");
            
            if(n<5) // executed for 2nd,3rd,4th and 5th attempt.
        	{
            	n--;
            	System.out.println(n+" Attempt left.");
        		if(guess>random_number)
        		{ub=guess-1; // updating the upper bound
        			System.out.println("Again try to guess the number from "+ lb + " to " + ub +" .");
        		}
        		else
        		{lb=guess+1; //updating the lower bound
        	        System.out.println("Again try to guess the number from "+ lb + " to "+ ub +" . ");
        		}
            guess=sc.nextInt();
        	}
            //case 1: First wrong attempt or executes for first attempt.
            if(n==5) 
        	{
            	n--;
            	System.out.println(n+" Attempt left.");
        		if(guess>random_number)
        		{ ub=guess-1;
        			System.out.println("Again try to guess the number from 1 to "+ ub+" .");
        		}
        		if(guess<random_number)
        		{lb=guess+1;
        			System.out.println("Again try to guess the number from "+ lb + " to 100 .");
        		}
        		guess=sc.nextInt();
        	}	
        }
    if(flag==0)
    	 {
    	  System.out.println("Sorry.You have guessed it wrong!!!!!");	
    	  System.out.println("The correct number is "+random_number +" ." );
    	  System.out.println("ThankYou for Playing.");
    	 }
}
}    
