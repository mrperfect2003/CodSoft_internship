import java.util.Scanner;
public class ATM 
{
    static float Withdraw(float withdraw,float amount){
        if(withdraw>0 && amount>=withdraw){
            if(withdraw<45000){
                amount-=withdraw;
                System.out.println("------------------------------");
                System.out.println("Withdraw is successfull!!");
                System.out.println("The remaining balance in account: "+amount);
                System.out.println("------------------------------");
            }
            else{
                System.out.println("------------------------------");
                System.out.println("Entered amount is too high!!");
                System.out.println("Amount should be less than 45000 ");
                System.out.println("------------------------------");
            }
            return amount;
        }
        else{
            System.out.println("Insufficient balance!!");
            return 0;
        }
    }
    static float Deposit(float deposit,float amount){

            amount+=deposit;
            System.out.println("------------------------------");
            System.out.println("The deposit is successful!!");
            System.out.println("The balance in your account: "+amount);
            System.out.println("------------------------------");
            return amount;
        
    }
    static float checkBalance(float amount){
        System.out.println("The balance is "+amount);
        System.out.println();
        return amount;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float amount;
        float balance;
        float withdraw;
        System.out.println();
        System.out.println("WELCOME YOU...HOW CAN I HELP YOU?...");
        System.out.println();
        while(true){
            amount=20000;
            System.out.println("The total amount in your account: "+amount);
            System.out.println("1.Withdraw");
            System.out.println("2.Deposit");
            System.out.println("3.Check balance");
            System.out.println("4.Exit");
            System.out.println("Enter your choice");
            int ch=sc.nextInt();
            switch(ch){
                case 1:
                System.out.println("The total amount in your account: "+amount);
                System.out.println("Enter withdraw amount");
                withdraw=sc.nextInt();
                Withdraw(withdraw,amount);
                break;
            
                case 2:
                System.out.println("Enter amount to deposit");
                float deposit=sc.nextFloat();
                Deposit(deposit,amount);

                break;

                case 3:
                checkBalance(amount);
                break;

                case 4:
                System.exit(0);

                default:System.out.println("Enter valid choice!!");
                break;
            }
        }
        
    }    
}