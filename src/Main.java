import java.util.Random;
import java.util.Scanner;

public class Main {
    public static int spravne;
    public static int spatne;
    public static void main(String[] args) {
        System.out.println("Vítej u zkoušení.");
        System.out.println("Budeš dostávat náhodně vygenerované příklady.");
        System.out.println("----------------------------------");

        for(int i = 0; i < 5; i++){
            Scitani.Soucet(1, 1);
        }
        System.out.println("Gratuluji, dodělal jsi sčítání, a jdeš na odčítání. Hodně štěstí!");
        System.out.println("----------------------------------");
        for(int i = 0; i < 5; i++){
            Odcitani.Odecet(1, 1);
        }







    }
}