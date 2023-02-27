package entities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Installment {

    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private LocalDate date;
    private double amount;

    public Installment()
    {

    }

    public Installment(LocalDate date, double amount)
    {
        this.date = date;
        this.amount = amount;
    }

    public LocalDate getDate()
    {
        return date;
    }

    public void setDate(LocalDate date)
    {
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String toString()
    {
        return date.format(fmt) + " - "+ String.format("%.2f",amount);
    }
}
