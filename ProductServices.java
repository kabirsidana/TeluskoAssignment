package OtherFiles;
import java.util.List;
import java.util.ArrayList;
public class ProductServices {
	List<Product> prod = new ArrayList<Product>();
	
	//Add Product
	public void addProduct(Product p){ 
		prod.add(p);
	}
	
	//Remove Product
	public void removeProduct(Product p){ 
		prod.remove(p);
	}
	
	public void getAllProducts() {
		for(Product pp:prod) {
			System.out.println(pp);			
		}
	}
	
	// I used equalIgnoreCase rather than converting into lowerCase
	public Product getProduct(String s) {
		for(Product pp:prod) {
			if(pp.getName().equalsIgnoreCase(s)) {
				System.out.println(pp);
				return pp;
			}
		}
		return null;
		
	}

	// I did not make a seprate list , i directly printed it
	public void getProductWithText(String str) {
		String string=str.toLowerCase();
		for(Product pp:prod) {
			
			String name =pp.getName().toLowerCase();
			String type =pp.getType().toLowerCase();
			String place =pp.getPlace().toLowerCase();
			
			
			if(name.contains(string)|| place.contains(string)||type.contains(string)) {
				System.out.println(pp);
			}
		
	}
}

	public void getProductWithPlace(String str) {
		
		String string=str.toLowerCase();
		for(Product pp:prod) {
			
	
			String place =pp.getPlace().toLowerCase();
			
			
			if( place.contains(string)){
				System.out.println(pp);
			}
		
	}
	}

	public void checkOutOfWarranty(int i) {
		System.out.println("The Out of Warranty Products Are -: ");
	
		for(Product pp:prod) {
			
			
			if( pp.getWarranty()<2023){
				System.out.println(pp);
			}
		
	}
	}
	
	public void getProductWithTextStream(String str) {
	    String string = str.toLowerCase();
	    
	    prod.stream()
	        .filter(pp -> {
	            String name = pp.getName().toLowerCase();
	            String type = pp.getType().toLowerCase();
	            String place = pp.getPlace().toLowerCase();
	            
	            return name.contains(string) || place.contains(string) || type.contains(string);
	        })
	        .forEach(System.out::println);
	}
}
