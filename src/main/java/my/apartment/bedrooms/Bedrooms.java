package my.apartment.bedrooms;

import my.apartment.MyApartmentOOP;

public class Bedrooms extends MyApartmentOOP {
    private boolean bed; //засега само тези 4 сетери и гетери, няма if
    private float bedSize; //засега само тези 4 сетери и гетери + if
    private int nightStand; //засега само тези 4 сетери и гетери + if// todo Да добавя: There are 2 nightStand in the first bedroom/There is 1 nightStand in the second bedroom
    private String  nightStandColor; //засега само тези 4 сетери и гетери + if
    private boolean wardrobe;
    private int bedroomChairs;
    private String bedroomChairsColor;


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

    public void introduction() {
        System.out.println("There are several rooms in my apartment and there are two bedrooms.");
    }

    @Override
    public void printData() {
        System.out.printf("\nAre there windows in the bedroom?: %b. " +
                "\nIs there a balcony in the bedroom: %b. " +
                "\nThe flooring in the bedroom is: %s. " +
                "\nAre there curtains in the bedroom: %b. " +
                "\nThe color of the curtains in the bedroom is: %s. " +
                "\nHow many lamps are there in the bedroom?: %d. " +
                "\nHow many paintings are there in the bedroom?: %d.",
                super.isWindows(), super.isBalconies(), super.getFlooring(), super.isCurtains(), super.getCurtainsColor(), super.getLamps(), super.getPaintings(0));
        //super.getPaintings(1)); - само тук изисква да въведа номер, но той не влия не setDetailsForLivingRoom. Защо?

       //Може и така: директно преписва от MyApartmentOOP:  super.printData();
    }

    public  void printBedrooms(){
        System.out.printf("\n\nThere is a bed in the bedroom: %b. " +
                        "\nThe bed in the bedroom is %.2fm wide." +
                        "\nThere are %d night stands in the bedroom. Their color is %s.\n",
                isBed(), getBedSize(), getNightStand(), getNightStandColor());

    }

    public void printBedrooms(boolean BedSizeAndNightStandOnly){
        if(BedSizeAndNightStandOnly) {
            System.out.printf("The bed in the bedroom is %.2fm wide. There are also %d %s night stands in the room.", getBedSize(), getNightStand(), getNightStandColor());
        }else {
            printBedrooms();
        }
    }
}
