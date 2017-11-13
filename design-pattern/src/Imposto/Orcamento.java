package Imposto;
import java.util.ArrayList;
import java.util.List;

public class Orcamento {
	
	private final double valor;
	private final List<Item> itens;

	public Orcamento(double valor) {
		this.valor = valor;
		itens = new ArrayList<Item>();
	}
	
	public double getValor() {
		return valor;
	}

	public List<Item> getItens() {
		return itens;
	}
	
	
	
}
