import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int month,day;  // ay ve gün değişkeni belirliyoruz.
        String burc;    // burc değişkeniyle burcları bir değişkene tanımlıyoruz.

        System.out.print("Doğduğunuz Ay: ");  // kullanıcıdan doğduğu ayı alıyoruz.
        month = input.nextInt();

        System.out.print("Doğduğunuz Gün :");  // kullanıcıdan doğduğu günü alıyoruz.
        day = input.nextInt();

        if(month == 1 && day > 0 && day <= 31) {  // Ocak Ayını ve günlerin 31e kadar olduğunu söylüyoruz.
            if(day <= 21){
                burc = "Oğlak";
            }
            else{
                burc = "Kova";
            }
        }else if(month == 2 && day > 0 && day <= 28){  // Şubak Ayını ve günlerin 28e kadar olduğunu söylüyoruz.
            if(day <= 19){
                burc = "Kova";
            }
            else{
                burc = "Balık";;
            }
        }else if(month == 3 && day > 0 && day <= 31){  // Mart Ayını ve günlerin 31e kadar olduğunu söylüyoruz.
            if(day <=20){
                burc = "Balık";
            }
            else{
                burc = "Koç";
            }
        }else if(month == 4 && day > 0 && day <= 30){  // Nisan Ayını ve günlerin 30a kadar olduğunu söylüyoruz.
            if(day <= 20){
                burc = "Koç";
            }
            else{
                burc = "Boğa";
            }
        }else if(month == 5 && day > 0 && day <= 31){  // Mayıs Ayını ve günlerin 31e kadar olduğunu söylüyoruz.
            if(day <= 21){
                burc = "Boğa";
            }
            else{
                burc = "İkizler";
            }
        }else if(month == 6 && day > 0 && day <= 30){  // Haziran Ayını ve günlerin 30a kadar olduğunu söylüyoruz.
            if(day <= 22){
                burc = "İkizler";
            }
            else{
                burc = "Yengeç";
            }
        }else if(month == 7 && day > 0 && day <= 31){  // Temmuz Ayını ve günlerin 31e kadar olduğunu söylüyoruz.
            if(day <= 22){
                burc = "Yengeç";
            }
            else{
                burc = "Aslan";
            }
        }else if(month == 8 && day > 0 && day <= 31){  // Ağustos Ayını ve günlerin 31e kadar olduğunu söylüyoruz.
            if(day <= 22){
                burc = "Aslan";
            }
            else{
                burc = "Başak";
            }
        }else if(month == 9 && day > 0 && day <= 30){  // Eylül Ayını ve günlerin 30a kadar olduğunu söylüyoruz.
            if(day <= 23){
                burc = "Başak";
            }
            else{
                burc = "Terazi";
            }
        }else if(month == 10 && day > 0 && day <= 31){  // Ekim Ayını ve günlerin 31e kadar olduğunu söylüyoruz.
            if(day <= 22){
                burc = "Terazi";
            }
            else{
                burc = "Akrep";
            }
        }else if(month == 11 && day > 0 && day <= 30){  // Kasım Ayını ve günlerin 30a kadar olduğunu söylüyoruz.
            if(day <= 21){
                burc = "Akrep";
            }
            else{
                burc = "Yay";
            }
        }else if(month == 12 && day > 0 && day <= 31){   // Aralık Ayını ve günlerin 31e kadar olduğunu söylüyoruz.
            if(day <= 21){
                burc = "Yay";
            }
            else{
                burc = "Oğlak";
            }
        }else {     // else ile belirtilen aralık dışında geçersiz tarih girildiğinde uyaran bir kontrol mekanizması
            System.out.println("Geçersiz Tarih Girdiniz");
            burc = "Bulunamadı.";
        }

        System.out.println("Burcunuz :" + burc); // burcu ekrana bastırıyoruz.
    }

}