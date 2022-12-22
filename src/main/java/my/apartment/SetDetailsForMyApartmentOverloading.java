package my.apartment;

import my.apartment.bedrooms.Bedroom1;
import my.apartment.bedrooms.Bedroom2;
import my.apartment.bedrooms.Bedrooms;
import my.apartment.living.room.LivingRoom;
import my.apartment.living.room.TableInLivingRoom;

public class SetDetailsForMyApartmentOverloading extends MyApartmentOOP {
    public static void main(String[] args) {

//copy/paste Objects from other SetDetails...:
        LivingRoom myLivingRoom = new LivingRoom();
            TableInLivingRoom diningTable = new TableInLivingRoom();

        Bedrooms bigRoomAdults = new Bedrooms();
        Bedrooms smallRoomChild = new Bedrooms();
            Bedroom1 bedroom1Adults = new Bedroom1();
            Bedroom2 bedroom2Child = new Bedroom2();



//set:
        myLivingRoom.setFlooring("parquet");
        myLivingRoom.setCurtainsColor("grey");
        myLivingRoom.setTableColor("white");
        diningTable.setCandleHolderColor("black");
        diningTable.setCandleColor("white");
        diningTable.setTableMatsColor("red");



//method overloading only:
        myLivingRoom.introduction();
        myLivingRoom.printData(true); //всичко е ок!
        myLivingRoom.printLivingRoom(true); //при false  извежда: There is 0 table in the living room. Its color is white. Защо?
        diningTable.printTableLivingRoom(true);//при false  извежда: There is 0 table in the living room. Its color is null. Защо?
    }
}
