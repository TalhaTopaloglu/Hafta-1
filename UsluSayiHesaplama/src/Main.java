import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int result = 1 ,taban = 1, üs = 1; // değerleri çarpmada etkisiz eleman olan 1 e eşitliyoruz.

        System.out.print("Tabanı Giriniz : ");
        taban = input.nextInt();

        System.out.print("Üssü Giriniz : ");
        üs = input.nextInt();

        for(int i = üs; i>0 ; i--){
           result *= taban;
        }

        System.out.println("Sorunun cevabı : " + result);

    }
}