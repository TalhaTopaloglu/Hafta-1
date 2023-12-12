import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    String userName,password;

    Scanner input = new Scanner(System.in);
    System.out.print("Kullanıcı Adını Giriniz: ");
    userName = input.nextLine();
    System.out.print("Şifreyi Giriniz: ");
    password = input.nextLine();

    if(userName.equals("Patika") && password.equals("dev123")){
        System.out.println("Giriş Başarılı");
    }
    else{
        System.out.println("Hatalı Şife. Şifreyi Yenilemek İster misiniz? \n1-Evet \n2-Hayır");
        int yesOrNo = input.nextInt();

        switch (yesOrNo){
            case 1:
                System.out.print("Yeni Şifreyi Giriniz: ");
                String newPassword = input.next();

                if(newPassword.equals(password)){
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                }
                else {
                    System.out.println("Şifre Başarıyla Oluşturuldu.");
                }
                break;
            case 2:
                System.out.println("Çıkış Yapıldı.");
                break;
          }
       }
    }
}