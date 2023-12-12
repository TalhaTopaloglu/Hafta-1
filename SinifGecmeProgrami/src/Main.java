import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int matematik,fizik,turkce,kimya,muzik;
        // geçme 55
        double ortalama;

        System.out.print("Matematik Notunuzu Girin: ");
        matematik = input.nextInt();
        if(matematik <= 0 || matematik >= 100){
            System.out.println("Geçerli Not Girilmedi Not 0 ile 100 arasında olmalı");
            matematik = 0;

        }

        System.out.print("Fizik Notunuzu Girin: ");
        fizik = input.nextInt();
        if(fizik <= 0 || fizik >= 100){
            System.out.println("Geçerli Not Girilmedi Not 0 ile 100 arasında olmalı");
            fizik = 0;


        }

        System.out.print("Türkçe Notunuzu Girin: ");
        turkce = input.nextInt();
        if(turkce <= 0 || turkce >= 100){
            System.out.println("Geçerli Not Girilmedi Not 0 ile 100 arasında olmalı");
            turkce = 0;


        }

        System.out.print("Kimya Notunuzu Girin: ");
        kimya = input.nextInt();
        if(kimya <= 0 || kimya >= 100){
            System.out.println("Geçerli Not Girilmedi Not 0 ile 100 arasında olmalı");
            kimya = 0;


        }

        System.out.print("Müzik Notunuzu Girin: ");
        muzik = input.nextInt();
        if(muzik <= 0|| muzik >= 100){
            System.out.println("Geçerli Not Girilmedi Not 0 ile 100 arasında olmalı");
            muzik = 0;

        }

        ortalama = (matematik + turkce + fizik + kimya + muzik) / 5;

        if(ortalama >= 55){
            System.out.println("Sınıfı Tamamladınız Ortalamanız: "+ ortalama );
        }else {
            System.out.println("Sınıf Tekrarı Ortalamanız: "+ ortalama);
        }



    }
}