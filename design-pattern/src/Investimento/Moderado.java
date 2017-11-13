package Investimento;

public class Moderado implements Investimento{

	@Override
	public double calcula(Conta conta) {
		boolean escolhido = new java.util.Random().nextDouble() > 0.5;
		Double valor = 0.0;
		
		if (escolhido)
			valor = conta.getSaldo()*0.025;
		else
			valor = conta.getSaldo()*0.007;
		return valor;
	}

}
