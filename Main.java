package OtherFiles;
public class Main {
public static void main (String [] args) {
	ProductServices s = new ProductServices();
	
	Product p1 = new Product("Grey F15","laptop","Black Desk",2021);
	Product p2 = new Product("macbook","laptop","Drawer",2030);
	Product p3 = new Product("Black Redmi Note 9","Phone","pocket",2025);
	Product p4 = new Product("Hp inkjet","printer","White Desk",2013);
	Product p5 = new Product("Black portronic","Keyboard","Computer table",2013);
	Product p6 = new Product("Wireless Gaming Mouse","Mouse","Black Computer Table",2020);
	Product p7 = new Product("White Sujata","Mixer","Kitchen",2010);
	Product p8 = new Product("Orient","Table Fan","Bedside",2021);
	Product p9 = new Product("Black Whirpool","printer","",2023);
	
	// I prefer adding products this way
	s.addProduct(p1);
	s.addProduct(p2);
	s.addProduct(p3);
	s.addProduct(p4);
	s.addProduct(p5);
	s.addProduct(p6);
	s.addProduct(p7);
	s.addProduct(p8);
	s.addProduct(p9);
	
	// Print all the products
//	s.getAllProducts();
	
	// Get specific product 
//	s.getProduct("Grey F15");
	
	//Searching
	s.getProductWithText("Black");
//	s.getProductWithTextStream("Black");
	
	//Search By Place
//	s.getProductWithPlace("Drawer");
	
	//Check Out of warranty products
//	s.checkOutOfWarranty(2023);
}}
