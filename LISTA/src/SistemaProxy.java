
public class SistemaProxy implements Sistema {

	private boolean usuarioAtivo = false;
	
	private Sistema sistema;
	
	//SistemaReal sistemaReal = new SistemaReal();
	
	public SistemaProxy(Sistema sistema) {
		this.sistema = sistema;
	}
	
	public void validaUsuario(boolean usuarioAtivo) {
		if(usuarioAtivo) {
			this.sistema.retornaUrl();
		} else {
			System.out.println("Não permitido");
		}
	}
	
	@Override
	public void mostrarServicos(int intServico) {
		//System.out.println("Escolhendo o servico " + intServico + "...");
		this.sistema.mostrarServicos(intServico);
	}

	@Override
	public void escolherArquivo(String arquivo) {
		//System.out.println("Selecionado o arquivo " + arquivo + "!");
		this.sistema.escolherArquivo(arquivo);
	}

	@Override
	public void retornaUrl() {
		//System.out.println("Segue a URL correspondente");
		this.sistema.retornaUrl();
	}

}
