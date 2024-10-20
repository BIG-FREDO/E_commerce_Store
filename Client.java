package E_commerce_Store;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Client{

private String clientName;
private int id;
private Order order;

public Client(Order order ){

this.clientName = "";
this.id = 00;
this.order = order;

}

public void setClientName(){
Scanner n = new Scanner(System.in);
	System.out.print("\nEnter Your Name: " );
	this.clientName = n.nextLine();
}

public String getClientName(){
	return this.clientName;
}


public int getClientId(){

	return id += (int) (Math.random() * 11);
}

public void addToCart(){

	order.addToCart();
}


public void makePayment(){

Scanner n = new Scanner(System.in);

setClientName();
System.out.println("Your Id: CL" + getClientId());

do{
System.out.print("\nMake payment: $" );
double input = n.nextDouble();

if((order.getTotal() - input) == 0){
        System.out.println("\nYou have completed your payment. Order placed successfully\n");
break;
}
else if((order.getTotal() - input) != 0){
        System.out.println("Payment not completed try again");
	System.out.println("TOTAL PRICE TO BE PAID: " + order.getTotal());
}
else if(input > order.getTotal()){
	System.out.println("Please check your total bill and enter the right amount");
	System.out.println("TOTAL PRICE TO BE PAID: " + order.getTotal());
}

}
while(1 != 0);
}


public void placeOrder(){

Scanner n = new Scanner(System.in);

System.out.println("You are welcome to Fredo's store!.\nWe sell electronic devices such as Laptops and cell Phones. \nPlease feel free to go through our app to find out what you need :)");
do{

        System.out.print("\nEnter your option below.\n1)-Add product to cart.\n2)-View Cart.\n3)-Remove Product from cart.\n4)-Place Order. \n5-Exit App.\nEnter option 1/2/3/4/5: ");
        String input = n.nextLine();

        if(input.equalsIgnoreCase("1")){

                addToCart();
        }
        else if(input.equalsIgnoreCase("2")){

		 order.viewCart();
        }
        else if(input.equalsIgnoreCase("3")){

                order.removeFromCart();
        }
        else if(input.equalsIgnoreCase("4")){

                if(order.getCart().isEmpty()){
                        System.out.println("CART IS EMPTY");
                }
                else {
                        makePayment();
                }

        }
        else if(input.equalsIgnoreCase("5")) {

                System.out.println("\nThanks For Using Our Application"); break;

        }
        else { System.out.println("\nInvalid Input\n"); continue;}

}
while(1 != 0);



}

}

