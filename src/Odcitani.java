import java.util.Random;
import java.util.Scanner;

public class Odcitani {

    static Scanner sc = new Scanner(System.in);
    static Random rnd = new Random();

    public static int Odecet(int c1, int c2){
        c1 = rnd.nextInt(100);
        c2 = rnd.nextInt(100);
        int soucet1 = c1 - c2;
        System.out.println("Kolik je "+c1+" - "+c2+"?");
        int odpoved = sc.nextInt();

        if(odpoved == soucet1){
            System.out.println("Správná odpověď.");
            Main.spravne++;
            System.out.println("Máš "+ Main.spravne+" správných odpovědí.");
        }else{
            System.out.println("Špatná odpověď.");
            Main.spatne++;
            System.out.println("Máš "+ Main.spatne+" špatných odpovědí.");

        }
        System.out.println("----------------------------------");
        return Main.spravne;



    }
}

