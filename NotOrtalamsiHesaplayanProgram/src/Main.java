import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        double turkce,mat,sosyal,fen,muzik,beden,ortalama;

        System.out.print("Türkçe Notunuz: ");
        turkce = inp.nextDouble();

        System.out.print("Matematik Notunuz: ");
        mat = inp.nextDouble();

        System.out.print("Sosyal Notunuz: ");
        sosyal = inp.nextDouble();

        System.out.print("Fen Notunuz: ");
        fen = inp.nextDouble();

        System.out.print("Müzik Notunuz: ");
        muzik = inp.nextDouble();

        System.out.print("Beden Notunuz: ");
        beden = inp.nextDouble();

        ortalama = (turkce + mat + sosyal + fen + muzik + beden) / 6 ;

        System.out.println("Ortalamanız: " + ortalama );

        System.out.print(ortalama > 60 ? "Sınıfı Geçti" : "Sınıf Tekrarı");

    }
}