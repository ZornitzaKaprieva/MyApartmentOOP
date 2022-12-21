package my.apartment;

public class tableInLivingRoom extends LivingRoom{
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

    public void printTableLivingRoom () {
        System.out.printf("\nThe color of the candle holder on the dining table is %s.", candleHolderColor);

    }
}
