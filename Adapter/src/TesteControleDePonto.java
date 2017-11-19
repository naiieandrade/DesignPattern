
public class TesteControleDePonto {
	
	public static void main(String[] args) throws InterruptedException {
		ControleDePonto controleDePonto = new ControleDePontoAdapter();
		Funcionario f = new Funcionario("Marcelo Fariades");
		controleDePonto.registraEntrada(f);
		Thread.sleep(3000);
		controleDePonto.registraSaida(f);
	}

}
