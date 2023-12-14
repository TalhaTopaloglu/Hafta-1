import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        System.out.print("Ondalıklı Bir Sayı giriniz :");       // kullanıcıdan veri alıyoruz.
        double sayi1 = inp.nextDouble();                        // double tanımlıyoruz

        System.out.print("Tam Sayı Giriniz :");                 // kullanıcıdan veri alıyoruz.
        int sayi2 = inp.nextInt();                              // integer tanımlıyoruz

        int tamSayi1 = (int) sayi1;                             // ondalıklı sayıyı integer haline getiriyoruz
        double ondalikliSayi1 = sayi2;                         // integer sayıyı double haline getiriyoruz

        System.out.println(sayi1 + " ondalıklı sayısının tam sayı hali " + tamSayi1);
        System.out.println(sayi2 + " tam sayısının ondalıklı hali " + ondalikliSayi1);
    }
}