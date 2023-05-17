package Egzersizler;
import java.util.Scanner;

public class PasswordCheck {

    public static void userPassword() {
        Scanner klavye = new Scanner(System.in);

        System.out.println("1. Şifrenizi girin: ");
        String sifre = klavye.next();

        userSecondPassword(sifre);
    }

    public static void userSecondPassword(String sifre) {
        Scanner klavye2 = new Scanner(System.in);

        System.out.println("2. Şifrenizi girin: ");
        String sifre2 = klavye2.next();

        klavye2.close();

        checkPassword(sifre, sifre2);
    }

    public static void checkPassword(String sifre, String sifre2) {
        if (sifre.equals(sifre2)) {
            System.out.println("Şifre doğru.");
        } else {
            System.out.println("Girilen şifre yanlış.");
        }
    }

    public static void main(String[] args) {
        userPassword();
    }
}


