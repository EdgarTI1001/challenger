package domain;

public class Carteira {

	private double valor;

	public Carteira() {
	}

	public Carteira(double valor) {
		this.valor = valor;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Carteira [valor=" + valor + "]";
	}

}
