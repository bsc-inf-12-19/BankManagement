import java.util.Scanner;
public class BankManagement{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        AccountDetails a1 = new AccountDetails();
        BusinessAccounts b1 = new BusinessAccounts();
        StudentAccounts s1 = new StudentAccounts();
        a1.menu();
        int num = input.nextInt();
        if(num == 2){
            System.out.println("\nSelect the Bank Account type");
            System.out.println("1. Student");
            System.out.println("2. Executive");
            System.out.print("\nEnter your choice: ");
            int choice = input.nextInt();
            if(choice == 1){
                System.out.println("\tCreating a new student Bank Account");
                System.out.print("Enter Account Number: ");
                int number = (int)( 10000 +Math.random() * 90000);
                System.out.print(number);
                System.out.print("\nEnter Account Name: ");
                String name = input.next();
                s1.setAccountName(name);
                System.out.print("Enter student Reg #: ");
                String reg = input.next();
                s1.setregNumber(reg);
                System.out.print("Enter Branch: ");
                String branch = input.next();
                System.out.print("Enter Balance: ");
                double balance = input.nextDouble();
                s1.setBalance(balance);
                if(s1.getBalance() < 200){
                    System.out.println("\nAmount very small");
                    System.exit(0);
                }
                else{
                    System.out.println("\nAccount successfully created.");
                }
            }
            System.out.println
            
        }
    }
}