import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("Sayı Giriniz :");
        double number = inp.nextDouble();
        double sum = 1.0;

        for(double i = 2; i <= number; i++){
            sum +=1/i;
            System.out.println(i);
        }
        System.out.println(sum);

    }
}