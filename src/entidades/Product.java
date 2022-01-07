package entidades;

public class Product {
	private String nome;
	private Double preco;
	
	public Product(String nome, Double preco) {
		
		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
		
		
	}
	
	public static boolean staticProdPred (Product p) {
		return p.getPreco() >= 100.0;
	}
	//trabalha sem argumento com o proprio  atributo do objeto onde estou
	
	public  boolean nonStaticProdPred () {
		return preco >= 100.0;
	}


	@Override
	public String toString() {
		return nome  + ", " + String.format("%.2f", preco);
	}

	
	


}
