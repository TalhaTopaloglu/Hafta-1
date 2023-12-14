import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Sayıyı Giriniz: ");   // sayıyı alıyoruz
        int n = input.nextInt();
        int sum = 0;    // toplam değişkenini 0'a eşitliyoruz

        for (int i = 1; i < n; i++) {   // for döngüsüyle sayıdan küçük sayılara dönüyoruz.
            if (n % i == 0) {       //  sayının tam bölenlerini kontrol ettiğimiz kontrol yapısı.
                sum += i;       // tam bölenleri tekrardan topluyoruz
            }
        }

        if (sum == n) {     // tam bölünenlerin toplamı sayımıza eşitse bu bir mükemmel sayıdır.
            System.out.println(n + " bir mükemmel sayıdır.");
        } else {
            System.out.println(n + " bir mükemmel sayı değildir.");
        }
    }
}