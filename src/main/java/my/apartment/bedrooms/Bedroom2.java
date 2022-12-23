package my.apartment.bedrooms;

public class Bedroom2 extends Bedrooms{

    private int sideTable;
    private String sideTableColor;
    private boolean StorageBox;
    private int storageBoxNum; //todo може да се опише съдържанието им в отделен клас.


    public int getSideTable() {
        return sideTable;
    }

    public void setSideTable(int sideTable) {
        if (sideTable > 0) {
            this.sideTable = sideTable;
        } else if (sideTable==0) {
            System.out.println("There is no side table in the first bedroom.");
        } else {
            System.out.println("Please enter correct data for the number of side tables.");
        }
    }

    public String getSideTableColor() {
        return sideTableColor;
    }

    public void setSideTableColor(String sideTableColor) {
        if (!sideTableColor.isBlank() && !sideTableColor.isEmpty()) {
            this.sideTableColor = sideTableColor;
        } else {
            System.out.println("Please enter side table color.");
        }

    }

    public boolean isStorageBox() {
        return StorageBox;
    }

    public void setStorageBox(boolean storageBox) {
        StorageBox = storageBox;
    }

    public int getStorageBoxNum() {
        return storageBoxNum;
    }

    public void setStorageBoxNum(int storageBoxNum) {
        if (storageBoxNum > 0) {
            this.storageBoxNum = storageBoxNum;
        } else if (storageBoxNum == 0) {
            System.out.println("There is no storage boxes in the first bedroom.");
        } else {
            System.out.println("Please enter correct data for the number of side tables.");
        }
    }

    public void introduction() {
        System.out.println("\nFrom Bedroom2: There are several rooms in my apartment and there are two bedrooms. The second is the child bedroom.");
    }
    @Override // Override from Bedrooms => from MyApartmentOOP
    public void printData() {
        System.out.printf("\nFrom Bedroom2: Are there windows in the second bedroom?: %b. " +
                        "\nIs there a balcony in the second bedroom?: %b. " +
                        "\nThe flooring in the second bedroom is: %s. " +
                        "\nAre there curtains in the second bedroom: %b. " +
                        "\nThe color of the curtains in the second bedroom is: %s. " +
                        "\nHow many lamps are there in the second bedroom?: %d. " +
                        "\nHow many paintings are there in the second bedroom?: %d.\n",
                super.isWindows(), super.isBalconies(), super.getFlooring(), super.isCurtains(), super.getCurtainsColor(), super.getLamps(), super.getPaintings(0));
      // super.printData(); //Може и така: директно преписва from Bedrooms => from MyApartmentOOP
    }

    public void printData(boolean printFlooringAndCurtainsColorOnly) {
        if (printFlooringAndCurtainsColorOnly) {
            System.out.printf("\nSummary Bedroom2: The flooring in the second bedroom is %s. The color of the curtains in the second bedroom is %s.\n", super.getFlooring(), super.getCurtainsColor());
        } else {
            printData();
        }
    }

    public void printBedrooms(){
        System.out.printf("\nFrom Bedroom2: Is there a bed in the second bedroom?: %b. " +
                        "\nThe bed in the second bedroom is %.2fm wide." +
                        "\nThere are %d night stand/s in the second bedroom. Their color is %s." +
                        "\nThere is a wardrobe in the second bedroom: %b." +
                        "\nThere are %d chair/s in the second bedroom. Their color is %s.\n",
                super.isBed(), super.getBedSize(), super.getNightStand(), super.getNightStandColor(), super.isWardrobe(), super.getBedroomChairs(), super.getBedroomChairsColor());
    }

    public void printBedrooms(boolean  BedSizeNightStandAndChairsOnly){
        if( BedSizeNightStandAndChairsOnly) {
            System.out.printf("\nSummary Bedroom2: The bed in the second bedroom is %.2fm wide. There are also %d %s night stand/s in the second room and %d %s chair/s.\n", super.getBedSize(), super.getNightStand(), super.getNightStandColor(), super.getBedroomChairs(), super.getBedroomChairsColor());
        }else {
            printBedrooms();
        }
    }
    public void printBedroom2(){ //for Bedroom2 only
        System.out.printf("\nFrom Bedroom2: \nThere are %d side table/s in the second bedroom. Their color is %s." +
                "\nIs there storage boxes in the second bedroom?: %b. " +
                "\nHow many storage boxes are there in the second bedroom?: %d\n", getSideTable(), getSideTableColor(), isStorageBox(), getStorageBoxNum());
    }
    public void printBedroom2(boolean SideTableColorAndBoxNum) { //for Bedroom2 only
        if(SideTableColorAndBoxNum) {
            System.out.printf("\nSummary Bedroom2: The side table in the second bedroom is %s. There are also %d storage boxes in the second bedroom.", getSideTableColor(), getStorageBoxNum());
        }else {
            printBedrooms();
        }
    }
}
