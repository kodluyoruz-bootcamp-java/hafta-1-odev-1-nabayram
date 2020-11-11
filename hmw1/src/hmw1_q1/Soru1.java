package hmw1_q1;

public class Soru1 {

    public static void main(String[] args) {

        int n = 2000;
        int toplam = 0;
        int count = 0;

       for (int i = 0; i < n; i++) {
           if(i % 3 == 0 && i % 5 == 0 && i % 7 == 0 && i % 53 == 0) {
               toplam += i;
               count++;
           }
       }
        System.out.println("Ortalama: " + (toplam / count));
    }
}
