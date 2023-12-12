import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int dogumTarihi, zodyakYili;    // değişkenleri tanımlıyoruz
        String zodyakBurcu = "";    // string olan değişkeni boş bir string gibi tanımlıyoruz

        System.out.print("Doğum Yılınızı Giriniz : ");  // kullanıcıdan doğum yılını alıyoruz
        dogumTarihi = input.nextInt();

        zodyakYili = dogumTarihi % 12;      // doğum yılının 12ye kalanını hesaplıyoruz

        switch (zodyakYili){        // switch case yapısı ile durumları ve şartları belirliyoruz.
            case 0:
                zodyakBurcu = "Maymun";
                break;
            case 1:
                zodyakBurcu = "Horoz";
                break;
            case 2:
                zodyakBurcu = "Köpek";
                break;
            case 3:
                zodyakBurcu = "Domuz";
                break;
            case 4:
                zodyakBurcu = "Fare";
                break;
            case 5:
                zodyakBurcu = "Öküz";
                break;
            case 6:
                zodyakBurcu = "Kaplan";
                break;
            case 7:
                zodyakBurcu = "Tavşan";
                break;
            case 8:
                zodyakBurcu = "Ejderha";
                break;
            case 9:
                zodyakBurcu = "Yılan";
                break;
            case 10:
                zodyakBurcu = "At";
                break;
            case 11:
                zodyakBurcu = "Koyun";
                break;
        }

        System.out.println("Çin Zodyağı Burcunuz : " + zodyakBurcu);
    }

}