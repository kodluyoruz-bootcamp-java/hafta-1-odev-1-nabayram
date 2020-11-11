package hmw1_q2;

public class Main {
    public static void main(String[] args) {

        Araba araba1 = new Araba();

        araba1.renk = "Siyah";
        araba1.motorhacmi = 1.2;
        araba1.beygirgucu = 100;
        araba1.yakit = "Benzin";
        araba1.sanziman = "AT";

        System.out.println("Arabanın rengi: " + araba1.renk);
        System.out.println("Arabanın motor hacmi: " + araba1.motorhacmi);
        System.out.println("Arabanın beygir gücü: " + araba1.beygirgucu);
        System.out.println("Arabanın kullandığı yakıt türü: " + araba1.yakit);
        System.out.printf("Arabanın şanzımanı: " + araba1.sanziman);
    }
}
