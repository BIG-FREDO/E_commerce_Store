package OOP;

public class Product{

private String productName;
private int productId;
private double productPrice;
private String productDescription;
private String productType;

public Product(String name,int id, double productPrice, String description, String type){

this.productName = name;
this.productId = id;
this.productPrice = productPrice;
this.productDescription = description;
this.productType = type;
}

public void setName(String name){
        this.productName = name;
 }

public String getName(){
return this.productName;
}

public void setId(int id){
this.productId = id;
}

public int getId(){
return this.productId;
}

public void setPrice(double price){
        this.productPrice = price;
}

public double getPrice(){
return this.productPrice;
}

public void setDescription(String description){
        this.productDescription = description;
}

public String getDescription(){
return this.productDescription;
}

public void setType(String type){
	this.productType = type;
}

public String getType(){
return this.productType;
}

public String toString(){
String s = "\nProdcut name: " + getName() + "\nPhone ID: " + getId() + " \nThe Phones Price: " +  getPrice() + "\nDescription: " + getDescription();
return s;
}

}

class Phone extends Product{

public Phone(String name,int id, double productPrice, String description, String type){
super(name, id, productPrice, description, type);

}

@Override
public String toString(){

return "Product Type: " + getType() + super.toString();

}
}

class Laptop extends Product{

public Laptop(String name,int id, double productPrice, String description, String type){
super(name, id, productPrice, description, type);

}

@Override
public String toString(){

return "Product Type: " + getType() + super.toString();
}
}
