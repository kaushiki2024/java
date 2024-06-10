import java.util.Scanner;

public class Student {
    String name;
    int age;
    int mks;
    String stream;

    public void accept() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter name: ");
        name = sc.nextLine();
        
        System.out.print("Enter age: ");
        age = sc.nextInt();
        
        System.out.print("Enter marks: ");
        mks = sc.nextInt();

        sc.close();
    }

    public void allocation() {
        if (mks >= 300) {
            stream = "Science and Computer";
        } else if (mks >= 200 && mks < 300) {
            stream = "Commerce and Computer";
        } else if (mks >= 75 && mks < 200) {
            stream = "Arts and Animation";
        } else {
            stream = "Try again";
        }
    }

    public void print() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + mks);
        System.out.println("Stream: " + stream);
    }

    public static void main(String args[]) {
        Student sca = new Student();
        sca.accept();
        sca.allocation();
        sca.print();
    }
}
