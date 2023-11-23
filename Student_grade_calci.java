import java.util.Scanner;
public class Student_grade_calci{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome and enter your marks out of 100!!");
        System.out.println("Enter Maths marks");
        int m1=sc.nextInt();
        System.out.println("Enter Physics marks");
        int m2=sc.nextInt();
        System.out.println("Enter Chemistry marks");
        int m3=sc.nextInt();
        System.out.println("Enter English marks");
        int m4=sc.nextInt();
        System.out.println("Enter Biology marks");
        int m5=sc.nextInt();
        float t=(float)(m1+m2+m3+m4+m5);
        System.out.println("--------------------");
        System.out.println("Total marks: "+t);
        float av=(t*100)/500;
        System.out.println("Average percentage: "+av);
        String grade="f";
        if(av<40){
            grade="F";
        }
        else if(av>40 && av<=50){
            grade="E";
        }
        else if(av>50 && av<=60){
            grade="D";
        }
        else if(av<60 &&av<=70){
            grade="C";
        }
        else if(av>70 && av<=80){
            grade="B";
        }
        else if(av>80 && av<=90){
            grade="A";
        }
        else if(av>90 && av<=100){
            grade="A+";
        }
        System.out.println("Grade: "+grade);
        System.out.println("--------------------");
    }
}