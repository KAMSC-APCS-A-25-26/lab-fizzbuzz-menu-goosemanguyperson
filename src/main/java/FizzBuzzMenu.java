import java.util.Scanner;

// DO NOT CHANGE THE CLASS NAME, IT WILL BREAK THE AUTO GRADER
public class FizzBuzzMenu
{
    public static void main(String[] args)
    {
        // setup scanner and run boolean
        Scanner sc = new Scanner(System.in);
        boolean run = true;

        // run program until user says no
        while(run)
        {
            // display menu interface
            System.out.println("---- FizzBuzz Menu ----");
            System.out.println("1. Fizz: Multiples of 3");
            System.out.println("2. Buzz: Multiples of 5");
            System.out.println("3. FizzBuzz: Multiples of 3 and 5");
            System.out.println("4. Exit, if you want");
            System.out.print("Enter your choice:  ");

            // read in the user's choice, then perform that choice's action
            int choice = sc.nextInt();
            switch(choice)
            {
                // choice 1: Fizz numbers
                case 1:
                    for(int i=1; i<100; i++)
                    {
                        if(i%3==0)
                        {
                            System.out.print(i + " ");
                        }
                    }
                    System.out.println("\n");
                    break;

                // choice 2: Buzz numbers
                case 2:
                    for(int i=1; i<100; i++)
                    {
                        if(i%5==0)
                        {
                            System.out.print(i + " ");
                        }
                    }
                    System.out.println("\n");
                    break;

                // choice 3: FizzBuzz numbers
                case 3:
                    for(int i=1; i<100; i++)
                    {
                        // made you look
                        if(i%15==0)
                        {
                            System.out.print(i + " ");
                        }
                    }
                    System.out.println("\n");
                    break;
                // choice 4: end program
                case 4:
                    System.out.println("see ya");
                    run = false;
                    break;
            }
        }
    }
}
