package my.apartment.bedrooms;

public class Bedroom2 extends Bedrooms{
    private int storageBox;

    public int getStorageBox() {
        return storageBox;
    }

    public void setStorageBox(int storageBox) {
        this.storageBox = storageBox;
    }

    @Override // Override from Bedrooms => from MyApartmentOOP
    public void printData() {
        System.out.printf("\nAre there windows in the second bedroom?: %b. " +
                        "\nIs there a balcony in the second bedroom?: %b. " +
                        "\nThe flooring in the second bedroom is: %s. " +
                        "\nAre there curtains in the second bedroom: %b. " +
                        "\nThe color of the curtains in the second bedroom is: %s. " +
                        "\nHow many lamps are there in the second bedroom?: %d. " +
                        "\nHow many paintings are there in the second bedroom?: %d.",
                super.isWindows(), super.isBalconies(), super.getFlooring(), super.isCurtains(), super.getCurtainsColor(), super.getLamps(), super.getPaintings(0));
      // super.printData(); //Може и така: директно преписва from Bedrooms => from MyApartmentOOP
    }

    public void printBedrooms(){
        System.out.printf("\n\nThere is a bed in the second bedroom: %b. " +
                        "\nThe bed in the second bedroom is %.2fm wide." +
                        "\nThere are %d night stands in the second bedroom. Their color is %s.\n",
                super.isBed(), super.getBedSize(), super.getNightStand(), super.getNightStandColor());
    }

    public void printBedrooms(boolean BedSizeAndNightStandOnly){
        if(BedSizeAndNightStandOnly) {
            System.out.printf("The bed in the second bedroom is %.2fm wide. There is also %d %s night stand in this room.", super.getBedSize(), super.getNightStand(), super.getNightStandColor());
        }else {
            printBedrooms();
        }
    }
    public void printBedroom2(){ //for Bedroom2 only
        System.out.printf("\nHow many storage boxes are there in the second bedroom?: %d", storageBox);
    }
}
