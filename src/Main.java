import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String username, password;
        int hak = 3, balance = 1500, select,miktar;

        Scanner oku = new Scanner(System.in);


        while (hak > 0) {

            System.out.println("Kullanici Adiniz: ");
            username = oku.nextLine();

            System.out.println("Sifernizi giriniz : ");
            password = oku.nextLine();

            if (username.equals("patika") && password.equals("dev123")) {
                System.out.println("Merhaba, Kodluyoruz bankasina Hos Geldiniz! ");
                do {
                    System.out.println("\nYapmak istediginiz islemi secin ?");
                    System.out.println("1- Para Yatirma\n2- Para Cekme\n3-Bakiye Sorgulama\n4- Cikis Yap");
                    select = oku.nextInt();
                    switch (select){
                        case 1:
                            System.out.println("Hesabiniza yatirmak istediginiz para miktari giriniz: ");
                            miktar=oku.nextInt();
                            balance+=miktar;
                            System.out.println("güncel bakiyeniz = "+balance);
                            break;
                        case 2:
                            System.out.println("Hesabinizdan cekmek istediginiz para miktarini giriniz: ");
                            miktar= oku.nextInt();
                            if(balance>=miktar){
                                balance-=miktar;
                                System.out.println("Para hazirlaniyor...\nGüncel bakiyeniz = "+balance);
                            }else {
                                System.out.println("Hesabinizda yeterli miktar yok.");
                            }
                            break;
                        case 3:
                            System.out.println("Guncel bakiyeniz = "+balance);
                            break;
                        case 4:
                            System.out.println("cikis yapılıyor. Gule Gule");
                            break;
                        default:
                            System.out.println("Hatali bir giris yaptiniz.");


                    }
                } while (select != 4);
                break;
            } else {
                System.out.println("Kullanici adi ya da sifre hatali. Tekrar deneyiniz.");
                System.out.println("kalan hakkiniz : " + --hak);

                if (hak == 0) {
                    System.out.println("Hesabiniz bloke oldu. Aktif etmek icin bankanizi arayiniz.");
                }
            }
        }




    }
}