package EntradaEstandarScanner;
import java.util.Scanner;

public class tiposDeDatos {

        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);

            System.out.println("Introduce el primer número ");
            int num = sc.nextInt();
            System.out.println("Introduce el segundo número ");
            int num1= sc.nextInt();

            System.out.println("Has escrito " + num + " " + num1 );
        }

}
