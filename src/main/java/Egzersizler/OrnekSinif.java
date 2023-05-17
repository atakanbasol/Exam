package Egzersizler;
import java.util.Scanner;

public class OrnekSinif {

    public static void main(String[] args) {
        OrnekSinif ornek = new OrnekSinif();
        ornek.userNumbers();
    }

    public void userNumbers() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci sayıyı girin: ");
        int sayi1 = scanner.nextInt();

        System.out.print("İkinci sayıyı girin: ");
        int sayi2 = scanner.nextInt();

        scanner.close();

        islem(sayi1, sayi2); //Burada islem fonksiyonunu çağrıdık
    }

    public void islem(int sayi1, int sayi2) {
        int toplam = sayi1 + sayi2;
        System.out.println("Sayıların toplamı: " + toplam);
    }
}
