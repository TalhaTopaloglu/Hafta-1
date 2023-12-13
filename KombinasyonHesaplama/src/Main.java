import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n,r, resultN = 1, resultR = 1, resultC=1, result ;
        System.out.print("Toplam Eleman Sayısı Giriniz: ");
        n = inp.nextInt();
        System.out.print("Kaç Elemanlı Grup : ");
        r = inp.nextInt();

        if(r>n){
            System.out.println("Hata toplam eleman sayısı oluşacak eleman sayısından büyük olamaz");

        }else {

            for(int i = 1; i<=n; i++ ){
                resultN *=i;
            }
            for(int i = 1; i<=r; i++){
                resultR *=i;
            }
            for(int i = 1; i<=n-r; i++){
                resultC *=i;
            }
            result = resultN / (resultR * resultC);
            System.out.print("C("+n+","+r+") = "+result);

        }
    }
}