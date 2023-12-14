import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayı Giriniz :"); // dizinin kaç elemanı göstereceğini alıyoruz.
        int number = inp.nextInt();

        int n1 = 0, n2 = 1, n3;     // 3 adet değişken belirliyoruz(2 sayını toplamı 3. sayı olduğu için.

        System.out.print(n1 + " " + n2);    // başta tanımladığımız 0 ve 1 sayısını yazdırıyoruz.
        for (int i = 2; i <= number; i++) {

            n3 = n1 + n2;       // 3. sayıyı iki sayını toplamına eşitliyoruz
            System.out.print(" " + n3); // bulduğumuz 3. sayıyı diziye ekliyoruz
            n1 = n2;    // sayıların değerlerini dizi devam etmesi için bir sonraki sayıya tanımlıyoruz.
            n2 = n3;
        }
        System.out.println();
    }
}