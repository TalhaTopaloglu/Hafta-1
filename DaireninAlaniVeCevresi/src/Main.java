import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        double yariCap, alan, cevre, aci, aciAlan, pi = 3.14;

        System.out.print("Yarı Çapı Giriniz: ");
        yariCap = inp.nextDouble();

        System.out.print("Açı Giriniz: ");
        aci = inp.nextDouble();

        System.out.println("Dairenin Yarı Çapı = " + yariCap);

        alan = pi * yariCap * yariCap;

        cevre = 2.0 * pi* yariCap;

        aciAlan = (alan*aci)/ 360.0;

        System.out.println("Dairenin Alanı = " + alan);
        System.out.println("Dairenin Çevresi = " + cevre);
        System.out.print("Dilimin Alanı = " + aciAlan);

    }
}