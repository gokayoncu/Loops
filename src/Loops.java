import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        int num, total = 0;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.print("Enter a number :");
            num = scan.nextInt();
            if (num % 4 == 0) {
                total += num;
            }

        } while (num % 2 == 0);
        System.out.println("Toplam:" + total);
    }
}
