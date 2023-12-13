import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz : ");
        int number = input.nextInt();
        int tempNumber = number;
        int basamakSayisi = 0;
        int basamakDegeri = 0;
        int toplam = 0;
        int sonuc = 0;

        while (tempNumber != 0){
            tempNumber /= 10;
            basamakSayisi++;
        }

        tempNumber = number;

        while(basamakSayisi != 0){

            basamakDegeri = tempNumber % 10;
            tempNumber /= 10;
            sonuc += basamakDegeri;
            basamakSayisi--;
        }
        System.out.println("basamak değerlerinin toplamı"+sonuc);

    }
}