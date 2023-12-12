import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int select;

        System.out.println("Sıcaklık Durumunu Seçiniz ? \n\n1 -Sıcaklık 5 derece altında.\n2 -Sıcaklık 5 ile 15 derece arası.\n3 -Sıcaklık 15 ile 25 derece arasında.\n4 -Sıcaklık 25 dereceden fazla.");
        select = input.nextInt();

        switch (select){
            case 1:
                System.out.println("Kayak yapmaya gidebilirsin.");
                break;
            case 2:
                System.out.println("Sinemaya gidebilirsin");
                break;
            case 3:
                System.out.println("Pikniğe gidebilirsin.");
                break;
            case 4:
                System.out.println("Yüzmeye Gidebilirsin");
                break;
        }
    }
}