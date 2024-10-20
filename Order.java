package E_commerce_Store;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Order{

private List<Product> products;
private boolean isAvailable;
private List<Product> cart;
private double total;

public Order(){

this.products = new ArrayList<>();
this.isAvailable = false;
this.cart = new ArrayList<>();
this.total = 0;

}


public Product addToCart(){

showAllProduct();
Scanner n = new Scanner(System.in);

Product productToAdd = null;

System.out.print("\nTo add product to cart, Enter product Id: ");
int id = n.nextInt();

for(int i = 0; i < products.size(); i++){
	if(products.get(i).getId() == id){
		productToAdd = products.get(i);
		cart.add(products.get(i));
		total += products.get(i).getPrice();
		System.out.println("\nThis product " + products.get(i).getName() + "was added successfully\n");

			if(productToAdd != null) {
				removeProduct(id);
			}
			else{ System.out.println("The was an error adding this product to cart"); }
}
else if(products.get(i).getId() != id) {
	continue;
}

}


System.out.println("\nTOTAL PRICE: $" + total);
return productToAdd;
}


public Product removeFromCart(){
Scanner n = new Scanner(System.in);

Product productToRemove = null;

if(!cart.isEmpty()){

System.out.print("To Remove, Enter product Id: ");
int id = n.nextInt();

for(Product p : cart){
	if(p.getId() == id){
		productToRemove = p;
		cart.remove(p);
		total -= p.getPrice();
		if(productToRemove != null){
			System.out.println("\nThis product was removed successfully: " + p.getName() + " " + p.getId() + "\n");
		}
		else{ System.out.println("Product not removed"); }
	}
}
}
else {
	System.out.println("\nCART IS EMPTY!");
}

System.out.println("TOTAL PRICE: $" + total);
return productToRemove;
}


public void viewCart(){

if(!cart.isEmpty()){
	for(Product p : cart){
		System.out.println("---" + p.toString() + ".\n==============================\n");

	}

System.out.println("TOTAL PRICE: $" + total);
}
else{ System.out.println("\nCART IS EMPTY"); }

}



public boolean addNewProduct(Product product){

return products.add(product);

}



public boolean removeProduct(int id){

Product productToRemove = null;
for(Product product: products){
	if(product.getId() == id){
		productToRemove = product;
	}
}
return products.remove(productToRemove);

}



public void findProduct(String type){

Product search = null;

System.out.println("\n=====AVAILABLE SEARCH=====\n");
for(Product product : products){
	if(product.getType().equalsIgnoreCase(type)){
		search = product;
		System.out.println(product.toString());
		System.out.println();
	}

}
if(search == null){
	System.out.println("\nNot Found\n");

}

}

public void showAllProduct(){

for(int i = 0; i < products.size(); i++){
	System.out.println("\n=============================================\n" + products.get(i).toString());
	System.out.println();
}

}

public List<Product> getProducts(){

return products;

}
public List<Product> getCart(){

return cart;
}

public boolean isAvailable(int id){

for(Product p : products){
	if(p.getId() == id){
		 isAvailable = true;
	}
	else{ this.isAvailable = false; }

}
return isAvailable;
}


public double getTotal(){

	return this.total;
}
}


