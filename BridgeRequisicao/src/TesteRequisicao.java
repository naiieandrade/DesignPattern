
public class TesteRequisicao {

	public static void main(String[] args) {
		ClienteUm clienteUm = new ClienteUm("123", "enviando a requisicao do cliente");
		clienteUm.fazerRequisicao();
		
		ServidorUm servidorUm = new ServidorUm();
		servidorUm.faz(clienteUm);
	}

}
