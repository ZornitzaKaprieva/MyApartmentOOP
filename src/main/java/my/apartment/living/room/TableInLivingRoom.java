package my.apartment.living.room;

import my.apartment.living.room.LivingRoom;

public class TableInLivingRoom extends LivingRoom {
    //candle holder, candles, tableMats, napkins, cup holders
    private int candleHolder;
    private String candleHolderColor; //засега сетери и гетери само на стринговете.
    private int candle;
    private String candleColor;//засега сетери и гетери само на стринговете.
    private int tableMats;
    private String tableMatsColor;//засега сетери и гетери само на стринговете.
    private String napkinsColor;//засега сетери и гетери само на стринговете.
    private int cupCoaster;
    private String cupCoasterColor;//засега сетери и гетери само на стринговете.

    public String getCandleHolderColor() {
        return candleHolderColor;
    }

    public void setCandleHolderColor(String candleHolderColor) {
        this.candleHolderColor = candleHolderColor;
    }

    public String getCandleColor() {
        return candleColor;
    }

    public void setCandleColor(String candleColor) {
        this.candleColor = candleColor;
    }

    public String getTableMatsColor() {
        return tableMatsColor;
    }

    public void setTableMatsColor(String tableMatsColor) {
        this.tableMatsColor = tableMatsColor;
    }

    public String getNapkinsColor() {
        return napkinsColor;
    }

    public void setNapkinsColor(String napkinsColor) {
        this.napkinsColor = napkinsColor;
    }

    public String getCupCoasterColor() {
        return cupCoasterColor;
    }

    public void setCupCoasterColor(String cupCoasterColor) {
        this.cupCoasterColor = cupCoasterColor;
    }

    public void printTableLivingRoom() {
        System.out.printf(
                "\nFrom TableLivingRoom: The color of the candle holder on the dining table is %s." +
                        "\nThe color of the candle on the dining table is %s. " +
                        "\nThe color of the table mats on the dining table is %s. " +
                        "\nThe color of the napkins on the dining table is %s. " +
                        "\nThe color of the cup coaster on the dining table is %s.\n ",
                candleHolderColor, candleColor, tableMatsColor, napkinsColor, cupCoasterColor);
    }

    public void printTableLivingRoom(boolean candlesAndMatsOnly) {
        if (candlesAndMatsOnly) {
            System.out.printf("\nSummary TableLivingRoom: A %s candle holder with %s candles and %s table mats are arranged on the table.\n", candleHolderColor, candleColor, tableMatsColor);
        } else {
            printTableLivingRoom();
        }

    }
}
