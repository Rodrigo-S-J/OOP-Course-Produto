package Application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner (System.in);
		
		Product product = new Product();
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		product.name = leitor.next();
		System.out.print("Price: ");
		product.price = leitor.nextDouble();
		System.out.print("Quantity in stock: ");
		product.quantity = leitor.nextInt();
		
		
		
		System.out.println(product);
		
						
		leitor.close();
	}

}
