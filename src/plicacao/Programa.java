package plicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

import entidades.Product;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
//expressão lambda declarada
        //remover da lista quem tiver o preço 100 ou mais
		
		Predicate<Product> pred = p -> p.getPreco() >= 100.0;
		list.removeIf(pred);
		for(Product p : list) {
			System.out.println(p);
		}
	}

}
