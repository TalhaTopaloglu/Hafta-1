import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int number, sum=0;

        do{
            System.out.print("Sayı Giriniz: ");
            number = inp.nextInt();

            for(int i = 0; i <= number; i++){
                if(i % 4 == 0){
                    System.out.println(i);
                    sum += i;
                }
            }
        }while(number %2 == 0);

        System.out.println("Tek sayı girdiğiniz için program sonlandı, 4e bölünen ve çift olan sayıların toplamları " + sum);;
    }
}