package my.apartment;

public class setDetailsForLivingRoom {
    public static void main(String[] args) {
        LivingRoom myLivingRoom = new LivingRoom();
        tableInLivingRoom diningТable = new tableInLivingRoom();

        //from MyApartmentOOP
        myLivingRoom.setWindows(true);
        myLivingRoom.setBalconies(true);
        myLivingRoom.setFlooring("parquet");
        myLivingRoom.setCurtains(true);
        myLivingRoom.setLamps(3);
        myLivingRoom.setPaintings(1);

        //from LivingRoom
        myLivingRoom.setTable(1);
        myLivingRoom.setTableColor("white");

        //from tableInLivingRoom
        diningТable.setCandleHolderColor("black");

//print
        myLivingRoom.introductionLivingRoom();
        //myLivingRoom.printData();
        myLivingRoom.printData(true);
        myLivingRoom.printLivingRoom();
       // myLivingRoom.printLivingRoom(true);

        diningТable.printTableLivingRoom();


    }
}
