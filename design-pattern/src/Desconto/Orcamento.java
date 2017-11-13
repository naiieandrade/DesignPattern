package Desconto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Orcamento {

	private double valor;
	private List<Item> itens;

	public Orcamento(double valor) {
		this.valor = valor;
		this.itens = new ArrayList<Item>();
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public List<Item> getItens() {
		return itens;
	}

	// public List<Item> getItens() {
	// return Collection.unmodifiableList(itens);
	// }
	public void adicionaItem(Item item) {
		itens.add(item);
	}

}
