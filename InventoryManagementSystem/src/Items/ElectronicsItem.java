package Items;

import java.time.LocalDate;

public class ElectronicsItem extends InventoryItem {
    private int countOFBatteries;
    private int screenSizeInches;
    private int batteryLifePercentage;
    private int cameraResolution;
    private int dB;
    private int ram;

    //For MobileDevices
    public ElectronicsItem(int ram, int cameraResolution, int batteryLifePercentage, String material, String category, String name, double price, String description, int quantity) {
        super(material, category, name, price, description, quantity);
        this.ram = ram;
        this.cameraResolution = cameraResolution;
        this.batteryLifePercentage = batteryLifePercentage;

    }

    //For AudioElectronics
    public ElectronicsItem(String material, String category, String name, double price, String description, int quantity, int dB) {
        super(material, category, name, price, description, quantity);

        this.dB = dB;
    }

    //For ComputerAccessories without Monitor
    public ElectronicsItem(String material, String category, String name, int countOFBatteries, double price, int quantity, String description) {
        super(material, category, name, price, description, quantity);
        this.countOFBatteries = countOFBatteries;
    }

    //For ComputeAccessories - Monitor
    public ElectronicsItem(String material, String category, String name, double price, int screenSizeInches, int quantity, String description) {
        super(material, category, name, price, description, quantity);
        this.screenSizeInches = screenSizeInches;
    }

    //For ComputerAccessories - Computer
    public ElectronicsItem(int ram,String material, String category, String name, double price, String description, int quantity) {
        super(material, category, name, price, description, quantity);
        this.ram = ram;
    }

    public ElectronicsItem(String material, String category, String name, double price, String description, int quantity) {
        super(material, category, name, price, description, quantity);
    }

    public int getCountOFBatteries() {
        return countOFBatteries;
    }

    public ElectronicsItem setCountOFBatteries(int countOFBatteries) {
        this.countOFBatteries = countOFBatteries;
        return this;
    }


    public int getScreenSizeInches() {
        return screenSizeInches;
    }

    public ElectronicsItem setScreenSizeInches(int screenSizeInches) {
        this.screenSizeInches = screenSizeInches;
        return this;
    }

    public int getBatteryLifePercentage() {
        return batteryLifePercentage;
    }

    public ElectronicsItem setBatteryLifePercentage(int batteryLifePercentage) {
        this.batteryLifePercentage = batteryLifePercentage;
        return this;
    }

    public int getCameraResolution() {
        return cameraResolution;
    }

    public ElectronicsItem setCameraResolution(int cameraResolution) {
        this.cameraResolution = cameraResolution;
        return this;
    }

    public int getdB() {
        return dB;
    }

    public ElectronicsItem setdB(int dB) {
        this.dB = dB;
        return this;
    }

    public int getRam() {
        return ram;
    }

    public ElectronicsItem setRam(int ram) {
        this.ram = ram;
        return this;
    }

    @Override
    public void getItemDetails() {
        super.getItemDetails();
        if (this.ram > 0 && this.cameraResolution > 0 && this.batteryLifePercentage > 0) {
            System.out.printf("The mobile device has %d RAM and %d life percentage. The resolution of the camera is %d", this.ram, this.batteryLifePercentage, this.cameraResolution);

        } else if (this.dB > 0) {
            System.out.printf("This audio device has %d dB", this.dB);
        } else if (this.countOFBatteries > 0) {
            System.out.printf("This device need %d batteries", this.countOFBatteries);
        } else if (this.screenSizeInches > 0) {
            System.out.printf("The size of the device is %d inches.", this.screenSizeInches);
        }
    }

    @Override
    public double calculateValue() {
        double electronicDeviceValue = super.calculateValue() * getQuantity();
        if (countOFBatteries > 0) {
            electronicDeviceValue += countOFBatteries;
        }
        if (ram > 0) {
            electronicDeviceValue += ram % 10;
        }
        if (batteryLifePercentage > 0) {
            electronicDeviceValue += batteryLifePercentage % 10;
        }
        if (cameraResolution > 0) {
            electronicDeviceValue += cameraResolution;
        }
        if (dB > 0) {
            electronicDeviceValue += dB;
        }
        if (screenSizeInches > 0) {
            electronicDeviceValue += screenSizeInches;
        }

        return electronicDeviceValue;
    }

    @Override
    public boolean isItemBreakable() {
        return true;
    }
}
