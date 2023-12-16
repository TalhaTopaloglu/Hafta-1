import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int yas, yolculukTipi;                                                                                                    // integer verileri tanımlıyoruz.
        double mesafeKm, mesafeUcreti = 0.10, toplamTutar,yasIndirimi,biletIndirimi;
        double indirimYasOnIkiAlti = 0.5,indirimGidisDonus = 0.2, indirimYasYirmiDortAlti = 0.1, indirimYasAltmisBes = 0.3;       // double verileri tanımlıyoruz.


        System.out.print("Mesafeyi km cinsinden giriniz :");                                                                      // kullanıcıdan veriyi alıyoruz.
        mesafeKm = inp.nextDouble();

        System.out.print("Yaşınızı Giriniz :");                                                                                   // kullanıcıdan veriyi alıyoruz.
        yas = inp.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Çift Yön) :");                                             // kullanıcıdan veriyi alıyoruz.
        yolculukTipi = inp.nextInt();

        toplamTutar = mesafeKm * mesafeUcreti;

        System.out.println("İndirimsiz tutar :" + toplamTutar + "\n");



        if (mesafeKm > 0.0 && yas > 0 && yolculukTipi > 0 && yolculukTipi <= 2) {       // mesafenin ve yaşın pozitif yolculuk tipinin ise 1 v2 olacağı durumlarda çalışacak

            if (yas < 12) {     // 12 yaşından küçük

                if(yolculukTipi == 1){          // 12 yaşından küçük   tek yön

                    yasIndirimi = toplamTutar * indirimYasOnIkiAlti;            // yas indirimi hesaplanıyor
                    toplamTutar = toplamTutar - yasIndirimi;                    // toplam tutardan düşüyor

                    System.out.println("Toplam Tutar "+ toplamTutar +"TL");

                }else {     // 12 yaşından küçük   çift yön

                    yasIndirimi = toplamTutar * indirimYasOnIkiAlti;        // yaş indirimi hesaplanıyor.
                    biletIndirimi = toplamTutar * indirimGidisDonus;        // çift yön indirimi hesaplanıyor.
                    toplamTutar = toplamTutar - yasIndirimi - biletIndirimi;        // çift yön indirimi ve yaş indirimi toplam tutardan düşüyor.

                    System.out.println("Toplam Tutar "+ toplamTutar +"TL");

                }
            } else if (yas >= 12 && yas <= 24) {        // 12 ve 24 arasında

                if(yolculukTipi == 1){      // 12 ve 24 arasında tek yön
                    yasIndirimi = toplamTutar * indirimYasYirmiDortAlti;
                    toplamTutar = toplamTutar - yasIndirimi;

                    System.out.println("Toplam Tutar "+ toplamTutar +"TL");

                }else {             // 12 ve 24 arasında çift yön
                    yasIndirimi = toplamTutar * indirimYasYirmiDortAlti;
                    biletIndirimi = toplamTutar * indirimGidisDonus;
                    toplamTutar = toplamTutar - yasIndirimi - biletIndirimi;

                    System.out.println("Toplam Tutar "+ toplamTutar +"TL");

                }
            } else if (yas >= 65) {     // 65 yaşına büyük tek yön

                if(yolculukTipi == 1){
                    yasIndirimi = toplamTutar * indirimYasAltmisBes;
                    toplamTutar = toplamTutar - yasIndirimi;

                    System.out.println("Toplam Tutar "+ toplamTutar +"TL");

                }else {     // 65 yaşına büyük çift yön
                    yasIndirimi = toplamTutar * indirimYasAltmisBes;
                    biletIndirimi = toplamTutar * indirimGidisDonus;
                    toplamTutar = toplamTutar - yasIndirimi - biletIndirimi;

                    System.out.println("Toplam Tutar "+ toplamTutar +"TL");

                }
            } else {        // 24-65 arası tek yön
                if(yolculukTipi == 1){

                    System.out.println("Toplam Tutar "+ toplamTutar +"TL");

                }else {     // 24-65 arası çift yön

                    biletIndirimi = toplamTutar * indirimGidisDonus;
                    toplamTutar = toplamTutar - biletIndirimi;

                    System.out.println("Toplam Tutar "+ toplamTutar +"TL");
                }
            }
        } else {        // negatif yaş veya negatif mesafe girilmiş
            System.out.println("Hatalı Veri Girdiniz.");
        }
    }
}