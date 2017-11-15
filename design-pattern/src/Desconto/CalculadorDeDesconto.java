package Desconto;
//Testando git
public class CalculadorDeDesconto {
	
	public double calcula (Orcamento orcamento) {
		//double desconto = new DescontoPorMaisDeCincoItens().desconta(orcamento);
		
		Desconto d1 = new DescontoPorMaisDeCincoItens();
	//	Desconto d2 = new DescontoPorMaisDeQuinhentosReais();
		Desconto d3 = new SemDesconto();
		
	//	d1.setProximo(d2);
		//d2.setProximo(d3);
		
		return d1.desconta(orcamento);
		
	}

}
