package my.apartment;

public class MyApartmentOOP { //Родителски клас. Общи белези за всички класове.
    private boolean windows;
    private boolean balconies;
    private String flooring; //in method overloading
    private boolean curtains;
    private String curtainsColor; //in method overloading
    private int lamps;
    private int paintings;

    // getters and setters:
    public boolean isWindows() {
        return windows;
    }

    public void setWindows(boolean windows) {
        this.windows = windows;
    }

    public boolean isBalconies() {
        return balconies;
    }

    public void setBalconies(boolean balconies) {
        this.balconies = balconies;
    }

    public String getFlooring() {
        return flooring;
    }

    public void setFlooring(String flooring) {
        if (!flooring.isEmpty() && !flooring.isBlank()) {
            this.flooring = flooring;
        } else {
            System.out.println("Please fill in the flooring details.");
        }
    }

    public boolean isCurtains() {
        return curtains;
    }

    public void setCurtains(boolean curtains) {
        this.curtains = curtains;
    }

    public String getCurtainsColor() {
        return curtainsColor;
    }

    public void setCurtainsColor(String curtainsColor) {
        this.curtainsColor = curtainsColor;
    }

    public int getLamps() {
        return lamps;
    }

    public void setLamps(int lamps) {
        if (lamps > 0) {
            this.lamps = lamps;
        } else if (lamps == 0) {
            System.out.println("There are no lamps in the room.");
        } else {
            System.out.println("Please enter correct data for the number of lamps.");
        }
    }

    public int getPaintings(int paintings) {
        return this.paintings;
    }

    public void setPaintings(int paintings) {
        if (paintings > 0) {
            this.paintings = paintings;
        } else if (paintings == 0) {
            System.out.println("There are no paintings in the room.");
        } else {
            System.out.println("Please enter correct data for the number of paintings.");
        }
    }
    //може да стане и със switch

    public void introduction(){
        System.out.println("There are several rooms in my apartment.");
    }

    public void printData() {
        System.out.printf("\nAre there windows in the room?: %b. \nIs there a balcony in the room: %b. \nThe flooring in the room is %s.\nAre there curtains in the room: %b. \nThe color of the curtains is %s. \nThere is in the room %d lamps. \nThere are %d paintings in the room.\n", windows, balconies, flooring, curtains, curtainsColor, lamps, paintings);
    }

    public void printData(boolean printFlooringAndCurtainsColorOnly) {
        if (printFlooringAndCurtainsColorOnly) {
            System.out.printf("The flooring in the room is %s. The color of the curtains is %s.\n", flooring, curtainsColor);
        } else {
            printData();
        }
    }
}

