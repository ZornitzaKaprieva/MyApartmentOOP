package my.apartment.bedrooms;

public class SetDetailsForStorageBoxArrays {

    //Note: Тук е направено с масиви. Те са дефинирани и в StorageBox, и тук, за по-пригледно.
    public static void main(String[] args) {

        int[] numberOfBoxes2 = {1, 2, 3, 4, 5, 6, 7};
        String[] whatInBoxes2 = {"Clothes", "Toys", "Plush toys", "Board games and puzzles"};


//винаги е с int:
        System.out.println("The storage boxes contain:");
        for (int i = 0; i < whatInBoxes2.length; i++) {
            System.out.println(whatInBoxes2[i]);
        }
        System.out.printf("\nFrom SetDetailsForStorageBoxArrays: ");

    System.out.printf("\n%s are stored in the storage box %d.", whatInBoxes2[0], numberOfBoxes2[0]);
    System.out.printf("\n%s are stored in the storage box %d.", whatInBoxes2[0], numberOfBoxes2[1]);
    System.out.printf("\n%s are stored in the storage box %d.", whatInBoxes2[0], numberOfBoxes2[2]);
    System.out.printf("\n%s are stored in the storage box %d.", whatInBoxes2[1], numberOfBoxes2[3]);
    System.out.printf("\n%s are stored in the storage box %d.", whatInBoxes2[1], numberOfBoxes2[4]);
    System.out.printf("\n%s are stored in the storage box %d.", whatInBoxes2[2], numberOfBoxes2[5]);
    System.out.printf("\n%s are stored in the storage box %d.", whatInBoxes2[3], numberOfBoxes2[6]);

        System.out.println("\n................");

    System.out.println( whatInBoxes2[0] + " are stored in boxes "  + numberOfBoxes2[0] + ", "+ numberOfBoxes2[1] + " and " + numberOfBoxes2[2] + ".");
    System.out.println( whatInBoxes2[1] + " are stored in boxes "  + numberOfBoxes2[3] + " and " + numberOfBoxes2[4]+ ".");
    System.out.println( whatInBoxes2[2] + " are stored in box "  + numberOfBoxes2[5] + ".");
    System.out.println( whatInBoxes2[3] + " are stored in box "  + numberOfBoxes2[6] + ".");

    }
}
