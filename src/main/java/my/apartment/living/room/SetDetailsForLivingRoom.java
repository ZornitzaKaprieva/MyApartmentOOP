package my.apartment.living.room;

public class SetDetailsForLivingRoom {
    public static void main(String[] args) {
        LivingRoom myLivingRoom = new LivingRoom();
        TableInLivingRoom diningTable = new TableInLivingRoom();

        //from MyApartmentOOP
        myLivingRoom.setWindows(true);
        myLivingRoom.setBalconies(true);
        myLivingRoom.setFlooring("parquet");
        myLivingRoom.setCurtains(true);
        myLivingRoom.setCurtainsColor("grey");
        myLivingRoom.setLamps(3);
        myLivingRoom.setPaintings(1);

        //from LivingRoom
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

        //from tableInLivingRoom
        diningTable.setCandleHolderColor("black");
        diningTable.setCandleColor("white");
        diningTable.setTableMatsColor("red");
        diningTable.setNapkinsColor("red");
        diningTable.setCupCoasterColor("grey");

//print myLivingRoom:
        System.out.println("\nMy Living Room:");

        myLivingRoom.introduction(); //настроено е да излиза инфо от LivingRoom, а не от MyApartment (което е общо за всички и е дифолтна стойност)
        myLivingRoom.printData(); //настроено е да излиза инфо от LivingRoom, а не от MyApartment
        myLivingRoom.printData(true);  //закоментирано е в LivingRoom и затова излиза Summary MyApartmentOOP
        myLivingRoom.printLivingRoom(); //
        myLivingRoom.printLivingRoom(true);

//print diningТable:
        System.out.println("\nDining Table:");
        diningTable.printTableLivingRoom();
        diningTable.printTableLivingRoom(true);


    }
}
