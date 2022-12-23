package my.apartment.living.room;

import my.apartment.MyApartmentOOP;

public class LivingRoom extends MyApartmentOOP {
    private int table; //сетери и гетери + if на всички
    private String tableColor;  //in method overloading
    private int diningChair;
    private String diningChairColor;
    private String carpet;
    private String sofaColor;
    private int coffeeTable;
    private String coffeeTableColor;
    private int cabinets; //todo може да се опише съдържанието им в отделен клас.
    private String cabinetsColor;


    public int getTable() {
        return table;
    }

    public void setTable(int table) {
        if (table > 0) {
            this.table = table;
        } else if (table == 0) {
            System.out.println("There are no tables in the room.");
        } else {
            System.out.println("Please enter correct data for the number of tables.");
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

    public int getDiningChair() {
        return diningChair;
    }

    public void setDiningChair(int diningChair) {
        if (diningChair > 0) {
            this.diningChair = diningChair;
        }else if (diningChair == 0) {
            System.out.println("There are no dining chairs in the living room.");
        }else {
            System.out.println("Please enter correct data for the number of chairs.");
        }
    }

    public String getDiningChairColor() {
        return diningChairColor;
    }

    public void setDiningChairColor(String diningChairColor) {
        if (!diningChairColor.isEmpty() && !diningChairColor.isBlank()) {
            this.diningChairColor = diningChairColor;
        } else {
            System.out.println("Please enter a color for the chairs.");
        }
    }

    public String getCarpet() {
        return carpet;
    }

    public void setCarpet(String carpet) {
        if (!carpet.isBlank() && !carpet.isEmpty()) {
            this.carpet = carpet;
        }else {
            System.out.println("Please enter a color for the carpet.");
        }
    }

    public String getSofaColor() {
        return sofaColor;
    }

    public void setSofaColor(String sofaColor) {
        if(!sofaColor.isEmpty() && !sofaColor.isBlank()) {
            this.sofaColor = sofaColor;
        }else {
            System.out.println("Please enter sofa color");
        }
    }

    public int getCoffeeTable() {
        return coffeeTable;
    }

    public void setCoffeeTable(int coffeeTable) {
        if (coffeeTable > 0) {
            this.coffeeTable = coffeeTable;
        }else if (coffeeTable == 0) {
            System.out.println("There are no coffee table in the living room.");
        }else {
            System.out.println("Please enter correct data for the number of coffee tables.");
        }
    }

    public String getCoffeeTableColor() {
        return coffeeTableColor;
    }

    public void setCoffeeTableColor(String coffeeTableColor) {
        if (!coffeeTableColor.isBlank() && !coffeeTableColor.isEmpty()) {
            this.coffeeTableColor = coffeeTableColor;
        }else {
            System.out.println("Please enter coffee table color");
        }
    }

    public int getCabinets() {
        return cabinets;
    }

    public void setCabinets(int cabinets) {
        if(cabinets > 0) {
            this.cabinets = cabinets;
        } else if (cabinets == 0) {
            System.out.println("There are no cabinets in the living room.");
        } else {
            System.out.println("Please enter correct data for the number of cabinets.");
        }
    }

    public String getCabinetsColor() {
        return cabinetsColor;
    }

    public void setCabinetsColor(String cabinetsColor) {
        if (!cabinetsColor.isEmpty() && !cabinetsColor.isBlank()) {
            this.cabinetsColor = cabinetsColor;
        } else {
            System.out.println("Please enter cabinets color");
        }
    }

    public void introduction() {
        System.out.println("\nFrom LivingRoom: There are several rooms in my apartment. The first of them is the living room.");
    }

    //method overriding:
    public void printData() {
        System.out.println("\nFrom LivingRoom: Are there windows in the living room?: " + super.isWindows() + "\nIs there a balcony in the living room: " + super.isBalconies() + "\nThe flooring in the living room is: " + super.getFlooring() + "\nAre there curtains in the living room: " + super.isCurtains() + "\nThe color of the curtains in the living room is: " + super.getCurtainsColor() + "\nHow many lamps are there in the living room?: " + super.getLamps() + "\nHow many paintings are there in the living room? " + super.getPaintings(1));
    }      //super.getPaintings(1)); - само тук изисква да въведа номер, но той не влия не setDetailsForLivingRoom. Защо?

//    public void printData(boolean printFlooringAndCurtainsColorOnly) {
//        if (printFlooringAndCurtainsColorOnly) {
//            System.out.printf("\nSummary Living Room: The flooring in the living room is %s. The color of the curtains is %s.\n", super.getFlooring(), super.getCurtainsColor());
//        } else {
//            printData();
//        }
 //   }
    public void printLivingRoom() {
        System.out.printf("\nFrom LivingRoom: There is %d table in the living room. Its color is %s." +
                "\nThere is %d dining chairs in the living room. Their color is %s." +
                        "\nThe carpet in the living room is %s. The sofa in the living room is %s." +
                        "\nThere is %d coffee table in the living room. Its color is %s." +
                        "\nThere are %d cabinets in the living room. Their color is %s.\n",
                table, tableColor, diningChair, diningChairColor, carpet, sofaColor, coffeeTable, coffeeTableColor, cabinets, cabinetsColor);
    }

    public void printLivingRoom(boolean printColorsOnly) {
        if (printColorsOnly) {
            System.out.printf("\nSummary Living Room: The color of the dining table is %s and the coffee table is %s. " +
                    "The color of the chairs is %s" +
                    "\nThe carpet in the living room is %s. The sofa in the living room is %s." +
                            "\nThe color of the cabinets is %s.\n",
                    tableColor, coffeeTableColor, diningChairColor, carpet, sofaColor, cabinetsColor);
        } else {
            printLivingRoom();
        }
    }
}
