package MenuAgenda;

import java.util.Scanner;

public class MostrarUnaOpcionAgenda {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);



            System.out.println("Wellcome to the agenda, please choose an option: ");

            System.out.println("1. Create a new contact.");
            System.out.println("2. Search for existing contacts.");
            System.out.println("3. Update an existing contact.");
            System.out.println("4. Delete an existing contact.");
            System.out.println("5. Exit");


            int opcion = sc.nextInt();


            System.out.println("option :" + opcion);




        }



}
