import java.util.Scanner;

 class bank {
    private double bal = 14000;
    private int pin;



    public void Deposite (double money)
    {
        System.out.println("Enter Pin");
        Scanner parminder = new Scanner(System.in);

        pin = parminder.nextInt();

        if(pin==2003)
        {
            bal = bal+money;
            System.out.println("Deposited Money :" + money);
            System.out.println("Total Balance :" + bal);

        }
        else
        {
            System.out.println("Wrong Pin");
        }


    }


    public void Withdraw (double money)
    {
        System.out.println("Enter Pin");
        Scanner parminder = new Scanner(System.in);

        pin = parminder.nextInt();

        if(pin==2003)
        {
            bal = bal-money;
            System.out.println("Withdrawal Money :" + money);
            System.out.println("Total Balance :" + bal);

        }
        else
        {
            System.out.println("Wrong Pin");
        }


    }

    public void Checkbalance ()
    {
        System.out.println("Enter Pin");
        Scanner parminder = new Scanner(System.in);

        pin = parminder.nextInt();

        if(pin==2003)
        {

            System.out.println("Total Balance :" + bal);

        }
        else
        {
            System.out.println("Wrong Pin");
        }


    }


}


class bankcustomer
{
    public static void main(String[] args) {

        bank parminder = new bank();

        int ch;
        System.out.println("1. Deposite");
        System.out.println("2. withdraw");
        System.out.println("3. Check Balance");

        System.out.println("Enter your choice");
        Scanner p2 = new Scanner(System.in);


        ch = p2.nextInt();

        switch (ch)
        {
            case 1: parminder.Deposite(15000);
                break;

            case 2: parminder.Withdraw(2000);
                break;

            case 3: parminder.Checkbalance();
                break;
            default:
                System.out.println("enter correct Choice");


        }

    }
}
