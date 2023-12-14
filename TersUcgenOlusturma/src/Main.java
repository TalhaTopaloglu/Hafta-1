import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        int n = inp.nextInt();

        for(int i = 1; i <= n; i++) {
            for(int k = n; k > (n - i); k--) {
                System.out.print(" ");
            }

            for(int j = 2 * n - 1; j >= (2 * i - 1); j--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}