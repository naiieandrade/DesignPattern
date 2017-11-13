package Investimento;

public class Arrojado implements Investimento{

	@Override
	public double calcula(Conta conta) {
		double escolhido = new java.util.Random().nextDouble();
		double valor = 0.0;
		
		if (escolhido <= 0.2)
			valor = conta.getSaldo()*0.05;
		else if(escolhido > 0.2 && escolhido <=0.5)
			valor = conta.getSaldo()*0.03;
		else if(escolhido > 0.5)
			valor = conta.getSaldo()*0.06;
		return valor;
	}

}
