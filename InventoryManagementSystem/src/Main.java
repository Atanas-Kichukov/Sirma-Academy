import Items.ElectronicsItem;
import Items.FragileItem;
import Items.GroceryItem;
import Items.InventoryItem;
import Managment.InventoryManagement;
import enums.Category;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        InventoryManagement inventoryManagement = new InventoryManagement();

        boolean exit = false;
        while (!exit) {
            displayMenu();
            int action = Integer.parseInt(scanner.nextLine());
            String name;
            long id;
            switch (action) {

                case 1:
                    addItem(scanner, inventoryManagement);
                    break;
                case 2:
                    System.out.print("What is the name of the item you want to remove: ");
                    name = scanner.nextLine();
                    removeItemByName(name, inventoryManagement);
                    break;
                case 3:
                    System.out.print("What is the ID of the item you want to remove:");
                    id = Long.parseLong(scanner.nextLine());
                    removeItemById(id, inventoryManagement);
                    break;
                case 4:
                    printAllItems(inventoryManagement);
                    break;
                case 5:
                    sortByName(inventoryManagement);
                    break;
                case 6:
                    sortByPrice(inventoryManagement);
                    break;
                case 7:
                    System.out.print("What is the name of the item you want to see:");
                    name = scanner.nextLine();
                    getItemByName(name, inventoryManagement);
                    break;
                case 8:
                    System.out.println("What is the ID of the item you want to see:");
                    id = Long.parseLong(scanner.nextLine());
                    getItemById(id, inventoryManagement);
                    break;
                case 9:
                    System.out.print("What is the name of the product, which details You want to see:");
                    name = scanner.nextLine();
                    displayDetailsOfItem(name, inventoryManagement);

                    break;
                case 10:
                    System.out.print("What is the name of the product, which final value You want to see:");
                    name = scanner.nextLine();
                    displayFinalPrice(name,inventoryManagement);
                    break;
                case 11:
                    System.out.print("Enter the name of the file to save the inventory:");
                     name = scanner.nextLine();
                    saveInventoryToFile(inventoryManagement,name);
                    break;
                case 12:
                    System.out.print("Enter the name of the file from which to load the inventory:");
                    name = scanner.nextLine();
                    loadFromInventory(inventoryManagement,name);
                    break;
                default:

                    System.out.println("You have enter an invalid number.");
                    System.out.println("Please enter a number from 1-10.");
            }


        }
    }

    private static void loadFromInventory(InventoryManagement inventoryManagement, String name) throws IOException {
        inventoryManagement.loadInventoryFromFile(name);
    }

    private static void displayMenu() {
        System.out.println("Hello! You can choose from the following actions:");
        System.out.println("1: Add Item");
        System.out.println("2: Remove Item By Name");
        System.out.println("3: Remove Item By ID");
        System.out.println("4: Display all Items");
        System.out.println("5: Categorize Items By Name");
        System.out.println("6: Categorize Items By Price");
        System.out.println("7: Find Item By Name");
        System.out.println("8: Find Item by Id");
        System.out.println("9: Display items description");
        System.out.println("10: Display final price of the product");
        System.out.println("11: Load Inventory from file");
        System.out.println("12: Save Inventory to file");
        System.out.println("13: Exit");
        System.out.println("Choose your action!");
    }

    private static void addItem(Scanner scanner, InventoryManagement inventoryManagement) {
        System.out.println("To add an item you have to enter specific information for it!");
        System.out.print("Item name: ");
        String name = scanner.nextLine();
        System.out.println("Item material: (You can choose from: glass, plastic, metal, ceramic, organic)");
        String material = scanner.nextLine();
        System.out.println("Item Category: (You can choose from: computer_accessories, mobile_devices, audio_devices, fruits_vegetables, meat_seafood, bakery, beverages, glassware, ceramics and art)");
        String category = scanner.nextLine();
        System.out.print("Item price: ");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.print("Item description: ");
        String description = scanner.nextLine();
        System.out.print("Item quantity: ");
        int quantity = Integer.parseInt(scanner.nextLine());

        if (isElectronic(category)) {
            int countOfBatteries;
            int screenSizeInches;
            int cameraResolution;
            int batteryLifePercentage;
            int dB;
            int ram;
            if (category.equalsIgnoreCase(Category.MOBILE_DEVICES.name())) {
                System.out.print("Item ram: ");
                ram = Integer.parseInt(scanner.nextLine());
                System.out.print("Item camera resolution: ");
                cameraResolution = Integer.parseInt(scanner.nextLine());
                System.out.print("Item battery life percentage: ");
                batteryLifePercentage = Integer.parseInt(scanner.nextLine());

                ElectronicsItem mobileDevice = new ElectronicsItem(ram, cameraResolution, batteryLifePercentage, material, category, name, price, description, quantity);
                inventoryManagement.addItem(mobileDevice);


            } else if (category.equalsIgnoreCase(Category.AUDIO_DEVICES.name())) {
                System.out.print("Item dB:");
                dB = Integer.parseInt(scanner.nextLine());

                ElectronicsItem audioDevice = new ElectronicsItem(material, category, name, price, description, quantity, dB);
                inventoryManagement.addItem(audioDevice);


            } else if (category.equalsIgnoreCase(Category.COMPUTER_ACCESSORIES.name())) {

                System.out.println("You can add Computer, Monitor and Computer Accessories. " +
                        "For Computer enter 1, for Monitor enter 2 and for Computer Accessories enter 3:");
                int decision = Integer.parseInt(scanner.nextLine());
                switch (decision) {
                    case 1:
                        System.out.print("Item ram: ");
                        ram = Integer.parseInt(scanner.nextLine());

                        ElectronicsItem computer = new ElectronicsItem(ram, material, category, name, price, description, quantity);
                        inventoryManagement.addItem(computer);

                        break;
                    case 2:
                        System.out.print("Item screen size in inches: ");
                        screenSizeInches = Integer.parseInt(scanner.nextLine());

                        ElectronicsItem monitor = new ElectronicsItem(material, category, name, price, screenSizeInches, quantity, description);
                        inventoryManagement.addItem(monitor);

                        break;
                    case 3:
                        System.out.print("Batteries needed: ");
                        countOfBatteries = Integer.parseInt(scanner.nextLine());

                        ElectronicsItem accessories = new ElectronicsItem(material, category, name, countOfBatteries, price, quantity, description);

                        break;
                }
            }

        } else if (isGrocery(category)) {

            System.out.println("Answer with 'yes' or 'no' on the questions!");
            System.out.print("Is the product a bio product? ");
            String bio = scanner.nextLine();
            boolean isBio;
            boolean isSeasonal;
            boolean isFresh;
            if (bio.equalsIgnoreCase("yes")) {
                isBio = true;
            } else {
                isBio = false;
            }
            System.out.print("Is the product in season? ");
            String seasonal = scanner.nextLine();
            if (seasonal.equalsIgnoreCase("yes")) {
                isSeasonal = true;
            } else {
                isSeasonal = false;
            }
            System.out.print("Is the product fresh: ");
            String fresh = scanner.nextLine();
            if (fresh.equalsIgnoreCase("yes")) {
                isFresh = true;
            } else {
                isFresh = false;
            }
            System.out.print("How much does the product weight?");
            double weight = Double.parseDouble(scanner.nextLine());
            GroceryItem groceryItem = new GroceryItem(material, category, name, price, description, quantity, isBio, isSeasonal, isFresh, weight);
            inventoryManagement.addItem(groceryItem);
            System.out.println();

        } else if (isFragile(category)) {
            System.out.println("Answer with 'yes' or 'no' on the questions!");
            System.out.print("Is the item temperature sensitive? ");
            boolean isTemperatureSensitive;
            String sensitive = scanner.nextLine();
            if (sensitive.equalsIgnoreCase("yes")) {
                isTemperatureSensitive = true;
            } else {
                isTemperatureSensitive = false;
            }
            System.out.print("What is the value of the materials needed to secure the item to not be broken: ");
            double value = Double.parseDouble(scanner.nextLine());

            FragileItem fragileItem = new FragileItem(isTemperatureSensitive, value, material, category, name, price, description, quantity);
            inventoryManagement.addItem(fragileItem);
        }
    }

    private static void removeItemByName(String name, InventoryManagement inventoryManagement) {
        inventoryManagement.removeItemByName(name);
    }

    private static void removeItemById(Long id, InventoryManagement inventoryManagement) {
        inventoryManagement.removeItemById(id);
    }

    private static void sortByName(InventoryManagement inventoryManagement) {
        inventoryManagement.sortListByName(inventoryManagement.getAllItems());
        printAllItems(inventoryManagement);
    }

    private static void sortByPrice(InventoryManagement inventoryManagement) {
        inventoryManagement.sortByPrice(inventoryManagement.getAllItems());
        printAllItems(inventoryManagement);
    }

    private static void printAllItems(InventoryManagement inventoryManagement) {
        List<InventoryItem> allItems = inventoryManagement.getAllItems();

        for (InventoryItem item : allItems) {
            System.out.println(item.getName());
        }

    }

    private static void getItemByName(String name, InventoryManagement inventoryManagement) {
        System.out.println(inventoryManagement.getItemByName(name));
    }

    private static void getItemById(Long id, InventoryManagement inventoryManagement) {
        inventoryManagement.findById(id);
    }

    private static void displayDetailsOfItem(String name, InventoryManagement inventoryManagement) {

        if (inventoryManagement.getItemByName(name) instanceof GroceryItem) {
            GroceryItem groceryItem = (GroceryItem) inventoryManagement.getItemByName(name);
            groceryItem.getItemDetails();
        } else if (inventoryManagement.getItemByName(name) instanceof ElectronicsItem) {
            ElectronicsItem electronicsItem = (ElectronicsItem) inventoryManagement.getItemByName(name);
            electronicsItem.getItemDetails();
        } else if (inventoryManagement.getItemByName(name) instanceof FragileItem) {
            FragileItem fragileItem = (FragileItem) inventoryManagement.getItemByName(name);
            fragileItem.getItemDetails();
        } else {
            inventoryManagement.getItemByName(name).getItemDetails();
        }
    }

    private static void displayFinalPrice(String name, InventoryManagement inventoryManagement) {
        double finalPrice;
        if (inventoryManagement.getItemByName(name) instanceof GroceryItem) {
            GroceryItem groceryItem = (GroceryItem) inventoryManagement.getItemByName(name);
            finalPrice = groceryItem.calculateValue();
        } else if (inventoryManagement.getItemByName(name) instanceof ElectronicsItem) {
            ElectronicsItem electronicsItem = (ElectronicsItem) inventoryManagement.getItemByName(name);
            finalPrice =   electronicsItem.calculateValue();
        } else if (inventoryManagement.getItemByName(name) instanceof FragileItem) {
            FragileItem fragileItem = (FragileItem) inventoryManagement.getItemByName(name);
            finalPrice =  fragileItem.calculateValue();
        } else {
            finalPrice =  inventoryManagement.getItemByName(name).calculateValue();
        }
        System.out.println("The final price of the product " + name + " is: " + finalPrice + "lv");
    }
    private static void saveInventoryToFile(InventoryManagement inventoryManagement, String filename) throws IOException {
        inventoryManagement.saveInventoryToFile(filename);
    }

    private static boolean isElectronic(String itemCategory) {
        return itemCategory.equalsIgnoreCase(Category.AUDIO_DEVICES.name())
                || itemCategory.equalsIgnoreCase(Category.COMPUTER_ACCESSORIES.name())
                || itemCategory.equalsIgnoreCase(Category.MOBILE_DEVICES.name());

    }

    private static boolean isGrocery(String itemCategory) {
        return itemCategory.equalsIgnoreCase(Category.FRUITS_VEGETABLES.name()) || itemCategory.equalsIgnoreCase(Category.BAKERY.name()) || itemCategory.equalsIgnoreCase(Category.MEAT_SEAFOOD.name()) || itemCategory.equalsIgnoreCase(Category.BEVERAGES.name());
    }

    private static boolean isFragile(String itemCategory) {
        return itemCategory.equalsIgnoreCase(Category.GLASSWARE.name()) || itemCategory.equalsIgnoreCase(Category.CERAMICS.name()) || itemCategory.equalsIgnoreCase(Category.ART.name());
    }
}