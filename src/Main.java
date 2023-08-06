import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Atm");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your password:");
       String inputPassword = scanner.nextLine().trim();
       String currentPassword = "8450";
       if(inputPassword.equals(currentPassword)){
           Options.options();
       }else {
           while (true){
               System.out.println("Please enter correct password:");
               inputPassword = scanner.nextLine().trim();
               if(inputPassword.equals(currentPassword)) {
                   Options.options();
                   break;
               }
           }
       }

    }
}
 class Options{
   public static void options(){
       System.out.println("*****Choose an option*****");
       System.out.println("1.Check account balance");
       System.out.println("2.Deposit");
       System.out.println("3.Withdraw");
       System.out.println("4.Transfer money to my mobile phone");
       Scanner scanner = new Scanner(System.in);


       System.out.println("Enter an option:");

       byte option= scanner.nextByte();
       switch (option) {
           case 1 -> Handler.case1();
           case 2 -> Handler.case2();
           case 3 -> System.out.println("Enter amount to Withdraw:");
           case 4 -> System.out.println("Enter amount to transfer to +254******532 via Mpesa:");
           default -> System.out.println("Invalid option");
       }
   }

   static class  Handler{
       static Scanner scanner = new Scanner(System.in);
       public  static void case1(){
           System.out.println("Your account balance is:");
       }
       public  static  void case2(){
           System.out.println("Enter amount to Deposit:");
           long Deposit = scanner.nextLong();

       }
   }
}