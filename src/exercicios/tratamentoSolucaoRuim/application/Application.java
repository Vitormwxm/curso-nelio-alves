package exercicios.tratamentoSolucaoRuim.application;

import exercicios.tratamentoSolucaoRuim.model.entities.Reservation;

import javax.xml.transform.Source;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Room number: ");
        int number = scanner.nextInt();
        System.out.println("Check-in date: ");
        Date checkin = sdf.parse(scanner.next());
        System.out.println("Checkout date: ");
        Date checkout = sdf.parse(scanner.next());

        if (!checkout.after(checkin)) {
            System.out.println("Error in reservation: Checkout date must be after checkin date");
        } else {
            Reservation reservation = new Reservation(number, checkin, checkout);
            System.out.println("reservation: " + reservation);

            System.out.println("Update Dates: ");
            checkin = sdf.parse(scanner.next());
            System.out.println("Checkout date: ");
            checkout = sdf.parse(scanner.next());

            String error = reservation.updateDates(checkin, checkout);
            if (error != null) {
                System.out.println("Error in reservation: " + error);
            } else {
                System.out.println("reservation: " + reservation);
            }
        }

        scanner.close();
    }
}
