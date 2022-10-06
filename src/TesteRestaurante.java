import java.util.Scanner;

public class TesteRestaurante {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Restaurante Martins");

		System.out.println("Nome do Cliente: ");
		String novoCliente = scanner.nextLine();

		Pedido novoPedido = new Pedido(novoCliente);
		int menu;
		do {
			System.out.println("____________Menu____________");
			System.out.println("Qual seu pedido [1]Lanche [2]Bebida [3]Adicionar Taxa de Serviço [4] Finalizar pedido");
			menu = scanner.nextInt();

			switch (menu) {
			case 1:
				System.out.println("Qual lanche você deseja adicionar ao pedido?");
				String tipoLanche = scanner.next();
				System.out.println();
				System.out.println("Qual o preço do lanche?");
				double precoLanche = scanner.nextDouble();
				System.out.println();
				System.out.println("Qual o peso do lanche");
				int pesoLanche = scanner.nextInt();
				System.out.println();
				System.out.println("Ingrediente Lanche escolhido");
				String ingredienteLanche = scanner.next();

				Lanche novoLanche = new Lanche(pesoLanche, ingredienteLanche, precoLanche, tipoLanche);
				novoPedido.getItensConsumidos().add(novoLanche);

				//novoPedido.adicionarItem(novoLanche);

				break;
			case 2:
				System.out.println("Nome da bebida");
				String nomeBebida = scanner.next();
				System.out.println("Qual preço da bebida?");
				double precoBebida = scanner.nextDouble();
				System.out.println();
				System.out.println("Quantos ml tem a bebida?");
				int volumeBebida = scanner.nextInt();
				System.out.println();
				System.out.println("Bebida alcoolica [1]Sim [2]Não");
				int temAlcool = scanner.nextInt();
				System.out.println("Qual sua idade?");
				int idade = scanner.nextInt();

				if (temAlcool == 1 && idade <18) {
					System.out.println("Não pode comprar bebida alcoolica!");
				} else {
					System.out.println("Pode comprar bebida alcoolica");
				}

				Bebida novaBebida = new Bebida(precoBebida,nomeBebida, volumeBebida, temAlcool == 1);
				novoPedido.getItensConsumidos().add(novaBebida);
				break;

			case 3:
				System.out.println("Deseja não adicionar a taxa de serviço de 3% ao seu pedido [1]Sim [2]não");
				int valorTaxa = scanner.nextInt();
				if (valorTaxa == 1) {
					novoPedido.taxaDeServico = true;
				} else {
					novoPedido.taxaDeServico = false;

				}
				break;
			case 4:
				System.out.println("Fechar o pedido ");
				novoPedido.gerarFatura();
				break;
			}

		} while (menu < 4);
		scanner.close();
	}
}
   