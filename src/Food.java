public class Food extends Product{
    String expirationDate;

    public Food(int quantity, double price, String name, String expirationDate) {
        super(quantity, price, name);
        this.expirationDate = expirationDate;
    }

    @Override
    public void displayInfo(){
        System.out.println("-----------------------------------------------------");
        System.out.println("Product name: " + this.name);
        System.out.println("Product price: $" + this.price);
        System.out.println("Product quantity: " + this.quantity);
        System.out.println("Expiration date: " + this.expirationDate);
    }
}
