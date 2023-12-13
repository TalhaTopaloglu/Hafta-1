import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int number;
        System.out.print("Sayı Giriniz : ");
        number = inp.nextInt();

        for(int i = 1; i< number; i*=20 ){
            System.out.println(i);
        }

    }
}