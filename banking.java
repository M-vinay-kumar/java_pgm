import java.util.Scanner;

public class banking
{
    public static boolean validateInputAmount(Integer amount)
    {
        return amount>0;
    }
    public static void main(String args[] )
    {
        int balance = 0, withdraw, deposit;

        Scanner sc = new Scanner(System.in);

        while(true)
        {
            System.out.println("Enter 1 for Withdraw");
            System.out.println("Enter 2 for Deposit");
            System.out.println("Enter 3 for Check Balance");
            System.out.println("Enter 4 for EXIT");
            System.out.println("Enter the operation you want to perform:");

            int choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.print("Enter money to be withdrawn:");

                    withdraw = sc.nextInt();
                    if(!validateInputAmount(withdraw))
                    {
                        System.out.println("Enter amount more than zero");
                        break;
                    }

                    if(balance >= withdraw)
                    {
                        balance = balance - withdraw;
                    }
                    else
                    {
                        System.out.println("Insufficient Balance please enter the available amount");
                    }

                    break;

                case 2:

                    System.out.print("Enter money to be deposited:");

                    deposit = sc.nextInt();
                    if(!validateInputAmount(deposit))
                    {
                        System.out.println("Enter amount more than zero");
                        break;
                    }

                    balance = balance + deposit;
                    System.out.println("Your Money has been successfully deposited");
                    System.out.println("");
                    break;

                case 3:
                    System.out.println("Balance : "+balance);
                    System.out.println("");
                    break;

                case 4:
                    System.exit(0);
            }
        }
    }
}