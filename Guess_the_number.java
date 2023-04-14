import java.util.Scanner;

public class Guess_the_number extends javafx.application.application
{   
    public static void main(String[] args)
    {
        int random_number;
        while(1)
        {
        random_number=Math.random();
        if(random_number>=1 && random_number<=100)
            break;
        }
        Scanner sc=new Scanner(System.in);
        System.out.println("Try to guess the number between 1 to 100");
        int guess=sc.nextInt(System.in);
        if(guess==random_number)
            {
                System.out.println("You have guessed it right");
            }
        else
            System.out.println("You have guessed it wrong");
    }
}