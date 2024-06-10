import java.util.Scanner;

public class questionsir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double arr_size = 10; // Array size as double
        double[] arr = new double[(int) arr_size]; // Cast to int for array size
        
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < (int) arr_size; i++) {
            arr[i] = sc.nextDouble();
        }
        
        System.out.println("Enter the element to be searched: ");
        double num = sc.nextDouble();
        sc.close();
        
        boolean found = false;
        int position = -1; // Variable to store the position of the found element
        for (int i = 0; i < (int) arr_size; i++) {
            if (num == arr[i]) {
                found = true;
                position = i; // Store the position
                break;
            }
        }
        
        if (found) {
            System.out.println("Number found in array at position: " + position);
        } else {
            System.out.println("Number not found in array");
        }
    }
}
