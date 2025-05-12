//Main class to demonstrate the creation and use of objects.

public class OfficeApp {
    public static void main(String[] args) {
        // instantiating objects
        SalesPerson jim = new SalesPerson("Jim", 1000, 500);
        SalesPerson dwight = new SalesPerson("Dwight", 2500, 752);
        SalesPerson ryan = new SalesPerson();
        SalesPerson john = new SalesPerson("Jon", 3256.65, 2864);
        SalesPerson Pam = new SalesPerson("Pam", 65.5, 15);


        OfficeManager micheal = new OfficeManager("Michael", 754.54);
        OfficeManager assistantToTheManager = new OfficeManager("Mr.Scrutte",12500.5 );


        Warehouse scrantonWarehouse = new Warehouse(125000);

        //Using methods
        jim.increaseSales(1500, 29.95);
        scrantonWarehouse.updatePaperSupply(1500);
        dwight.increaseSales(750, 25.85);
        scrantonWarehouse.updatePaperSupply(700);
        micheal.organizeMeeting("conflict resolution", "conference room");
        micheal.setTimeWasted(1505.34);
        micheal.organizeMeeting("Is Water Wet??","Confrerence room" );

        assistantToTheManager.organizeMeeting("Identity Theft is a crime", "Warehouse");
        assistantToTheManager.organizeMeeting("Beets are the answer", "Cafeteria");






































































        

        //Printing Details
        assistantToTheManager.printDetails();
        jim.printDetails();
        dwight.printDetails();
        ryan.printDetails();
        micheal.printDetails();
        System.out.println("The warehouse has " + scrantonWarehouse.getPaperSupply() + " reams of paper.");



    }
}
