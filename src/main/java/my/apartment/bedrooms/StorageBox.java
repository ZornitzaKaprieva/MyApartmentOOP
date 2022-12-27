package my.apartment.bedrooms;

public class StorageBox extends Bedroom2 {

    private int whichStorageBox; //nqma if
    private String inStorageBox;

    private int [] numberOfBoxes = {1, 2, 3, 4, 5, 6, 7}; //виж SetDetailsForStoreBox
    private String[] whatInBoxes = {"Clothes", "Toys", "Plush toys", "Board games and puzzles"}; //виж SetDetailsForStoreBox

    public int getWhichStorageBox() {
        return whichStorageBox;
    }

    public void setWhichStorageBox(int whichStorageBox) {
        this.whichStorageBox = whichStorageBox;
    }

    public String getInStorageBox() {
        return inStorageBox;
    }

    public void setInStorageBox(String inStorageBox) {
        if (!inStorageBox.isEmpty() && !inStorageBox.isBlank()){
            this.inStorageBox = inStorageBox;
        } else {
            System.out.println("Please enter what is in the storage box.");
        }
    }
    public int[] getNumberOfBoxes() {
        return numberOfBoxes;
    }
    public void setNumberOfBoxes(int[] numberOfBoxes) {
        this.numberOfBoxes = numberOfBoxes;
    }

    public String[] getWhatInBoxes() {
        return whatInBoxes;
    }

    public void setWhatInBoxes(String[] whatInBoxes) {
        this.whatInBoxes = whatInBoxes;
    }

    //print:

    //може ли да стане с if или switch
    public void printArraysBoxes (){
        System.out.printf("\n\nFrom StorageBox(Arrays): %s are stored in the storage box %d. ", whatInBoxes[3], numberOfBoxes[6]);
    }
    public void printInStorageBox() {
        System.out.printf("\nFrom StorageBox: %s are stored in the storage box %d.", inStorageBox, whichStorageBox);
    }
}
