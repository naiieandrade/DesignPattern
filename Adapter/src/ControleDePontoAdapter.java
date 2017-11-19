
public class ControleDePontoAdapter extends ControleDePonto {
	private ControleDePontoNovo controleDePontoNovox;
	
	public ControleDePontoAdapter() {
		this.controleDePontoNovox = new ControleDePontoNovo();
	}
	
	public void registraEntrada(Funcionario f) {
		this.controleDePontoNovox.registra(f, true);
	}
	
	public void registraSaida(Funcionario f) {
		this.controleDePontoNovox.registra(f, false);
	}

}
