package Bank_Activities;
import java.util.Scanner;
public class Create_Account extends Main{
    Scanner cs = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);

        Main bank=new Main();

        while(true) {

            System.out.print("Welcome To Tamil Nadu Bank\n");
            System.out.println("1. Create New Account\n " +
                    "2.Get Account Details\n " +
                    "3.Deposite Ammount\n " +
                    "4.WithdrawAmmount\n " +
                    "5.Check Balance\n " +
                    "6.Exit");
            int choice = cs.nextInt();
            cs.nextLine();
            if (choice == 1) {
                System.out.println( bank.details());
            } else if (choice == 2) {
                System.out.println(bank.getdetails());
            } else if (choice == 3) {
                System.out.println(bank.deposite());
            } else if (choice == 4) {
                System.out.println(bank.withdrw());
            } else if(choice==5) {
                System.out.println(bank.balance());
            }else if(choice==6) {
                System.out.println(bank.exit());
                break;
            }
        }

    }

}