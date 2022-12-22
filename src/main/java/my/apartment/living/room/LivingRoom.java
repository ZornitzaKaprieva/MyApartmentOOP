package my.apartment.living.room;

import my.apartment.MyApartmentOOP;

public class LivingRoom extends MyApartmentOOP {
    private int table; //засега само тези 2 сетери и гетери + if
    private String tableColor;  //засега само тези 2 + if (in method overloading)
    private int diningChair;
    private String diningChairColor;
    private String carpet;
    private String sofaColor;
    private int coffeeTable;
    private String coffeeTableColor;
    private int cabinets;
    private String cabinetsColor;


    public int getTable() {
        return table;
    }

    public void setTable(int table) {
        if (table > 0) {
            this.table = table;
        } else if (table == 0) {
            System.out.println("There are no tables in the room.");

        }
    }

    public String getTableColor() {
        return tableColor;
    }

    public void setTableColor(String tableColor) {
        if (!tableColor.isEmpty() && !tableColor.isBlank()) {
            this.tableColor = tableColor;
        } else {
            System.out.println("Please enter a table color.");
        }
    }

    public void introduction() {
        System.out.println("There are several rooms in my apartment. The first of them is the living room.");
    }

    //method overriding:
    public void printData() {
        System.out.println("Are there windows in the living room?: " + super.isWindows() + "\nIs there a balcony in the living room: " + super.isBalconies() + "\nThe flooring in the living room is: " + super.getFlooring() + "\nAre there curtains in the living room: " + super.isCurtains() + "\nThe color of the curtains in the living room is: " + super.getCurtainsColor() + "\nHow many lamps are there in the living room?: " + super.getLamps() + "\nHow many paintings are there in the living room? " + super.getPaintings(1));
    }      //super.getPaintings(1)); - само тук изисква да въведа номер, но той не влия не setDetailsForLivingRoom. Защо?

    public void printLivingRoom() {
        System.out.printf("\nThere is %d table in the living room. Its color is %s.\n", table, tableColor);
    }

    public void printLivingRoom(boolean printColorsOnly) {
        if (printColorsOnly) {
            System.out.printf("The color of the table is %s.\n", tableColor);
        } else {
            printLivingRoom();
        }
    }
}
