import java.util.*;

public class Magic8Ball
{
    public static void main(String[] args)
    {
        boolean wantsToPlay = true;
        boolean inputVal = false;
        //Creates a Scanner
        Scanner scanner = new Scanner(System.in);
        while(wantsToPlay)
        {
            System.out.println("Welcome to the Magic 8 Ball!");
            System.out.print("Enter your question and I will answer it: ");
            String question = scanner.nextLine();
            System.out.println("");
            
            //Gets a random number from 1 to 20
            int randomNum = (int)(Math.random()*20);
            
            //Prints 1 of 20 random responses
            if(randomNum == 0)
                System.out.println("It is certain");
            if(randomNum == 1)
                System.out.println("It is decidedly so");
            if(randomNum == 2)
                System.out.println("Without a doubt");
            if(randomNum == 3)
                System.out.println("Yes definitely");
            if(randomNum == 4)
                System.out.println("You may rely on it");
            if(randomNum == 5)
                System.out.println("As I see it, yes");
            if(randomNum == 6)
                System.out.println("Most likely");
            if(randomNum == 7)
                System.out.println("Outlook good");
            if(randomNum == 8)
                System.out.println("Yes");
            if(randomNum == 9)
                System.out.println("Signs point to yes");        
            if(randomNum == 10)
                System.out.println("Reply hazy, try again");
            if(randomNum == 11)
                System.out.println("Ask again later");
            if(randomNum == 12)
                System.out.println("Better not tell you now");     
            if(randomNum == 13)
                System.out.println("Cannot predict now");
            if(randomNum == 14)
                System.out.println("Concentrate and ask again");
            if(randomNum == 15)
                System.out.println("Don’t count on it");
            if(randomNum == 16)
                System.out.println("My reply is no");
            if(randomNum == 17)
                System.out.println("My sources say no");
            if(randomNum == 18)
                System.out.println("Outlook not so good");
            if(randomNum == 19)
                System.out.println("Very doubtful");
            System.out.println();

            //Asks if they wish to continue to play and input validation
            System.out.println("Would you like to play again?\n1. Yes\n2. No");
            String playAgain = scanner.nextLine();
            inputVal = false;
            while(!inputVal)
            {
                if(playAgain.equalsIgnoreCase("n") || playAgain.equalsIgnoreCase("no") || playAgain.equalsIgnoreCase("y") || playAgain.equalsIgnoreCase("yes") || playAgain.equals("1") || playAgain.equals("2")) 
                    inputVal = true;
                else
                {
                    System.out.println("Input not recognized. Would you like to play again?\n1. Yes\n2. No\n");
                    playAgain = scanner.nextLine();
                }
            }
            if(playAgain.equalsIgnoreCase("n") || playAgain.equalsIgnoreCase("2") || playAgain.equalsIgnoreCase("no"))
            {
                wantsToPlay = false;
            }
            System.out.println("\n\n\n");
        }
        System.out.println("Come again soon!");
    }
}