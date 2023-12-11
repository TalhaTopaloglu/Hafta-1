import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        double kacKm, toplamUcret;

        int baslangıc = 10;

        System.out.print("Kaç Km Yapıldı: ");

        kacKm = inp.nextInt();

        toplamUcret = baslangıc + (kacKm * 2.2);

        toplamUcret = (toplamUcret < 20) ? 20 : toplamUcret;

        System.out.print("Toplam ücret: " + toplamUcret);

    }
}