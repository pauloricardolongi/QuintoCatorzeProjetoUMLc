package plicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import auxiliar.ProductPredicado;
import entidades.Product;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

        //remover da lista quem tiver o pre�o 100 ou mais
		list.removeIf(Product::nonStaticProdPred);
		for(Product p : list) {
			System.out.println(p);
		}
	}

}
