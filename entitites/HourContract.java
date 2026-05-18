package ProjectContracts.entitites;

import java.time.LocalDate;

public class HourContract {

    // Attributes
    private LocalDate date;
    private Double valuePerHour;
    private Integer hours;

    // Constructors
    public HourContract(LocalDate date, Double valuePerHour, Integer hours) {
        this.date = date;
        this.valuePerHour = valuePerHour;
        this.hours = hours;
    }

    // Getters and Setters
    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    // Methods
    public double totalValue() {
        return valuePerHour * hours;
    }
}
