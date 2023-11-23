import java.util.*;
public class Number_game{
    public static void main(String[] args){
        boolean play=true;
        while(play==true){
            Random rand=new Random();
            int num=rand.nextInt(101);
            System.out.println(num);
            int i,G=5,guess,attempts=0;
            Scanner sc=new Scanner(System.in);
            System.out.println("Welcome to Number Game!!");
            System.out.println();
            System.out.println("enter a number between 0-100.");
            System.out.println("You have 5 attempts to guess the number.");
            for(i=0;i<G;i++){
                System.out.println("Guess the number");
                guess=sc.nextInt();
                if(num==guess){
                    System.out.println("-------------------------");
                    System.out.println("congratulations!! you have guessed the right number");
                    attempts++;
                    break;
                }
                else if(guess>num){
                    System.out.println("Guess is greater");
                    System.out.println();
                    attempts++;
                }
                else if(guess<num){
                    System.out.println("Guess is smaller");
                    System.out.println();
                    attempts++;
                }
            }
            if(i==G){
                System.out.println();
                System.out.println("-------------------------");
                System.out.println("You are done with your trails!!");
                System.out.println("the actual number was "+num);
                attempts=0;

            }
            System.out.println("your score: "+attempts);
            System.out.println("-------------------------");
            break;
            
           
        }
    }
}