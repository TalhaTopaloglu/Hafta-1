import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        double kilo,boy, kitleIndeksi;

        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz: ");
        boy = inp.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz: ");
        kilo = inp.nextDouble();

        kitleIndeksi = kilo/ (boy*boy);

        System.out.print("Vücut Kitle İndeksiniz :"+ kitleIndeksi);

    }
}