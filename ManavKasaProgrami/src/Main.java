import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        double armut, elma, domates, muz, patlican, toplamTutar;

        System.out.print("Kaç kg armut aldınız: ");
        armut = inp.nextDouble();

        System.out.print("Kaç kg elma aldınız: ");
        elma = inp.nextDouble();

        System.out.print("Kaç kg domates aldınız: ");
        domates = inp.nextDouble();

        System.out.print("Kaç kg muz aldınız: ");
        muz = inp.nextDouble();

        System.out.print("Kaç kg patlican aldınız: ");
        patlican = inp.nextDouble();

        toplamTutar = (armut * 2.14) + (elma * 3.67) + (domates * 1.11) + (muz * 0.95) + (patlican * 5.0);

        System.out.print("Toplam Tutar: " + toplamTutar);

    }
}