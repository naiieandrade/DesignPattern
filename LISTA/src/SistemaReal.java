
public class SistemaReal implements Sistema {


	@Override
	public void retornaUrl() {
		System.out.println("Segue a URL correspondente\nhttp://teste.com");		
	}

	@Override
	public void mostrarServicos(int intServico) {
		System.out.println("Escolhendo o servico " + intServico + "...");		
	}

	@Override
	public void escolherArquivo(String arquivo) {
		System.out.println("Selecionado o arquivo " + arquivo + "!");		
	}

}
