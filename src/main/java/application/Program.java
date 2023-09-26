package application;

import entities.RentEntity;

import java.util.Scanner;
import java.util.Locale;

public class Program{
    public static void main( String[] args ){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        RentEntity[] vect = new RentEntity[10] ;

        System.out.print("How many rooms will be rented?");
        int quantityRented = sc.nextInt();

        for (int i = 1;  i <= quantityRented; i++){

            System.out.println("Rent #" + i + ": ");
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.next();
            System.out.print("Room: ");
            int roomNumber = sc.nextInt();

            vect[roomNumber] = new RentEntity(name, email);
        }

        System.out.println();
        System.out.println("Busy rooms: ");
        for (int i = 0; i < 10; i++){
            if (vect[i] != null){
            System.out.println(i + ": " + vect[i]);
            }
        }

        sc.close();
    }
}
