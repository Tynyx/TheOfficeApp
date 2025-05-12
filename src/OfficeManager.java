// Class: OfficeManager
// Represent the office manager. who calls meetings and waste time.

public class OfficeManager {

    private String name;

    private double timeWasted;

    // Constructors
    public OfficeManager(String name, double timeWasted) {
        this.name = name;
        this.timeWasted = timeWasted;
    }

    //Getters and Setters
    public String getName() {
        return name;
    }

    public double getTimeWasted() {
        return timeWasted;
    }

    public void setTimeWasted(double timeWasted) {
        this.timeWasted = timeWasted;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Custom method: organizeMeeting
    // Purpose: to display a message with a meeting's purpose and location
    public void organizeMeeting(String meetingReason, String meetingLocation) {
        System.out.println(name + " is organizing a meeting for " + meetingReason + " in the " + meetingLocation + " .");
    }

    public void printDetails() {
        System.out.println("Office Manager " + name + " has wasted " + timeWasted + " minutes this year.");
    }
}
