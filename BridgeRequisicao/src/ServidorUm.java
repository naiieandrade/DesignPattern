
public class ServidorUm extends Servidor {

	private String ipS = "456S1";
	private String mensagemS = "mensagem recebida";
	
	
	
	@Override
	void faz(Cliente cliente) {
		System.out.println("A mensagem foi recebida pelo ip: " + this.ipS );
		cliente.fazerRequisicao();
		System.out.println("A mensagem éh " + this.mensagemS + "\n");
		
	}

}
