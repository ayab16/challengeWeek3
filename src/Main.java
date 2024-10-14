public class Main {
    public static void main(String[] args) {
//        instantiation
        Electronics phone = new Electronics(10, 99, "iPhone 15 PRO MAX", "iPhone", 5);
        Food pizza = new Food(38, 39.99, "Margarita", "15-10-2024");
        Product pen = new Product(190, 0.99 , "BIC");

//  display info
        phone.displayInfo();
        pizza.displayInfo();
        pen.displayInfo();
// update phone quantity

        phone.updateQuantity(10);
        phone.updateQuantity(5,true);
//  display info
        phone.displayInfo();



    }
}