package my.apartment.bedrooms;

public class Bedroom1 extends Bedrooms{
    private int desk;
    private String deskColor;

    public int getDesk() {
        return desk;
    }

    public void setDesk(int desk) {
        if (desk > 0) {
            this.desk = desk;
        } else if (desk==0) {
            System.out.println("There is no desk in the first bedroom.");
        }else {
            System.out.println("Please enter correct data for the number of desks.");
        }
    }

    public String getDeskColor() {
        return deskColor;
    }

    public void setDeskColor(String deskColor) {
        if (!deskColor.isEmpty() && !deskColor.isBlank()) {
            this.deskColor = deskColor;
        }else {
            System.out.println("Please enter desk color.");
        }
    }

    public void introduction() {
        System.out.println("\nFrom Bedroom1: There are several rooms in my apartment and there are two bedrooms. The first is the adult bedroom.");
    }
    public void printData() {//не ми принтира това, а от Bedrooms, защото в SetDetailsForBedrooms съм задала да взима инфо от Bedrooms
        System.out.printf("\nFrom Bedroom1: Are there windows in the first bedroom: %b. " +
                        "\nIs there a balcony in the first bedroom: %b. " +
                        "\nThe flooring in the first bedroom is: %s. " +
                        "\nAre there curtains in the first bedroom: %b. " +
                        "\nThe color of the curtains in the first bedroom is: %s. " +
                        "\nHow many lamps are there in the first bedroom?: %d. " +
                        "\nHow many paintings are there in the first bedroom?: %d.\n",
                super.isWindows(), super.isBalconies(), super.getFlooring(), super.isCurtains(), super.getCurtainsColor(), super.getLamps(), super.getPaintings(0));
        //super.getPaintings(1)); - само тук изисква да въведа номер, но той не влия не setDetailsForLivingRoom. Защо?
    }

    public void printData(boolean printFlooringAndCurtainsColorOnly) {
        if (printFlooringAndCurtainsColorOnly) {
            System.out.printf("\nSummary Bedroom1: The flooring in the first bedroom is %s. The color of the curtains in the first bedroom is %s.\n", super.getFlooring(), super.getCurtainsColor());
        } else {
            printData();
        }
    }
    public void printBedrooms(){ //не ми принтира това, а от Bedrooms, защото в SetDetailsForBedrooms съм задала да взима инфо от Bedrooms
        System.out.printf("\nFrom Bedroom1: There is a bed in the first bedroom: %b. " +
                "\nThe bed in the first bedroom is %.2fm wide." +
                "\nThere are %d night stands in the first bedroom. Their color is %s." +
                        "\nThere is a wardrobe in the first bedroom: %b." +
                        "\nThere are %d chair/s in the first bedroom. Their color is %s.\n",
                super.isBed(), super.getBedSize(), super.getNightStand(), super.getNightStandColor(), super.isWardrobe(), super.getBedroomChairs(), super.getBedroomChairsColor());
    }

    public void printBedrooms(boolean BedSizeNightStandAndChairsOnly){
        if(BedSizeNightStandAndChairsOnly) {
            System.out.printf("\nSummary Bedroom1: The bed in the first bedroom is %.2fm wide. There are also %d %s night stands in this room and %d %s chair/s.\n", super.getBedSize(), super.getNightStand(), super.getNightStandColor(), super.getBedroomChairs(), super.getBedroomChairsColor());
        }else {
            printBedrooms();
        }
    }

    public void printBedroom1(){ //for Bedroom2 only
        System.out.printf("\nFrom Bedroom1: There is a desk in the first bedroom: %b.\nIts color is %s.\n", desk, deskColor);
    }
}
