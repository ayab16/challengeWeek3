public class Product {
    protected String name;
    protected double price;
    protected int quantity;

    public Product() { }

    public Product(int quantity, double price, String name) {
        this.quantity = quantity;
        this.price = price;
        this.name = name;
    }

    //    Displays product details.
    public void displayInfo(){
        System.out.println("-----------------------------------------------------");
        System.out.println("Product name: " + this.name);
        System.out.println("Product price: $" + this.price);
        System.out.println("Product quantity: " + this.quantity);
    }
//    Updates the product quantity
    public void updateQuantity(int newQuantity){
        this.quantity = newQuantity;
        System.out.println("Quantity updated successfully..!");
    }

// Adds to the existing quantity.
    public void updateQuantity(int addedQuantity, boolean addToExisting) {
        if(addToExisting){
            this.quantity += addedQuantity;
        }else
            updateQuantity(addedQuantity);
        System.out.println("Quantity updated successfully..!");
    }

//    Returns the price of the product.
    public double getPrice() {
        return price;
    }

//   Prints a welcome message for the inventory system.
    public static void welcomeMessage(){
        System.out.println("Hello, welcome to the inventory system!");
    }

}
