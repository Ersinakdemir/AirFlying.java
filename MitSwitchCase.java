package Projects.P03_UcusProjesi;

import java.util.Locale;
import java.util.Scanner;

public class MitSwitchCase {
  static  Scanner scan =new Scanner(System.in);
    public static void main(String[] args) {
        /*
    A şehrinden uçmak isteyen bir yolcu B şehrine 500km C şehrine  700km  D şehrine  900 km mesafededir.
    Bilet tarifesi:
    km birim fiyati : 0.10$
    yolcu 12 yasindan kucukse toplam fiyat %50 indirim,
    12 ve 24 yas arasindaysa 10% indirim,
    65 yasindan buyukse 30% indirim,
    bilet gidis donus alinirrsa 20% indirim uygulayan bi app create ediniz

 */
        // sehir sectirelim
        //Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen hangi sehre gideceginizi seciniz");
        String sehir = scan.next().toUpperCase(Locale.ROOT);
        switch (sehir){
            case "B":
                double indirim =indirimHesapla();
                System.out.println("kazandiginiz indirim %"+indirim+"\nIndirimli fiyatiniz : "+
                        ((500*0.1)-500*0.1*indirim/100));
                break;
            case "C":
                 indirim =indirimHesapla();
                System.out.println("kazandiginiz indirim %"+indirim+"\nIndirimli fiyatiniz : "+
                        ((700*0.1)-700*0.1*indirim/100));
                break;
            case "D":
                indirim =indirimHesapla();
                System.out.println("kazandiginiz indirim %"+indirim+"\nIndirimli fiyatiniz : "+
                        ((900*0.1)-900*0.1*indirim/100));
                break;
            default:
                System.out.println("lütfen gideceginiz sehri seciniz");
        }

    }

    private static <scan> double indirimHesapla() {
        System.out.println("lütfen tekyön icin 1'i \nCift yön icin 2'i tuslayiniz");
        //Scanner scan = new Scanner(System.in);
        int yön = scan.nextInt();
        double indirim = 0;
        int yönIndirim = 0;
        int yasIndirim = 0;
        System.out.println("Lütfen yasinizi giriniz");
        //Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();
        if (yön == 1) {
            if (age <= 12) {
                yasIndirim = 50;
            }else if (age > 12 && age < 24) {
                yasIndirim = 10;
            }else if (age >= 65) {
                yasIndirim = 30;
            }
            indirim = yasIndirim + yönIndirim;
        } else if (yön == 2) {
            yönIndirim = 20;
            if (age <= 12) {
                yasIndirim = 50;
            } else if (age > 12 && age < 24) {
                yasIndirim = 10;
            } else if (age >= 65) {
                yasIndirim = 30;
            }
            indirim = yasIndirim + yönIndirim;

        } else {
            System.out.println("lütfen yön seciminizi yapiniz");
            //  indirimHesapla();
        }
        return indirim ;
    }
}
