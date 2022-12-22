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

        //from tableInLivingRoom
        diningTable.setCandleHolderColor("black");
        diningTable.setCandleColor("white");
        diningTable.setTableMatsColor("red");
        diningTable.setNapkinsColor("red");
        diningTable.setCupCoasterColor("grey");

//print myLivingRoom:
        System.out.println("\nmyLivingRoom:");

//        myLivingRoom.introduction(); //настроено е да излиза инфо от LivingRoom, а не от MyApartment (което е общо за всички и е дифолтна стойност)
//        myLivingRoom.printData(); //настроено е да излиза инфо от LivingRoom, а не от MyApartment
//        myLivingRoom.printData(true);
//        myLivingRoom.printLivingRoom(); //
//        myLivingRoom.printLivingRoom(true);

//print diningТable:
        System.out.println("\ndiningТable:");
        diningTable.printTableLivingRoom();
        diningTable.printTableLivingRoom(false); //не разбирам защо конкретно тук else (false), не променя на дифолтна стойност


    }
}
