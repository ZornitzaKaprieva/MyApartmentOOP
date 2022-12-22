package my.apartment.bedrooms;

public class SetDetailsForBedrooms {

    public static void main(String[] args) {
//Note: Детската стая и стаята за възрастни са направени по различен начин с цел упражнение.

    Bedrooms bigRoomAdults = new Bedrooms();
    Bedrooms smallRoomChild = new Bedrooms();
    Bedroom1 bedroom1Adults = new Bedroom1();
    Bedroom2 bedroom2Child = new Bedroom2();

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

        bedroom2Child.setBed(true); // това е, ако искаме да извлечем инфо директно от Bedroom2 Override
        bedroom2Child.setBedSize(1.2f); // това е, ако искаме да извлечем инфо директно от Bedroom2 Override
        bedroom2Child.setNightStand(1); // това е, ако искаме да извлечем инфо директно от Bedroom2 Override, а не от
        bedroom2Child.setNightStandColor("white");

        bedroom2Child.setStorageBox(6);

//print bedroomAdults:
//        System.out.println("\nbedroomAdults:");
//        bigRoomAdults.introduction(); //взима printData from Bedrooms
//        bigRoomAdults.printData(); //взима printData from Bedrooms, ако закоментираме printData from Bedrooms (printData from Bedroom1 така и така не се отчита), ще излезе System.out.printf от MyApartmentOOP
//        bigRoomAdults.printBedrooms(); //взима printData from Bedrooms
//        bigRoomAdults.printBedrooms(true); //взима printData from Bedrooms
//        bedroom1Adults.printBedroom1(); //взима printData from Bedroom1


//print bedroomChildren:
        System.out.println("\nbedroomChildren:");
    smallRoomChild.introduction();
        bedroom2Child.printData(); // това е, ако искаме да извлечем директно инфо от Bedroom2 Override, a не от Bedrooms или MyApartmentOOP
        bedroom2Child.printBedrooms(); // това е, ако искаме да извлечем инфо от Bedroom2 Override, а не от Bedrooms или MyApartmentOOP
        bedroom2Child.printBedroom2(); // това е, ако искаме да извлечем директно инфо от Bedroom2 Override, a не от Bedrooms или MyApartmentOOP
        bedroom2Child.printBedrooms(true);// това е, ако искаме да извлечем директно инфо от Bedroom2 Override, a не от Bedrooms или MyApartmentOOP

//Следва да добавя инфо от спалните в SetDeatilsForMyApartment

    }
}