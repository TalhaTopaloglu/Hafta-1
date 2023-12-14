public class Main {
    public static void main(String[] args) {

        int number = 100;   // başlangıç değeri olarak 100 giriyoruz.
        int counter = 0;    // bölenleri saymak için bir sayaç ekliyoruz.

        for (int i = 2; i < number; i++) {  // 100e kadar olan sayıları alıyoruz.
            for (int j = 2; j < i; j++) {   // ilk döngüden aldığımız "i"nin böleni olup olmadığını kontrol ettiğimiz döngü
                if (i % j == 0) {       // eğer böleni varsa sayacı bir arttırıyoruz.
                    counter++;
                }
            }
            if (counter == 0) {     // sayaç artmadıysa i'nin böleni yoktur demektir ve bu asal olduğunu gösterir.
                System.out.print(i + " ");       // i'leri yazdırıyoruz.
            }
            counter = 0;        // counterı 0'a çekiyoruz ve for döngüsünü başa dönüyor.
        }
    }
}