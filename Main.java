package OOP;
import java.util.Scanner;
public class Main{

public static void main(String[] args){

Order order = new Order();

Product phone = new Phone("Samsung s6 edge", 322, 12000, "This is a smart samsung phone", "Phone");
Product laptop = new Laptop("Del i5core", 223, 200000, "This is s smart Del laptop gen5", "Laptop");
Product phone1 = new Phone("Nokia", 342, 120000, "This is a powerful Nokia phone", "Phone");
Product phone2 = new Phone("Iphone 13", 122, 17000, "This is the latest version of Iphone", "Phone");

order.addNewProduct(phone);
order.addNewProduct(laptop);
order.addNewProduct(phone2);
order.addNewProduct(phone1);

Scanner n = new Scanner(System.in);

Client client = new Client(order);

//Client cl = new Client("Big Fred", 02, order);

//cl.addToCart(322);

client.placeOrder();
//client.addToCart(342);
//client.removeFromCart(223);


//order.showAllProduct();

//order.findProduct("hone");

}

}
