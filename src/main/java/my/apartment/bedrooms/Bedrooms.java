package my.apartment.bedrooms;

import my.apartment.MyApartmentOOP;

public class Bedrooms extends MyApartmentOOP {
    private boolean bed; // без if
    private float bedSize; //in method overloading
    private int nightStand; // todo Да добавя: There are 2 nightStand in the first bedroom/There is 1 nightStand in the second bedroom
    private String  nightStandColor; //in method overloading
    private boolean wardrobe; //без if
    private int bedroomChairs; //in method overloading
    private String bedroomChairsColor; //in method overloading


    public boolean isBed() {
        return bed;
    }

    public void setBed(boolean bed) {
        this.bed = bed;
    }

    public float getBedSize() {
        return bedSize;
    }

    public void setBedSize(float bedSize) {
        if(bedSize >= 1) {
            this.bedSize = bedSize;
        }else {
            System.out.println("Please enter correct data for bed width.");
        }
    }

    public int getNightStand() {
        return nightStand;
    }

    public void setNightStand(int nightStand) {
        if (nightStand > 0) {
            this.nightStand = nightStand;
        } else if (nightStand == 0 ) {
            System.out.println("There is no night stand in this bedroom.");
    }else {
            System.out.println("Please enter correct data for the number of night stands");
        }
    }

    public String getNightStandColor() {
        return nightStandColor;
    }

    public void setNightStandColor(String nightStandColor) {
        if(!nightStandColor.isBlank() && !nightStandColor.isEmpty()) {
            this.nightStandColor = nightStandColor;
        }else {
            System.out.println("Please enter a night stand color.");
        }
    }

    public boolean isWardrobe() {
        return wardrobe;
    }

    public void setWardrobe(boolean wardrobe) {
        this.wardrobe = wardrobe;
    }

    public int getBedroomChairs() {
        return bedroomChairs;
    }

    public void setBedroomChairs(int bedroomChairs) {
        if(bedroomChairs > 0) {
            this.bedroomChairs = bedroomChairs;
        } else if (bedroomChairs == 0) {
            System.out.println("There are no chairs in the bedroom.");
        } else {
            System.out.println("Please enter correct data for the number of chairs.");
        }
    }

    public String getBedroomChairsColor() {
        return bedroomChairsColor;
    }

    public void setBedroomChairsColor(String bedroomChairsColor) {
        if (!bedroomChairsColor.isBlank() && !bedroomChairsColor.isEmpty()) {
            this.bedroomChairsColor = bedroomChairsColor;
        }else {
            System.out.println("Please enter chairs color.");
        }
    }

    public void introduction() {
        System.out.println("\nFrom Bedrooms: There are several rooms in my apartment and there are two bedrooms.");
    }

    @Override
    public void printData() {
        System.out.printf("\nFrom Bedrooms: Are there windows in the bedroom?: %b. " +
                "\nIs there a balcony in the bedroom: %b. " +
                "\nThe flooring in the bedroom is: %s. " +
                "\nAre there curtains in the bedroom: %b. " +
                "\nThe color of the curtains in the bedroom is: %s. " +
                "\nHow many lamps are there in the bedroom?: %d. " +
                "\nHow many paintings are there in the bedroom?: %d.\n",
                super.isWindows(), super.isBalconies(), super.getFlooring(), super.isCurtains(), super.getCurtainsColor(), super.getLamps(), super.getPaintings(0));
        //super.getPaintings(1)); - само тук изисква да въведа номер, но той не влия не setDetailsForLivingRoom. Защо?

       //Може и така: директно преписва от MyApartmentOOP:  super.printData();
    }
    public void printData(boolean printFlooringAndCurtainsColorOnly) {
        if (printFlooringAndCurtainsColorOnly) {
            System.out.printf("\nSummary Bedrooms: The flooring in the bedroom is %s. The color of the curtains in the bedroom is %s.\n", super.getFlooring(), super.getCurtainsColor());
        } else {
            printData();
        }
    }

    public  void printBedrooms(){
        System.out.printf("\nFrom Bedrooms: There is a bed in the bedroom: %b. " +
                        "\nThe bed in the bedroom is %.2fm wide." +
                        "\nThere are %d night stand/s in the bedroom. Their color is %s." +
                        "\nThere is a wardrobe in the bedroom: %b." +
                        "\nThere are %d chair/s in the bedroom. Their color is %s.\n",
                isBed(), getBedSize(), getNightStand(), getNightStandColor(), isWardrobe(), getBedroomChairs(), getBedroomChairsColor());

    }

    public void printBedrooms(boolean BedSizeNightStandAndChairsOnly){
        if(BedSizeNightStandAndChairsOnly) {
            System.out.printf("\nSummary Bedrooms: The bed in the bedroom is %.2fm wide. There are also %d %s night stand/s in the room and %d %s chair/s.\n", getBedSize(), getNightStand(), getNightStandColor(), getBedroomChairs(), getBedroomChairsColor());
        }else {
            printBedrooms();
        }
    }
}
