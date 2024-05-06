import java.util.Scanner;
public class readcharcter {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a character");
        char c = sc.next().charAt(1);
        System.out.println("character is: "+c);
    }
}
