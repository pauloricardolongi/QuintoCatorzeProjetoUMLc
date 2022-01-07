package auxiliar;

import java.util.function.Predicate;

import entidades.Product;

public class ProductPredicado implements Predicate <Product> {

	@Override
	public boolean test(Product p) {
		
		return p.getPreco() >= 100.0;
	}

}
