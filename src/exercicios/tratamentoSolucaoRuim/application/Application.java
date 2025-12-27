package exercicios.tratamentoSolucaoRuim.application;

import exercicios.tratamentoSolucaoRuim.model.entities.Reservation;
import exercicios.tratamentoSolucaoRuim.model.exceptions.DomainException;

import javax.xml.transform.Source;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            System.out.println("Room number: ");
            int number = scanner.nextInt();
            System.out.println("Check-in date: ");
            Date checkin = sdf.parse(scanner.next());
            System.out.println("Checkout date: ");
            Date checkout = sdf.parse(scanner.next());

            System.out.println("Error in reservation: Checkout date must be after checkin date");

            Reservation reservation = new Reservation(number, checkin, checkout);
            System.out.println("reservation: " + reservation);

            System.out.println("Update Dates: ");
            checkin = sdf.parse(scanner.next());
            System.out.println("Checkout date: ");
            checkout = sdf.parse(scanner.next());

            reservation.updateDates(checkin, checkout);

            System.out.println("reservation: " + reservation);
        } catch (ParseException e) {
            System.out.println("Invalid date format");
            e.printStackTrace();
        } catch (DomainException e) {
            System.out.println("Error in reservation: " + e.getMessage());
        }



        scanner.close();
    }
}
