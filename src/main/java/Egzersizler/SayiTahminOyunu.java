package Egzersizler;

import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;

public class SayiTahminOyunu {

    public static void main(String[] args) {
        mainMethod();
    }

    public static void mainMethod() {
        int randomNum = generateRandomNumber(0, 10);
        int inputNumber = userNumber();
        //inputControl(inputNumber);
        checkNumbers(inputNumber, randomNum);
    }

    public static Integer generateRandomNumber(int min, int max) {
        Random random = new Random();
        int randomNumber = random.nextInt((max - min) + 1) + min;
        System.out.println("Rastgele üretilen sayı = " + randomNumber);
        return randomNumber;
    }

    public static Integer userNumber() {
        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen 0 ile 10 arasında bir sayı (10 dahil) tahmininde bulunun:");
        int number;
        while (true) {
            try {
                number = input.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Hatalı giriş! Lütfen bir sayı girin.");
                input.next(); // Hatalı girişi temizle
            }
        }
        System.out.println("Girmiş olduğunuz sayı = " + number);
        return number;
    }

    public static void checkNumbers(int number, int randomNumber) {
        if (number >= 0 && number <= 10) {
            int counter = 3;
            while (counter > 0) {
                if (number == randomNumber) {
                    System.out.println("Tahmininiz doğru.");
                    break;
                } else {
                    System.out.println("Tahmininiz yanlış!");
                    if (counter == 1) {
                        System.out.println("Hakkınız kalmamıştır.");
                        break;
                    } else {
                        System.out.println("Kalan Hakkınız : " + (--counter));
                        number = userNumber();
                        if (number < 0 || number > 10) {
                            System.out.println("Girilen sayı 0 ile 10 arasında olmalıdır.");
                            counter++; // Hatalı giriş yapıldığında counter'ın azalmaması için counter değerini geri arttırıyoruz
                        }
                    }
                }
            }
        } else {
            System.out.println("Girilen sayı 0 ile 10 arasında olmalıdır.");
            number = userNumber();
            checkNumbers(number, randomNumber);
        }
    }

    public static void inputControl(int number) {
        if (!(number >= 0 && number <= 10)) {
            System.out.println("Girilen sayı 0 ile 10 arasında olmalıdır.");
        }
    }
}
