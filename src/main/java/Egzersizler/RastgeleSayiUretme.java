package Egzersizler;

import java.util.Random;

public class RastgeleSayiUretme {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(21 - 10 + 1) + 10; //Burada kullanılan +1 ifadesi 21 in de dahil olması için kullanılrı

        System.out.println("Rastgele sayı: " + randomNumber);
    }
}
