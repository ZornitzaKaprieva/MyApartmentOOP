package my.apartment.bedrooms;

public class SetDetailsForBedrooms {

    public static void main(String[] args) {
//Note: Детската стая и стаята за възрастни са направени по различен начин с цел упражнение.

    Bedrooms bigRoomAdults = new Bedrooms();
    Bedrooms smallRoomChild = new Bedrooms();
    Bedroom1 bedroom1Adults = new Bedroom1();
    Bedroom2 bedroom2Child = new Bedroom2();

    StorageBox WhatsInWhichBox = new StorageBox(); //няма нужда от сет, сетнато е в StorageBox

    StorageBox box1 = new StorageBox();
    StorageBox box2 = new StorageBox();
    StorageBox box3 = new StorageBox();
    StorageBox box4 = new StorageBox();
    StorageBox box5 = new StorageBox();
    StorageBox box6 = new StorageBox();
    StorageBox box7 = new StorageBox();


//set bedroomAdults from MyApartmentOOP:
        bigRoomAdults.setWindows(true); //from Bedrooms (Override from MyApartmentOOP)
        bigRoomAdults.setBalconies(false);
        bigRoomAdults.setFlooring("parquet");
        bigRoomAdults.setCurtains(true);
        bigRoomAdults.setCurtainsColor("grey");
        bigRoomAdults.setLamps(2);
        bigRoomAdults.setPaintings(1);

//set bedroomAdults from Bedrooms:
        bigRoomAdults.setBed(true); //from Bedrooms (Override from MyApartmentOOP)
        bigRoomAdults.setBedSize(1.6f);
        bigRoomAdults.setNightStand(2);
        bigRoomAdults.setNightStandColor("white");
        bigRoomAdults.setWardrobe(true);
        bigRoomAdults.setBedroomChairs(3);
        bigRoomAdults.setBedroomChairsColor("grey & black");


//set bedroomAdults from Bedroom1:
        bedroom1Adults.setDesk(1); //from Bedroom1 (not Overrided)
        bedroom1Adults.setDeskColor("white");

//set bedroomSecondChildren all from Bedroom2 (overriding)
        bedroom2Child.setWindows(true);
        bedroom2Child.setBalconies(true);
        bedroom2Child.setFlooring("parquet");
        bedroom2Child.setCurtains(true);
        bedroom2Child.setCurtainsColor("grey");
        bedroom2Child.setLamps(1);
        bedroom2Child.setPaintings(5);

        bedroom2Child.setBed(true); // това е, ако искаме да извлечем инфо директно от Bedroom2 Override, a не от Bedroom
        bedroom2Child.setBedSize(1.2f);
        bedroom2Child.setNightStand(1);
        bedroom2Child.setNightStandColor("white");
        bedroom2Child.setWardrobe(true);
        bedroom2Child.setBedroomChairs(1);
        bedroom2Child.setBedroomChairsColor("blue");

        bedroom2Child.setSideTable(1); // извличаме инфо от Bedroom2 (няма Override)
        bedroom2Child.setSideTableColor("black");
        bedroom2Child.setStorageBox(true);
        bedroom2Child.setStorageBoxNum(7);
     //set StorageBox from bedroomChildren:
       box1.setInStorageBox("Clothes");
       box2.setInStorageBox("Clothes");
       box3.setInStorageBox("Clothes");
       box4.setInStorageBox("Toys");
       box5.setInStorageBox("Toys");
       box6.setInStorageBox("Plush toys");
       box7.setInStorageBox("Board games and puzzles");
        box1.setWhichStorageBox(1);
        box2.setWhichStorageBox(2);
        box3.setWhichStorageBox(3);
        box4.setWhichStorageBox(4);
        box5.setWhichStorageBox(5);
        box6.setWhichStorageBox(6);
        box7.setWhichStorageBox(7);

//print bedroomAdults:
        System.out.println("\nBedroom-Adults:");
        bigRoomAdults.introduction(); //взима printData from Bedrooms
        bigRoomAdults.printData(); //взима printData from Bedrooms, ако закоментираме printData from Bedrooms (printData from Bedroom1 така и така не се отчита), ще излезе System.out.printf от MyApartmentOOP
        bigRoomAdults.printData(true); //Ако това не присъства в Bedroom1, се извлича от Bedrooms. Ако не присъства в Bedrooms, се извлича от MyApartmentOOP
        bigRoomAdults.printBedrooms(); //взима printData from Bedrooms
        bigRoomAdults.printBedrooms(true); //взима printData from Bedrooms
        bedroom1Adults.printBedroom1(); //взима printData from Bedroom1


//print bedroomChildren:
        System.out.println("\nBedroom-Children:");
        smallRoomChild.introduction(); //взима printData from Bedrooms
        bedroom2Child.introduction(); //взима printData from Bedroom2
        bedroom2Child.printData(); // това е, ако искаме да извлечем директно инфо от Bedroom2 Override, a не от Bedrooms или MyApartmentOOP
        bedroom2Child.printData(true); // това е, ако искаме да извлечем инфо от Bedroom2 Ov
        bedroom2Child.printBedrooms(); // това е, ако искаме да извлечем инфо от Bedroom2 Override, а не от Bedrooms или MyApartmentOOP
        bedroom2Child.printBedrooms(true);// това е, ако искаме да извлечем директно инфо от Bedroom2 Override, a не от Bedrooms или MyApartmentOOP
        bedroom2Child.printBedroom2(); // така извличаме директно инфо от Bedroom2
        bedroom2Child.printBedroom2(true);
    //print StorageBox from bedroomChildren:
        WhatsInWhichBox.printArraysBoxes(); //няма нужда от сет, сетнато е в StorageBox
        box1.printInStorageBox();
        box2.printInStorageBox();
        box3.printInStorageBox();
        box4.printInStorageBox();
        box5.printInStorageBox();
        box6.printInStorageBox();
        box7.printInStorageBox();

        System.out.println("\n\nMore details about the boxes see in SetDetailsForStorageBoxArrays.");

    }
}