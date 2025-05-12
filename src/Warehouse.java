//Warehouse Class
//This class will track the supply of paper reams in the warehouse

public class Warehouse {
   private int paperSupply;


   // Constructor
    public Warehouse(int paperSupply) {
        this.paperSupply = paperSupply;

    }


    //overloaded constructor
    public Warehouse() {
        this.paperSupply = 10000;
    }

    // Setters and Getters
    public int getPaperSupply() {
        return paperSupply;
    }

    public void setPaperSupply(int paperSupply) {
        this.paperSupply = paperSupply;
    }

    //custom method: updatePaperSupply
    //Purpose: when paper is sold, we must update the amount of supply is available
    public void updatePaperSupply(int paperSupply) {
        this.paperSupply -= paperSupply;
        System.out.println("The current paper supply is : " + this.paperSupply);
    }


}
