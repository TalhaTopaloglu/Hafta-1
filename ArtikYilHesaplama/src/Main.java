import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int year;

        System.out.print("Yıl Giriniz : "); //kullanıcıdan yılı alıyoruz.
        year = input.nextInt();

        if(year % 400 == 0){ // 400e bölünmesini bakıyoruz eğer 400e tam bölünen yıllar
            System.out.println(year + " bir artık yıldır");
        }
        else if(year % 4 == 0 && year % 100 != 0){  // 4 tam bölünüp 100ün katı olmayan yıllar
            System.out.println(year + " bir artık yıldır");
        }
        else {      // 400e bölünmeyip 100e bölünen ve 4e bölünmeyenleri kapsayan yıllar
            System.out.println(year +  " bir artık yıl değildir");
        }
    }
}