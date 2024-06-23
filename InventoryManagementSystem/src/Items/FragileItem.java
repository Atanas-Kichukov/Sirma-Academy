package Items;

public class FragileItem extends InventoryItem {
    private boolean isTemperatureSensitive;
    private double insuranceMaterialValue;

    public FragileItem(boolean isTemperatureSensitive, double insuranceMaterialValue,String material, String category, String name, double price, String description, int quantity) {
        super(material, category, name, price, description, quantity);
        this.isTemperatureSensitive = isTemperatureSensitive;
        this.insuranceMaterialValue = insuranceMaterialValue;
    }

    public boolean isTemperatureSensitive() {
        return isTemperatureSensitive;
    }

    public FragileItem setTemperatureSensitive(boolean temperatureSensitive) {
        isTemperatureSensitive = temperatureSensitive;
        return this;
    }

    public double getInsuranceMaterialValue() {
        return insuranceMaterialValue;
    }

    public FragileItem setInsuranceMaterialValue(double insuranceMaterialValue) {
        this.insuranceMaterialValue = insuranceMaterialValue;
        return this;
    }

    @Override
    public void getItemDetails() {
        super.getItemDetails();
        if (this.isTemperatureSensitive){
            System.out.printf("This item is sensitive to temperature, so you have to have a required space for it, be careful. ");
        }
        if (this.insuranceMaterialValue>0){
            System.out.printf("The %s is too fragile you will need insurance materials for it, that's why the price will be higher",this.getName());
        }
    }

    @Override
    public double calculateValue() {
        double fragileItemValue = super.calculateValue() * getQuantity() + this.insuranceMaterialValue;
        if(this.isTemperatureSensitive){
            fragileItemValue *=1.2;
        }
        return fragileItemValue;
    }
}
