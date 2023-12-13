import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int number,counter = 0;
        double result, sum = 0;

        System.out.print("Lütfen Sayı Giriniz: ");
        number = inp.nextInt();

        for(int i =1; i <= number;i++){
            if(i%12 == 0){
                counter++;
                sum += i;
            }
        }

        System.out.println(number + " sayısna kadar " + counter + " tane 3e ve 4e bölünen sayı vardır");
        System.out.println("Sayıların toplamı " + sum);
        counter = (counter > 0) ? counter : 1; // Eğer 3e ve 4e bölünen sayı yoksa hata almamak için counter'ı 1e eşitliyoruz.

        result = (sum/counter);

        System.out.println("Sonuç: "+ result);
    }
}