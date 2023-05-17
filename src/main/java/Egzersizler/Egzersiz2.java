package Egzersizler;

import java.util.Scanner;

public class Egzersiz2 {

    public static void userNumbers(){
        Scanner klavye = new Scanner(System.in);
        System.out.println("1. sayıyı giriniz:");
        int number1 = klavye.nextInt();
        System.out.println("2. sayıyı giriniz:");
        int number2  = klavye.nextInt();
        //System.out.println("Girmiş olduğunuz sayılar=" + number1 + number2);
    }

    public static void islem(){

    }
    public static void main(String[] args) {
        userNumbers();


    }
}
