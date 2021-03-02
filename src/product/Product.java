package product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import productservice.ProductService;

public class Product {
	public Product(String skuId) {
		super();
		this.skuId = skuId;
		ProductService productService=new ProductService();
		productService.getPriceByType(this);
	}
	public String skuId;
	public int price;

	public String getSkuId() {
		return skuId;
	}
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	

	public static void main(String args[]) {
		List<Product> products = new ArrayList<Product>();
		Scanner in = new Scanner(System.in); 
		System.out.println("total number of order");
		String s = in.nextLine(); 

		int a = Integer.parseInt(s);
		for (int i = 0; i < a; i++)
		{                
			System.out.println("enter the type of product:A,B,C or D");
			String type= in.nextLine(); 
			Product p = new Product(type);
			products.add(p);
		}
		ProductService productService=new ProductService();
		int totalPrice = productService.getTotalPrice(products);
		System.out.println(totalPrice);
	}
}
