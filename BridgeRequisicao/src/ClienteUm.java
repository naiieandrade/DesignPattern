
public class ClienteUm extends Cliente {

	private String ip;
	private String mensagem;
	
	public ClienteUm (String ip, String mensagem) {
		this.ip = ip;
		this.mensagem = mensagem;
	}
	
	@Override
	public void fazerRequisicao() {
		System.out.println("Requisicao feita pelo ip: " + this.ip);
		System.out.println("Com a mensagem: " + this.mensagem + "\n");
		
	}

}
