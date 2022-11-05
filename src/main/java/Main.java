import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        System.out.println("Ingrese los valores del rectangulo 1 : (x1, y1, w1, h1)");
        Scanner entrada = new Scanner(System.in);
        int x1 = entrada.nextInt();
        int y1 = entrada.nextInt();
        int w1 = entrada.nextInt();
        int h1 = entrada.nextInt();

        System.out.println("Ingrese los valores del rectangulo 2 : (x2, y2, w2, h2)");
        int x2 = entrada.nextInt();
        int y2 = entrada.nextInt();
        int w2 = entrada.nextInt();
        int h2 = entrada.nextInt();

        System.out.println("Valores de rectangulo 1: (" + x1 + ", " + y1 + ", "
                + w1 + ", " + h1 + ") ");

        System.out.println("*********************");

        System.out.println("Valores de rectangulo 2: (" + x2 + ", " + y2 + ", "
                + w2 + ", " + h2 + ") ");

        if(Main.detectarChoque(x1, y1, w1, h1, x2, y2, w2, h2)) {
            System.out.println("Hay Choque entre los rectangulos.");
        }
        else {
            System.out.println("No Hay Choque entre los rectangulos.");
        }

    }

    public static boolean detectarChoque(int x1, int y1, int w1, int h1, int x2, int y2, int w2, int h2) {
        return x1 + w1 >= x2 && x1 <= x2 + w2 && y1 + h1 >= y2 && y1 <= y2 + h2 ? true : false;
    }

}