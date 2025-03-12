import java.util.Random;
import java.util.Scanner;

class Number_Guess
{
    public static void main(String[]args)
    {
        System.out.println("Welcome to the Number Guessing game");
        Scanner input = new Scanner(System.in);
        int Attempt=1;
        while(true)
        {
            Random rand = new Random();
            int r_num = rand.nextInt(100);
            while(Attempt<=5)
            {
                System.out.println("Enter a number to be guessed: ");
                int num = input.nextInt();
                if(num==r_num)
                {
                    System.out.println("Congratulation,your Guess is correct at "+Attempt+" attempt");
                    break;
                }
                else
                {
                    if(num<r_num)
                    {
                        System.out.println("Your guess is too low");
                    }
                    else{
                            System.out.println("Your guess is too high");
                        }
                }
                Attempt++;
            }
            System.out.println("Generated random number is:"+r_num);
            System.out.println("Do you want to play again? yes/no: ");
            String choice = input.next();
            if(choice.equals("no"))
            {
                System.out.println("Thank you for playing!!");
                break;
            }
            Attempt=0;
        }
    }
}
