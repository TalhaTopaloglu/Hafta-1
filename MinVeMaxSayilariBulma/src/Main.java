import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Kaç tane sayı gireceksiniz: ");
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();        // kullanıcıdan kaç girdi gireceğini alıyoruz
        int max =0;     // max değeri 0a çekebiliyoruz
        int min =0;     // min değeri 0a çekebiliyoruz

        for(int i =1; i<=N; i++){
            System.out.print(i + ". Sayıyı Giriniz :");  // sayıları buraya giriyoruz.
            int number = input.nextInt();

            if(i==1){       // eğer 1 adet sayı varsa zaten hem en küçük hemde en büyük olduğunu gösteriyor.
                max = number;
                min = number;
            }
            if(number > max){       //  sayı yukarda atadığımız maxtan büyükse
                max = number;       //  sayıyı maksimumda çekiyoruz.
            }
            if(number < min){       // sayı yukarda atadığımız minde küçükse
                min = number;       //  sayıyı minimuma çekiyoruz.
            }
        }
        System.out.println("En büyük sayı: "+ max);
        System.out.println("En küçük sayı: "+ min);
    }
}