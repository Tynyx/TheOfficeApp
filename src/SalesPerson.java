// Class: SalesPerson
//Represents a salesperson in the office. the salesperson is able to make and record sales.


public class SalesPerson {
    // Attributes
    private String name;
    private double salesFigure;
    private int reams_sold;

    // Constructor
    public SalesPerson(String name, double salesFigure, int reams_sold) {
        this.name = name;
        this.salesFigure = salesFigure;
        this.reams_sold = reams_sold;
    }

    // Overlaod Constructor
    // An overloaded constructor in Java is a concept where a class has more than one
    // constructor, each having a different number of parameters or different types of
    // parameters.

    public SalesPerson() {
        this.name = "Ryan";
        this.salesFigure = 10.50;
        this.reams_sold = 5;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalesFigure() {
        return salesFigure;
    }

    public void setSalesFigure(double salesFigure) {
        this.salesFigure = salesFigure;
    }

    public int getReams_sold() {
        return reams_sold;
    }

    public void setReams_sold(int reams_sold) {
        this.reams_sold = reams_sold;
    }

    // Custom method: Increase sales
    public void increaseSales(double amountOfReams, double price) {
        this.reams_sold += amountOfReams;
        this.salesFigure += amountOfReams * price;
    }

    // Print Method
    public void printDetails() {
        System.out.println("SalesPerson Name: " + name + "\nSales Figure: " + salesFigure + "\nTotal Reams sold: " + reams_sold);
    }
}
