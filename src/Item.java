
public abstract class Item {
	private double preco;
	private String nomeItem;

	public Item(double preco, String nomeItem) {
		this.preco = preco;
		this.nomeItem = nomeItem;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getNome() {
		return nomeItem;
	}

	public void setNome(String nome) {
		this.nomeItem = nome;
	}

}
