import java.util.Scanner;

public class BankApplication{
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        MenuApplication();
    }
    public static void MenuApplication(){
        int choice=1;
        while(choice!=0){
            System.out.println("\n ----Menu Application-----");
            System.out.println("1. Manage Client ");
            System.out.println("2. Manage Account ");
            System.out.println("3. Manage Operations ");
            System.out.println("0. Exit");
            System.out.print("Enter your choice :");
            choice=scanner.nextInt();
            scanner.nextLine();

            switch(choice){
                case 1: MenuClient();
                    break;
                case 2: Account. MenuAccount();
                    break;
                case 3: //MenuOperation();
                    break;
                case 0:
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice");

            }
        }
    }