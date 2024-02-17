import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String kullaniciAdi;
        String sifre;
        Scanner scan = new Scanner(System.in);
        int sayac = 3;
        int secim;
        int bakiye = 1500;


        while (sayac > 0) {

            System.out.print("kullanıcı adınızı giriniz: ");
            kullaniciAdi = scan.nextLine();
            System.out.print("Şifrenizi giriniz: ");
            sifre = scan.nextLine();

            if (kullaniciAdi.equals("patika") && sifre.equals("java123")) {
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");

                do {
                    System.out.println("1-para yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap");
                    System.out.print("lütfen yapmak istediğiniz işlemi seçiniz:");
                    secim = scan.nextInt();

                    switch (secim) {
                        case 1:
                            System.out.println("yatırmak istediğiniz mikratı giriniz:");
                            int miktar = scan.nextInt();
                            bakiye += miktar;

                            break;
                        case 2:
                            System.out.println("çekmek istedğiniz miktar: ");
                            int cekilen = scan.nextInt();
                            if (cekilen > bakiye) {
                                System.out.println("yetersiz bakiye :(");
                            } else {
                                 bakiye-=cekilen;
                            }
                            break;
                        case 3:
                            System.out.println("bakiyeniz :" + bakiye);
                            break;
                        case 4:
                            System.out.println("tekrar görüşmek üzere :)");
                            break;
                        default:
                            System.out.println("geçersiz işlem");
                    }
                } while (sayac != 4);
                break;
            } else {
                sayac--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                if (sayac == 0) {
                    System.out.println("hesabınız bloke olmuştur banka ile iletişime geçiniz ");
                }else {
                    System.out.println("kalan hakkınız: "+sayac);
                }
            }

        }


    }
}