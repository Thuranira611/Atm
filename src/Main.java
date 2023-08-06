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
       System.out.println("***** Choose an option *****");
       System.out.println("1.Deposit");
       System.out.println("2.Check account balance");
       System.out.println("3.Withdraw");
       System.out.println("4.Transfer money to my mobile phone");
       Scanner scanner = new Scanner(System.in);


       System.out.println("Enter an option:");

       byte option= scanner.nextByte();
       switch (option) {
           case 1 -> Handler.case1();
           case 2 -> Handler.case2();
           case 3 -> Handler.case3();
           case 4 -> Handler.case4();
           default -> System.out.println("Invalid option");
       }
   }

   static class  Handler{
      static long accountBalance;
       static Scanner scanner = new Scanner(System.in);
       public  static void case1(){

           System.out.println("Enter amount to Deposit:");
           long deposit = scanner.nextLong();
           accountBalance += deposit;
           System.out.println("Your account balance is:"+accountBalance);

           checker();
           }
       public  static  void case2(){
           System.out.println("Your account balance is:"+accountBalance);

           checker();

       }
       public  static  void case3(){
           System.out.println("Enter amount to Withdraw:");
           long withdraw = scanner.nextLong();
           accountBalance-=withdraw;
           System.out.println("Your account balance is:"+accountBalance);

           checker();
       }

       public static  void case4(){
           System.out.println("Enter amount to transfer to +254******532 via Mpesa:");
           long transfer= scanner.nextLong();
           while (true){

               System.out.println("Enter amount to transfer to +254******532 via Mpesa:");
                transfer= scanner.nextLong();

                if (transfer>accountBalance){
                    System.out.println("Account balance is low,transaction cancelled...");
                }
                else if(transfer<accountBalance){ //made sure account balance is not 0.
                    accountBalance-= transfer;
                    break;
                }
           }

           System.out.println(transfer+" sent to your mobile number +254******532 via Mpesa:");
           System.out.println("Your account balance is:"+accountBalance);

           checker();


       }

//checker function
       public  static  void checker(){
           while(true){
               System.out.print("Type '1' to continue with transaction or '2' to exit:");
               byte typed = scanner.nextByte();
               if(typed ==1){
                   Options.options();
                   break;
               }else if (typed==2){
                   System.out.println("Program closing...");
                   break;
               }else{
                   System.out.println("Invalid input");
               }
           }
       }

       }

   }
