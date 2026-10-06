
import java.util.Scanner;
public class ejercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] num = new int [10];
        int count = 1;
        int countN = 10;
        for (int i = 0; i < 10; i++) {
            System.out.println("Introduce el número" + " " + count++);
            int numX = input.nextInt();
            num [i] = numX;
        }
        System.out.println("_____________________________________________________");
        for (int i = 9; i >= 0; i--) {
            System.out.println("Número" + " " + countN--);
            System.out.println(num[i]);

        }
    }
}