package EntradaEstandarScanner;

import java.util.Scanner;

    public class Main {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Hola, Com et dius? ");

            String nom = sc.nextLine();

            System.out.print("Hola " + nom);
            System.out.print("!");

        }
}
