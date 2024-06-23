package Managment;

import Items.ElectronicsItem;
import Items.FragileItem;
import Items.GroceryItem;
import Items.InventoryItem;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class InventoryManagement {
    private List<InventoryItem> allItems;

    public InventoryManagement() {
        this.allItems = new ArrayList<>();
    }

    public List<InventoryItem> getAllItems() {
        return allItems;
    }

    public InventoryManagement setAllItems(List<InventoryItem> allItems) {
        this.allItems = allItems;
        return this;
    }

    public List<InventoryItem> sortListByName(List<InventoryItem> allItems) {
        allItems.sort((i1, i2) -> i1.getName().compareTo(i2.getName()));
        return allItems;
    }

    public List<InventoryItem> sortByPrice(List<InventoryItem> allItems) {
        allItems.sort((i1, i2) -> i1.getItemPrice().compareTo(i2.getItemPrice()));
        return allItems;
    }

    public void addItem(InventoryItem item) {
        this.allItems.add(item);
        System.out.println("Item:" + item.getName() + " successfully added.");
    }

    public void removeItemByName(String name) {
        for (InventoryItem item : allItems) {
            if(item.getName().equalsIgnoreCase(name)){
                System.out.println("Successfully removed item with name: " + item.getName() + ".");
                this.allItems.remove(item);
            }
        }
        System.out.println("Item with name: " + name + " wasn't found.");
    }

    public InventoryItem getItemByName(String name) {
        for (InventoryItem item : allItems) {
            if (item.getName().equalsIgnoreCase(name)) {
                return item;
            }
        }
        return null;
    }

    public void saveInventoryToFile(String filename) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (InventoryItem item : allItems) {
                writer.write(itemToFileFormat(item));
            }
            System.out.println("Inventory data was saved to file: " + filename);
        }catch (IOException exception){
            System.err.println("Error saving inventory data to file: " + filename);
        }
    }

    public void loadInventoryFromFile(String filename) throws IOException {
        try(BufferedReader reader = new BufferedReader(new FileReader(filename))){
            String line;
            while ((line = reader.readLine()) != null){
                InventoryItem item = fileFormatToItem(line);
                allItems.add(item);
            }
            System.out.println("Inventory data loaded from file: " + filename);

        }
        catch (FileNotFoundException exception){
            System.err.println("File not found: " + filename);
        }catch (IOException exception){
            System.err.println("Error reading file: " + filename);
        }
    }

    private String itemToFileFormat(InventoryItem item) {
        String basicCharacteristics = String.join(","
                , item.getName(),
                item.getMaterial().name(),
                item.getItemCategory().name(),
                item.getItemPrice().toString(),
                String.valueOf(item.getQuantity()),
                item.getDescription(),
                item.getDateAdded().toString()
        );

        if (item instanceof GroceryItem) {
            GroceryItem groceryItem = (GroceryItem) item;

            String groceryItemCharacteristics = String.join(","
                    , Boolean.toString(groceryItem.isBio()),
                    Boolean.toString(groceryItem.isSeasonal()),
                    Boolean.toString(groceryItem.isFresh()),
                    String.valueOf(groceryItem.getWeight()));

            return basicCharacteristics + "," + groceryItemCharacteristics + System.lineSeparator();

        } else if (item instanceof ElectronicsItem) {
            ElectronicsItem electronicsItem = (ElectronicsItem) item;
            String electronicsItemCharacteristics = String.join(","
                    , String.valueOf(electronicsItem.getCountOFBatteries()),
                    String.valueOf(electronicsItem.getScreenSizeInches()),
                    String.valueOf(electronicsItem.getBatteryLifePercentage()),
                    String.valueOf(electronicsItem.getCameraResolution()),
                    String.valueOf(electronicsItem.getdB()),
                    String.valueOf(electronicsItem.getRam())
            );

            return basicCharacteristics + "," + electronicsItemCharacteristics + System.lineSeparator();

        } else if(item instanceof  FragileItem) {
            FragileItem fragileItem = (FragileItem) item;
            String fragileItemCharacteristics = String.join(",",
                    Boolean.toString(fragileItem.isTemperatureSensitive()),
                    String.valueOf(fragileItem.getInsuranceMaterialValue()));

            return basicCharacteristics + "," + fragileItemCharacteristics + System.lineSeparator();

        }
        return basicCharacteristics + System.lineSeparator();
    }

    private InventoryItem fileFormatToItem(String item) {
        String[] parts = item.split(",");
        String name = parts[0];
        String material = parts[1];
        String category = parts[2];
        double price = Double.parseDouble(parts[3]);
        int quantity = Integer.parseInt(parts[4]);
        String description = parts[5];
        LocalDate dateAdded = LocalDate.parse(parts[6]);
        InventoryItem inventoryItem = new InventoryItem(material, category, name, price, description, quantity);
        inventoryItem.setDateAdded(dateAdded);

        if (parts.length == 11) {
            boolean isBio = Boolean.parseBoolean(parts[7]);
            boolean isSeasonal = Boolean.parseBoolean(parts[8]);
            boolean isFresh = Boolean.parseBoolean(parts[9]);
            double weight = Double.parseDouble(parts[10]);
            return new GroceryItem(material, category, name, price, description, quantity, isBio, isSeasonal, isFresh, weight);
        } else if (parts.length == 13) {
            int countOfBatteries = Integer.parseInt(parts[7]);
            int screenSizeInches = Integer.parseInt(parts[8]);
            int batteryLifePercentage = Integer.parseInt(parts[9]);
            int cameraResolution = Integer.parseInt(parts[10]);
            int dB = Integer.parseInt(parts[11]);
            int ram = Integer.parseInt(parts[12]);
            ElectronicsItem electronicsItem = null;
            if (ram > 0 && cameraResolution > 0 && batteryLifePercentage > 0) {
                 electronicsItem = new ElectronicsItem(ram,cameraResolution,batteryLifePercentage,material,category,name,price,description,quantity);

            }else if(dB>0){
                 electronicsItem = new ElectronicsItem(material,category,name,price,description,quantity,dB);
            }else if(countOfBatteries>0){
                 electronicsItem = new ElectronicsItem(material,category,name,countOfBatteries,price,quantity,description);
            } else if (screenSizeInches > 0) {
                 electronicsItem = new ElectronicsItem(material,category,name,price,screenSizeInches,quantity,description);
            }else if(ram >0){
                electronicsItem = new ElectronicsItem(ram,material,category,name,price,description,quantity);
            }
            electronicsItem.setDateAdded(dateAdded);
            return electronicsItem;
        }else if(parts.length == 9){
            boolean isTemperatureSensitive = Boolean.parseBoolean(parts[7]);
            double insuranceMaterialValue = Double.parseDouble(parts[8]);
            FragileItem fragileItem = new FragileItem(isTemperatureSensitive,insuranceMaterialValue,material,category,name,price,description,quantity);
            fragileItem.setDateAdded(dateAdded);
            return fragileItem;
        }
        return inventoryItem;
    }


    public void removeItemById(Long id) {
        Iterator<InventoryItem> iterator = allItems.iterator();
        while(iterator.hasNext()){
            InventoryItem item = iterator.next();
            if(item.getId() == id){
                iterator.remove();
                System.out.println("Item with ID " + id + " was removed from the inventory.");
                return;
            }
        }
        System.out.println("Item with ID " + id + " wasn't found in the inventory.");

    }
    public void findById(Long id){
        for (InventoryItem item : allItems) {
            if(item.getId() == id){
                System.out.println("The name of item with ID " + id + " is "+ item.getName());
                return;
            }
        }
        System.out.println("Item with ID " + id + " wasn't found in the inventory.");
    }
}
