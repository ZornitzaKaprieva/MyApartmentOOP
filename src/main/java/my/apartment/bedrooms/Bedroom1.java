package my.apartment.bedrooms;

public class Bedroom1 extends Bedrooms{
    private int desk;
    private String deskColor;

    public int getDesk() {
        return desk;
    }

    public void setDesk(int desk) {
        this.desk = desk;
    }

    public String getDeskColor() {
        return deskColor;
    }

    public void setDeskColor(String deskColor) {
        this.deskColor = deskColor;
    }

    public void printData() {//не ми принтира това, а от Bedrooms, защото в SetDetailsForBedrooms съм задала да взима инфо от Bedrooms
        System.out.printf("\nAre there windows in the first bedroom: %b. " +
                        "\nIs there a balcony in the first bedroom: %b. " +
                        "\nThe flooring in the first bedroom is: %s. " +
                        "\nAre there curtains in the first bedroom: %b. " +
                        "\nThe color of the curtains in the first bedroom is: %s. " +
                        "\nHow many lamps are there in the first bedroom?: %d. " +
                        "\nHow many paintings are there in the first bedroom?: %d.",
                super.isWindows(), super.isBalconies(), super.getFlooring(), super.isCurtains(), super.getCurtainsColor(), super.getLamps(), super.getPaintings(0));
        //super.getPaintings(1)); - само тук изисква да въведа номер, но той не влия не setDetailsForLivingRoom. Защо?

    }
    public void printBedrooms(){ //не ми принтира това, а от Bedrooms, защото в SetDetailsForBedrooms съм задала да взима инфо от Bedrooms
        System.out.printf("\n\nThere is a bed in the first bedroom: %b. " +
                "\nThe bed in the first bedroom is %.2fm wide." +
                "\nThere are %d night stands in the first bedroom. Their color is %s.\n",
                super.isBed(), super.getBedSize(), super.getNightStand(), super.getNightStandColor());
    }

    public void printBedrooms(boolean BedSizeAndNightStandOnly){
        if(BedSizeAndNightStandOnly) {
            System.out.printf("The bed in the first bedroom is %.2fm wide. There are also %d %s night stands in this room.", super.getBedSize(), super.getNightStand(), super.getNightStandColor());
        }else {
            printBedrooms();
        }
    }

    public void printBedroom1(){ //for Bedroom2 only
        System.out.printf("\nThere is a desk in the first bedroom: %b.\nIts color is %s.\n", desk, deskColor);
    }
}
