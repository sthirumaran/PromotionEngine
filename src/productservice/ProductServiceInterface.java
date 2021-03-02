package productservice;

import java.util.List;

import product.Product;

public interface ProductServiceInterface {
	
		void getPriceByType(Product product);
		int  getTotalPrice(List<Product> products);
		
}
