import java.util.Scanner;
public class string {
    public static void main(String[] args){
        String name= new String("Kaushiki");//In memory kaushiki cannot be changed
        String box="Apple";
        System.out.println(name);
        System.out.println(box);
        Scanner sc = new Scanner(System.in);
        String st=sc.nextLine();
        sc.close();
        System.out.printf(st);
    }
}
