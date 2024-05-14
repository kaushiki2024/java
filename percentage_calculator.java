import java.util.Scanner;
public class percentage_calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of 1 subject:");
        float sub1= sc.nextFloat();
        System.out.println("Enter the marks of 2 subject:");
        float sub2= sc.nextFloat();
        System.out.println("Enter the marks of 3 subject:");
        float sub3= sc.nextFloat();
        System.out.println("Enter the marks of 4 subject:");
        float sub4= sc.nextFloat();
        float sum = ((sub1+sub2+sub3+sub4)/400);
        float per=sum*100;
        System.out.print(per);
        sc.close();


        
        


    }
    
}
