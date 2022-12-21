package my.apartment;

public class LivingRoom extends MyApartmentOOP {
    private int table; //засега само тези 2 сетери и гетери
    private String tableColor;  //засега само тези 2
    private int chair;
    private String chairColor;
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
        }else{
            System.out.println("Please enter a table color.");
        }
    }

    public void introductionLivingRoom() {
        System.out.println("There are several rooms in my apartment. The first of them is the living room.");
    }
    public void printLivingRoom() {
        System.out.printf("\nThere is %d table in the living room. Its color is %s.", table, tableColor);
    }

    public void printLivingRoom (boolean PrintColorsOnly) {
        System.out.printf("\nThe color of the table is %s.", tableColor);
    }
    }
