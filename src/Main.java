import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
//        Exercise1();
//        Exercise2();
//        Exercise3();
//        Exercise4();
        Exercise5();
    }

    public static void Exercise1()
    {
//        Exercise 1:
//        Print 0 through 100 using a while loop.
        int count = 0;
        do
            {
                System.out.println(count);
                count++;
            }while (count != 101);
    }
    private static void Exercise2()
    {
//        Exercise 2:
//        Print only the even numbers between 0 and 100 using a for loop

        for( int i = 0; i <= 100; i++)
        {
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
    private static void Exercise3()
    {
        Scanner scan = new Scanner(System.in);
//        Exercise 3:
//        Prompt the User for a number. Create a function in your program that counts from 0 to [NUMBER]

        System.out.println("Gimme a number");
        int input = scan.nextInt();
        for(int i=0; i <= input;i++){
            System.out.println(i);
        }

    }
    private static void Exercise4()
    {
//        Exercise 4:
//        Prompt the User for secret word.
//        Create a while loop that will continually ask the Player to guess the secret word until it’s correct,
//        or 5 wrong guesses have been made. Once it’s correct print THAT’S CORRECT!!!
//        and also how many guesses it took to get it right.
//        If the Player doesn't get the secret word after 5 tries,
//        end the program and print Sorry! Out of guesses :-(
        Scanner scan = new Scanner(System.in);
        System.out.println("Give me a secret word");
        String secretWord = scan.nextLine();
        boolean result = false;
        int count = 0;
        do
            {
                System.out.println("What is the secret word?");
                String guess = scan.nextLine();

                if(guess.equals(secretWord))
                {
                    count++;
                    System.out.println("Good Job you win in " + count + " tries");
                    result = true;
                }
                else if(count == 4)
                {
                    System.out.println("You have failed");
                    result = true;
                }
                count++;
            }while (!(result));

    }
    private static void Exercise5()
    {
        Scanner scan = new Scanner(System.in);
//        Exercise 5:
//        Create a program that sends a different function a number, and that function prints out that many “*”.
        System.out.println("Give me a number");
        int starCount = scan.nextInt();
        for(int i = 0; i < starCount; i++)
        {
            System.out.println("*");
        }

    }

    private static void Challenge1()
    {

    }
}
