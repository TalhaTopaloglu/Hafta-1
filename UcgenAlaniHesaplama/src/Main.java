import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double birinciKenar, ikinciKenar,ucuncuKenar,alan,alanKare;

        System.out.print("Birinci Kenar: ");
        birinciKenar = inp.nextInt();

        System.out.print("İkinci Kenar: ");
        ikinciKenar = inp.nextInt();

        System.out.print("Üçüncü Kenar: ");
        ucuncuKenar = inp.nextInt();

        if(birinciKenar + ikinciKenar <= ucuncuKenar || birinciKenar + ucuncuKenar <= ikinciKenar || ikinciKenar + ucuncuKenar <= birinciKenar){ // iki kenarın uzunluğunun toplamı üçüncü kenardan düşük olmak zorunda.
            System.out.println("Üçgen, kenar teoremine uymadı. Alan hesaplanamadı.");
        }
        else {

            double cevre = birinciKenar + ikinciKenar + ucuncuKenar;

            System.out.println("Üçgenin Çevresi: " + cevre);

            double yariCevre = cevre / 2;

            alanKare= (yariCevre * (yariCevre - birinciKenar) * (yariCevre - ikinciKenar) * (yariCevre - ucuncuKenar));

            alan = Math.sqrt(alanKare);

            System.out.print("Üçgenin Alanı: " + alan);;
        }

    }
}