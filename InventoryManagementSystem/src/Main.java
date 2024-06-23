import Items.ElectronicsItem;
import Items.FragileItem;
import Items.GroceryItem;
import Items.InventoryItem;
import Managment.InventoryManagement;
import Order.ShoppingCart;
import Payment.CreditCard;
import Payment.PayPal;
import enums.Category;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        InventoryManagement inventoryManagement = new InventoryManagement();
        ShoppingCart shoppingCart = new ShoppingCart();
        boolean exit = false;
        boolean creditCardCreated = false;
        boolean payPalCreated = false;
        CreditCard creditCard = null;
        PayPal payPal = null;
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
                    displayFinalPrice(name, inventoryManagement);
                    break;
                case 11:
                    System.out.print("Enter the name of the file to save the inventory:");
                    name = scanner.nextLine();
                    saveInventoryToFile(inventoryManagement, name);
                    break;
                case 12:
                    System.out.print("Enter the name of the file from which to load the inventory:");
                    name = scanner.nextLine();
                    loadFromInventory(inventoryManagement, name);
                    break;
                case 13:
                    System.out.print("Enter the name of the product you want to add:");
                    name = scanner.nextLine();
                    addItemToShoppingCart(shoppingCart, name, inventoryManagement,scanner);
                    break;
                case 14:
                    System.out.print("How do you want to pay, with PayPal or with Credit card?");
                    String paymentMethod = scanner.nextLine();
                    if (paymentMethod.equalsIgnoreCase("PayPal")) {
                       payPal =  createPayPal(scanner);
                        payPalCreated = true;
                        creditCardCreated = false;
                    } else if (paymentMethod.equalsIgnoreCase("Credit card")) {
                       creditCard = createCreditCard(scanner);
                        payPalCreated =false;
                        creditCardCreated = true;
                    } else {
                        System.out.print("Sorry we don't support that payment.");
                    }
                    break;
                case 15:

                    if(!creditCardCreated && !payPalCreated){
                        System.out.println("There is no payment method created.Please choose the option to create a payment method!");
                    }

                    if(creditCardCreated && creditCard != null){
                        makePurchaseWithCreditCard(shoppingCart,inventoryManagement,creditCard);
                    }
                    else if (payPalCreated && payPal != null) {
                        makePurchaseWithPayPal(shoppingCart,inventoryManagement,payPal);
                    }
                    break;
                case 16:
                    exit = true;
                    break;

                default:

                    System.out.println("You have enter an invalid number.");
                    System.out.println("Please enter a number from 1-16.");
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
        System.out.println("13: Add item to your shopping cart");
        System.out.println("14: Enter payment information");
        System.out.println("15: Make purchase");
        System.out.println("16: Exit");
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
                        inventoryManagement.addItem(accessories);
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
            isBio = bio.equalsIgnoreCase("yes");
            System.out.print("Is the product in season? ");
            String seasonal = scanner.nextLine();
            isSeasonal = seasonal.equalsIgnoreCase("yes");
            System.out.print("Is the product fresh: ");
            String fresh = scanner.nextLine();
            isFresh = fresh.equalsIgnoreCase("yes");
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
            isTemperatureSensitive = sensitive.equalsIgnoreCase("yes");
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
            finalPrice = electronicsItem.calculateValue();
        } else if (inventoryManagement.getItemByName(name) instanceof FragileItem) {
            FragileItem fragileItem = (FragileItem) inventoryManagement.getItemByName(name);
            finalPrice = fragileItem.calculateValue();
        } else {
            finalPrice = inventoryManagement.getItemByName(name).calculateValue();
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

    private static void addItemToShoppingCart(ShoppingCart shoppingCart, String name, InventoryManagement inventoryManagement,Scanner scanner) throws IOException {
        if(inventoryManagement.getAllItems().isEmpty()){
            System.out.println("Sorry there are no products in the inventory.Someone should add items first!");
        }else {
            InventoryItem itemToAdd = inventoryManagement.getItemByName(name);
            shoppingCart.addItemToShoppingCart(itemToAdd, inventoryManagement,scanner);

        }
    }

    private static CreditCard createCreditCard(Scanner scanner) {
        System.out.println("You have chosen payment with credit card.");
        System.out.print("Enter the card number: ");
        String cardNumber = scanner.nextLine();
        System.out.print("Enter the name of the card holder: ");
        String cardHolder = scanner.nextLine();
        System.out.print("Enter when does the card expires(the format should be dd/MM/yyyy): ");
        String expireDate = scanner.nextLine();
        System.out.print("Enter the cvv of the card: ");
        String cvv = scanner.nextLine();
        System.out.print("Enter your balance: ");
        double balance = Double.parseDouble(scanner.nextLine());
        if (validateCreditCard(cardNumber, cardHolder, expireDate, cvv, scanner)) {
           return new CreditCard(cardNumber, cardHolder, expireDate, cvv, balance);
        }
        return null;
    }

    private static PayPal createPayPal(Scanner scanner) {
        System.out.println("You have chosen payment with PayPal");
        System.out.print("Enter email(it must be at least 10 characters and must have at least 2 digits) : ");
        String email = scanner.nextLine();
        System.out.print("Enter password(must be at lest 5 characters) : ");
        String password = scanner.nextLine();
        System.out.print("Enter Your balance: ");
        double balance = Double.parseDouble(scanner.nextLine());
        if (validatePayPal(email, password, scanner)) {
             return new PayPal(email, password, balance);
        }
        return null;
    }

    private static boolean validatePayPal(String email, String password, Scanner scanner) {
        Pattern pattern = Pattern.compile(".*\\d{2,}.+");
        Matcher matcher = pattern.matcher(email);
        boolean validateEmail = matcher.find();
        boolean emailIsValid = email.length() > 10 && validateEmail;
        boolean passwordIsValid = password.length() > 5;
        if (!emailIsValid) {
            System.out.print("Your email is not valid! It shouldn't be empty, with length greater than 10 and at least 2 digits!Please enter again: ");
            email = scanner.nextLine();
            validatePayPal(email, password, scanner);
        } else if (!passwordIsValid) {
            System.out.print("Your password is not valid! It shouldn't be empty and at least 6 symbols! Please enter again: ");
            password = scanner.nextLine();
            validatePayPal(email, password, scanner);
        } else {
            System.out.print("Your card is valid!");
            return true;
        }
        return true;
    }

    private static boolean validateCreditCard(String cardNumber, String cardHolder, String expire, String cvv, Scanner scanner) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate expireDate = LocalDate.parse(expire, formatter);
        boolean isExpired = expireDate.isAfter(LocalDate.now());
        boolean cardNumberIsValid = cardNumber.length() == 16;
        boolean cardHolderIsValid = !cardHolder.isEmpty();
        boolean cvvIsValid = cvv.length() == 3;
        if (!isExpired) {
            System.out.print("Your card has expired. Use another card or another payment method!");
            return false;
        } else if (!cardHolderIsValid) {
            System.out.print("You haven't entered information for the card holder! Please enter your name: ");
            cardHolder = scanner.nextLine();
            validateCreditCard(cardNumber, cardHolder, expire, cvv, scanner);

        } else if (!cardNumberIsValid) {
            System.out.print("You have entered wrong numbers for the card! Try again:");
            cardNumber = scanner.nextLine();
            validateCreditCard(cardNumber, cardHolder, expire, cvv, scanner);
        } else if (!cvvIsValid) {
            System.out.print("The cvv is wrong! Fill it again.");
            cvv = scanner.nextLine();
            validateCreditCard(cardNumber, cardHolder, expire, cvv, scanner);
        } else {
            System.out.print("All information for the card is validated! You can pay your order.");
            return true;
        }
        return true;
    }

    private static void makePurchaseWithPayPal(ShoppingCart shoppingCart,InventoryManagement inventoryManagement,PayPal payPal) {
        double billToPay = shoppingCart.bill();
        if(payPal.processPayment(billToPay,shoppingCart)){
            inventoryManagement.removeQuantities(shoppingCart);
        }else {
            returnAllItems(shoppingCart,inventoryManagement);
        }
    }
    private static void makePurchaseWithCreditCard(ShoppingCart shoppingCart,InventoryManagement inventoryManagement,CreditCard creditCard){
        double billToPay = shoppingCart.bill();
        if(creditCard.processPayment(billToPay,shoppingCart)){
            inventoryManagement.removeQuantities(shoppingCart);
        }else {
            returnAllItems(shoppingCart,inventoryManagement);
        }
    }


    private static void returnAllItems(ShoppingCart shoppingCart, InventoryManagement inventoryManagement) {
        List<InventoryItem> cart = shoppingCart.getCart();
        for (InventoryItem itemInCart : cart) {
            InventoryItem itemToReturn = inventoryManagement.getItemByName(itemInCart.getName());

            // Restore quantity
            itemToReturn.setQuantity(itemInCart.getQuantity() + itemToReturn.getQuantity());

            // Restore weight if the item is a GroceryItem
            if (itemInCart instanceof GroceryItem && itemToReturn instanceof GroceryItem) {
                double weightInCart = ((GroceryItem) itemInCart).getWeight();
                double weightInInventory = ((GroceryItem) itemToReturn).getWeight();
                ((GroceryItem) itemToReturn).setWeight(weightInInventory + weightInCart);
            }
        }
        // Clear the shopping cart after returning items to inventory
        cart.clear();
    }

}