package hmw1_q4;

import java.util.Scanner; // import the Scanner class

public class Soru4 {

    public static void main(String args[]) {

        double sayi = 0;
        int secim = 0;
        boolean dogruSayi = false;

        Scanner in = new Scanner(System.in);

        while (!dogruSayi) {

            System.out.println("Ondalıklı bir sayı giriniz.");
            sayi = in.nextDouble();
            if ((sayi % 1) == 0) {
                System.out.println("Ondalıklı bir sayı giriniz.");
                sayi = in.nextDouble();
                continue;
            }
            System.out.println("Belirttiğiniz sayı: " + sayi);
            break;
        }

     while (!dogruSayi) {
            System.out.println("Belirttiğiniz sayının hangi yönlü yuvarlanmasını tercih edersiniz?: ");
            System.out.println("1. Aşağı");
            System.out.println("2. Yukarı");
            secim = in.nextInt();

            if (secim == 1) {
                System.out.println("Seçiminize göre yuvarlanan sayı: " + Math.floor(sayi));
            } else if (secim == 2) {
                System.out.println("Seçiminize göre yuvarlanan sayı: " + Math.ceil(sayi));
            } else if (secim > 2 || secim < 1) {
                System.out.println("Tekrar deneyiniz.");
                continue;
             }
            break;
        }
    }
}


