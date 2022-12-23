package my.apartment;

import my.apartment.bedrooms.Bedroom1;
import my.apartment.bedrooms.Bedroom2;
import my.apartment.bedrooms.Bedrooms;
import my.apartment.living.room.LivingRoom;
import my.apartment.living.room.TableInLivingRoom;

public class SetDetailsForMyApartmentSummary extends MyApartmentOOP {
    public static void main(String[] args) {


//copy/paste Objects from other SetDetails...:
        MyApartmentOOP myApartment = new MyApartmentOOP();
        LivingRoom myLivingRoom = new LivingRoom();
        TableInLivingRoom diningTable = new TableInLivingRoom();

        Bedrooms bigRoomAdults = new Bedrooms();
        Bedrooms smallRoomChild = new Bedrooms();
        Bedroom1 bedroom1Adults = new Bedroom1();
        Bedroom2 bedroom2Child = new Bedroom2();

//set  MyApartment:
        myApartment.introduction();
        myApartment.printData(true); //излизат дифолтни стойности, защото не са зададени конкретни

//set  LivingRoom:
        myLivingRoom.setFlooring("parquet");
        myLivingRoom.setCurtainsColor("grey");

        myLivingRoom.setTable(1);
        myLivingRoom.setTableColor("white");
        myLivingRoom.setDiningChair(6);
        myLivingRoom.setDiningChairColor("grey");
        myLivingRoom.setCarpet("red, black & white");
        myLivingRoom.setSofaColor("fawn");
        myLivingRoom.setCoffeeTable(1);
        myLivingRoom.setCoffeeTableColor("black");
        myLivingRoom.setCabinets(2);
        myLivingRoom.setCabinetsColor("white");

        diningTable.setCandleHolderColor("black");
        diningTable.setCandleColor("white");
        diningTable.setTableMatsColor("red");

//set Bedroom1:
        bedroom1Adults.setWindows(true);
        bedroom1Adults.setBalconies(false);
        bedroom1Adults.setFlooring("parquet");
        bedroom1Adults.setCurtains(true);
        bedroom1Adults.setCurtainsColor("grey");
        bedroom1Adults.setLamps(2);
        bedroom1Adults.setPaintings(1);

        bedroom1Adults.setBed(true); // това е, ако искаме да извлечем инфо директно от Bedroom1 Override, a не от Bedroom
        bedroom1Adults.setBedSize(1.6f);
        bedroom1Adults.setNightStand(2);
        bedroom1Adults.setNightStandColor("white");
        bedroom1Adults.setWardrobe(true);
        bedroom1Adults.setBedroomChairs(3);
        bedroom1Adults.setBedroomChairsColor("grey & black");

        bedroom1Adults.setDesk(1);// извличаме инфо от Bedroom1 (няма Override)
        bedroom1Adults.setDeskColor("white");

//set Bedroom2:
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
        bedroom2Child.setStorageBoxNum(6);

//method overloading only:
        myLivingRoom.introduction();
        myLivingRoom.printData(true); //закоментирано е в LivingRoom и затова излиза Summary MyApartmentOOP
        myLivingRoom.printLivingRoom(true);
        diningTable.printTableLivingRoom(true); //ако не е сетнат обекта, извежда дифолтна стойност (0/null)


        myApartment.introduction();
        bigRoomAdults.introduction();
        bedroom1Adults.introduction();
        bedroom1Adults.printData(true);
        bedroom1Adults.printBedrooms(true);
        bedroom1Adults.printBedroom1();

        myApartment.introduction();
        smallRoomChild.introduction();
        bedroom2Child.introduction();
        bedroom2Child.printData(true);
        bedroom2Child.printBedrooms(true);
        bedroom2Child.printBedroom2(true);

    }
}
