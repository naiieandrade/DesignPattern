package Imposto;

public class CalculadorDeImposto {

	public void realizaCalculo(Orcamento orcamento, Imposto impostoQualquer) {
			double valor = impostoQualquer.calcula(orcamento);
			System.out.println(valor);		
		
	}
}
