package exercicios.tratamentoSolucaoRuim.model.entities;

import exercicios.tratamentoSolucaoRuim.model.exceptions.DomainException;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
    private Integer roomNumber;
    private Date checkIn;
    private Date checkOut;

    // precisa apenas de um simpleDateFormat por isso esse método é estático.
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Reservation(Integer roomNumber, Date checkIn, Date checkOut) throws DomainException{
        if (!checkOut.after(checkIn)) {
            throw new DomainException ("Checkout date must be after check-in date");
        }

        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public long duration() {
        long diff = checkOut.getTime() - checkIn.getTime(); // devolve quantidade de milissegundos
        long timeInDays = TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS); // converte milissegundos para dias
        return timeInDays;
    }

    public void updateDates(Date checkIn, Date checkOut) throws DomainException {

        Date now = new Date();
        if (checkIn.before(now) || checkOut.before(now)) {
            throw new DomainException("Reservation dates for updates must be future"); // Illegal é erros no argumento do método
        }

        if  (!checkOut.after(checkIn)) {
            throw new DomainException("Error in reservation: Checkout date must be after checkin date");
        }

        this.checkIn = checkIn;
        this.checkOut = checkOut;

    }

    @Override
    public String toString() {
        return "Room " + roomNumber
                + " , checkIn: "
                + sdf.format(checkIn)
                + ", checkout: "
                + sdf.format(checkOut) + " ,"
                + duration() + " Nights";

    }
}
