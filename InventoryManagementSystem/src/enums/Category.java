package enums;

public enum Category {
    //Electronics Categories
    COMPUTER_ACCESSORIES(1.4),
    MOBILE_DEVICES(1.7),
    AUDIO_DEVICES(1.2),
    //Grocery Categories
    FRUITS_VEGETABLES(1.5),
    MEAT_SEAFOOD(2.5),
    BAKERY(1.2),
    BEVERAGES(1),
    //Fragile Categories
    GLASSWARE(2.7),
    CERAMICS(2.1),
    ART(2.8);


    private  final double value;


    Category(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
