import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("1. Sayıyı Giriniz: ");
        int n1 = input.nextInt();
        System.out.print("2.Sayıyı Giriniz: ");
        int n2 = input.nextInt();
        int buyukSayi = 0, kucukSayi = 0, ebob = 0, ekok = 0, i = 1;

        if (n1 > n2) {
            buyukSayi = +n1;
            kucukSayi = +n2;
        } else if (n2 > n1) {
            buyukSayi = +n2;
            kucukSayi = +n1;
        } else {
            ebob = n1;
            ekok = n1;
        }

        while (i != kucukSayi + 1) {
            if (n1 % i == 0 && n2 % i == 0) {
                ebob = i;
            }
            i++;
        }
        System.out.println("EBOB :" + ebob);
        ekok = (n1 * n2) / ebob;

        System.out.println("EKOK :" + ekok);
    }
}