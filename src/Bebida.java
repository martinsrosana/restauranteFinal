
public class Bebida extends Item {
	private int volume;
	private boolean bebidaAlcoolica;

	public Bebida(double preco, String nomeItem, int volume, boolean bebidaAlcoolica) {
		super(preco, nomeItem);
		this.volume = volume;
		this.bebidaAlcoolica = bebidaAlcoolica;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public boolean isBebidaAlcoolica() {
		return bebidaAlcoolica;
	}

	public void setBebidaAlcoolica(boolean bebidaAlcoolica) {
		this.bebidaAlcoolica = bebidaAlcoolica;
	}

}
