public class Electronics extends Product{
    String brand;
    int warranty;

    public Electronics(int quantity, double price, String name, String brand, int warranty) {
        super(quantity, price, name);
        this.brand = brand;
        this.warranty = warranty;
    }

    @Override
    public void displayInfo(){
        System.out.println("-----------------------------------------------------");
        System.out.println("Product name: " + this.name);
        System.out.println("Product price: $" + this.price);
        System.out.println("Product quantity: " + this.quantity);
        System.out.println("Brand: " + this.brand);
        System.out.println("Warranty: " + this.warranty + " years.");
    }
}
