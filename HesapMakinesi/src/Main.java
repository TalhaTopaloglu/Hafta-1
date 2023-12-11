import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("1. Sayıyı Giriniz: ");    // birinci sayıyı alıyoruz
        double n1 = inp.nextInt();

        System.out.print("2. Sayıyı Giriniz: ");  // ikinci sayıyı alıyoruz
        double n2 = inp.nextInt();

        System.out.println("1- Toplam\n2- Çıkarma\n3- Çarpma\n4- Bölme"); // işlemlere 1,2,3,4 değerlerini atayıp daha sonra kullanıdan hangi işlemi yapmak istediğini alıyoruz.
        int islem = inp.nextInt();

        switch(islem){      // islem değişkeninde hangi işlemi yapacağını aldıktan sonra switch durumuna değişken olarak atıyoruz
            case 1:
                System.out.println("İşlem Sonucu= " + (n1+n2));     // 1-  toplama
                break;
            case 2:
                System.out.println("İşlem Sonucu= " + (n1-n2));     // 2-  çıkarma
                break;
            case 3:
                System.out.println("İşlem Sonucu= " + (n1*n2));     // 3-  çarpma
                break;
            case 4:
                System.out.println("İşlem Sonucu= " + (n1/n2));     // 4-  bölme
                break;
        }
    }
}