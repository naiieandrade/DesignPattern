package Investimento;

public class RealizadorDeInvestimentos {
	
	public void realiza (Conta conta, Investimento investimento) {
		double resultado = investimento.calcula(conta);
		
		conta.deposita(resultado*0.75);
		System.out.println("Novo saldo: " + conta.getSaldo());
	}
//
//	public static void main(String[] args) {
//		Investimento conservador = new Conservador();
//		Investimento moderado = new Moderado();
//		Investimento arrojado = new Arrojado();
//		
//		Conta conta = new Conta();
//		conta.deposita(1000.0);
//		
//		double valor = 0.0;
//		
//		valor = conservador.calcula(conta);
//		System.out.println(valor);
//		
//
//	}

}
