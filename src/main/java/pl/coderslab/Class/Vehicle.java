package pl.coderslab.Class;

public class Vehicle {

    private int id;
    private String model;
    private String mark;
    private int year;
    private String registrationNumber;
    private String dateOfNextVisit;

    public Vehicle() {
    }

    public Vehicle(String model, String mark, int year, String registrationNumber, String dateOfNextVisit) {
        this.model = model;
        this.mark = mark;
        this.year = year;
        this.registrationNumber = registrationNumber;
        this.dateOfNextVisit = dateOfNextVisit;
    }

    public Vehicle(int id, String model, String mark, int year, String registrationNumber, String dateOfNextVisit) {
        this.id = id;
        this.model = model;
        this.mark = mark;
        this.year = year;
        this.registrationNumber = registrationNumber;
        this.dateOfNextVisit = dateOfNextVisit;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() { return id; }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getDateOfNextVisit() {
        return dateOfNextVisit;
    }

    public void setDateOfNextVisit(String dateOfNextVisit) {
        this.dateOfNextVisit = dateOfNextVisit;
    }
}
