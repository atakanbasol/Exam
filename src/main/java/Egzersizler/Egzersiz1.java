package Egzersizler;

import java.util.Scanner;

public class Egzersiz1 {
    public static void main(String[] args) {
        System.out.println("3 tane kelime giriniz:");
        Scanner k = new Scanner(System.in);
        String kelime1 = k.nextLine();
        String kelime2 = k.nextLine();
        String kelime3 = k.nextLine();
        System.out.println("1.Kelime = " + kelime1 + "\n2.Kelime = " + kelime2 + "\n3.Kelime = " + kelime3);
    }
}
