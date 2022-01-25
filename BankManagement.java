import java.util.Scanner;
public class BankManagement{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        AccountDetails a1 = new AccountDetails();
        BusinessAccounts b1 = new BusinessAccounts();
        StudentAccounts s1 = new StudentAccounts();
        a1.menu();
        int number = 1;
        String name;
        String branch = "";
        double balance;
        int num = input.nextInt();
        if(num == 2){
            System.out.println("\nSelect the Bank Account type");
            System.out.println("1. Student");
            System.out.println("2. Executive");
            System.out.print("\nEnter your choice: ");
            int choice = input.nextInt();
            if(choice == 1){
                System.out.println("\t\nCreating a new student Bank Account");
                System.out.print("Enter Account Number: ");
                number = (int)( 10000 +Math.random() * 90000);
                System.out.print(number);
                System.out.print("\nEnter Account Name: ");
                name = input.next();
                s1.setAccountName(name);
                System.out.print("Enter student Reg #: ");
                String reg = input.next();
                s1.setregNumber(reg);
                System.out.print("Enter Branch: ");
                branch = input.next();
                System.out.print("Enter Balance: ");
                balance = input.nextDouble();
                s1.setBalance(balance);
                if(s1.getBalance() < 200){
                    System.out.println("\nAmount very small");
                    System.exit(0);
                }
                else{
                    System.out.println("\nAccount successfully created.");
                }
            }
            System.out.println("\nPress Any Key to Continue:");
            String key = input.next();
            if(!key.equals("aa")){
                System.out.println("\n\tSelect operation Below");
                a1.menu();
                num = input.nextInt();
                if(num == 1){
                    System.out.println("\nAccount Number  Account Name  Type  Branch   Balance");
                    System.out.println("----------------------------------------------------");
                    System.out.println(number+        "             "  +s1.getAccountName()+  "   Savings    "   +branch+ "    "   +s1.getBalance());
                    System.out.println("\nPress Any Key to Continue:");
                    key = input.next();
                }
            }
            System.out.println("\nPress any key to continue:");
            if(!key.equals("aa")){
                System.out.println("\n\tSelect operation Below");
                a1.menu();
                num = input.nextInt();
                if(num == 6){
                 System.exit(6);   
                }
            }
        }
    }
}