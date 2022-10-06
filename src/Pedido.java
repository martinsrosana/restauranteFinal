import java.util.ArrayList;

public class Pedido {

	private String nomeCliente;
	private ArrayList<Item> itensConsumidos = new ArrayList<Item>();
	public boolean taxaDeServico;

	public Pedido(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public void adicionarItem(Item item) {
		this.itensConsumidos.add(item);
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public ArrayList<Item> getItensConsumidos() {
		return itensConsumidos;
	}

	public void setItensConsumidos(ArrayList<Item> itensConsumidos) {
		this.itensConsumidos = itensConsumidos;
	}

	public boolean isTaxaDeServico() {
		return taxaDeServico;
	}

	public void setTaxaDeServico(boolean taxaDeServico) {
		this.taxaDeServico = taxaDeServico;
	}

	public double calcularTotal() {
		double resultado = 0;
		for (int i = 0; i < itensConsumidos.size(); i++) {
			Item item = itensConsumidos.get(i);
			resultado = resultado + item.getPreco();
		}
		double taxa = 0;

		if (taxaDeServico) {
			taxa = resultado * 1.3;

			return taxa;
		} else {
			return resultado;
		}

	}

	public void gerarFatura() {
		System.out.println("_____Cupom Fiscal_______");
		System.out.println(" Fatura da cliente" + nomeCliente);

		for (int i = 0; i < itensConsumidos.size(); i++) {
			Item item = itensConsumidos.get(i);

			System.out.println(item.getNome() + " " + item.getPreco());

		}
		System.out.println(calcularTotal());

	}
}
